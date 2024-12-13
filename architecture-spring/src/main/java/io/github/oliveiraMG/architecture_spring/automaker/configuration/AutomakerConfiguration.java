package io.github.oliveiraMG.architecture_spring.automaker.configuration;

import io.github.oliveiraMG.architecture_spring.automaker.Engine;
import io.github.oliveiraMG.architecture_spring.automaker.MotorType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AutomakerConfiguration {

    @Bean(name = "aspiratedEngine")
    public Engine aspiratedEngine() {
        var motor = new Engine();
        motor.setCylinders(4);
        motor.setMotorType(MotorType.ASPIRATED);
        motor.setLiters(1.8);
        motor.setHorsePower(140);
        motor.setModel("L18Z1");
        return motor;
    }

    @Bean(name = "electricEngine")
    @Primary
    public Engine electricEngine() {
        var motor = new Engine();
        motor.setCylinders(0);
        motor.setMotorType(MotorType.ELECTRIC);
        motor.setLiters(0.0);
        motor.setHorsePower(200);
        motor.setModel("E200");
        return motor;
    }

    @Bean(name = "turboEngine")
    public Engine turboEngine() {
        var motor = new Engine();
        motor.setCylinders(4);
        motor.setMotorType(MotorType.TURBO);
        motor.setLiters(1.5);
        motor.setHorsePower(180);
        motor.setModel("T15Z1");
        return motor;
    }

}
