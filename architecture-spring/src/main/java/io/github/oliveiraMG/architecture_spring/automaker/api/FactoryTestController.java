package io.github.oliveiraMG.architecture_spring.automaker.api;

import io.github.oliveiraMG.architecture_spring.automaker.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factory")
public class FactoryTestController {

    @Autowired
//    @Qualifier("turboEngine")
    @Electric
    private Engine engine;

    @PostMapping
    public StatusCar startCar(@RequestBody Key key) {
        var car = new HondaHRV(engine);
        return car.ignite(key);
    }

}
