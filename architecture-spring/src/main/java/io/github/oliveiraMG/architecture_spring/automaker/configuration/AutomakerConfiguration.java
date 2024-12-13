package io.github.oliveiraMG.architecture_spring.automaker.configuration;

import io.github.oliveiraMG.architecture_spring.automaker.Engine;
import io.github.oliveiraMG.architecture_spring.automaker.MotorType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutomakerConfiguration {

    @Bean
    public Engine engine() {
        var motor = new Engine();
        motor.setCylinders(4);
        motor.setMotorType(MotorType.ASPIRATED);
        motor.setLiters(1.8);
        motor.setHorsePower(140);
        motor.setModel("L18Z1");
        return motor;
    }

}
