package io.github.oliveiramg.productAPI.controller;

import io.github.oliveiramg.productAPI.model.Product;
import io.github.oliveiramg.productAPI.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        System.out.println("Product saved: " + product);

        var id = UUID.randomUUID().toString();
        product.setId(id);

        productRepository.save(product);
        return product;
    }

    @GetMapping("/{id}")
    public Product setProductById(@PathVariable("id") String id) {
//        Optional<Product> product = productRepository.findById(id);
//        return product.isPresent() ? product.get() : null;
        return productRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable("id") String id) {
        productRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void updateProductById(@PathVariable("id") String id, @RequestBody Product product) {
        product.setId(id);
        productRepository.save(product);
    }

    @GetMapping
    public List<Product> searchProductByName(@RequestParam("name") String name) {
        return productRepository.findByName(name);
    }
}