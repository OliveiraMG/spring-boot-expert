package io.github.oliveiramg.productAPI.repository;

import io.github.oliveiramg.productAPI.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {

    List<Product> findByName(String name);
}
