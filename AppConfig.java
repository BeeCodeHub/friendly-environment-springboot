package com.enviro.assessment.grad001.buwamabasa.enviro_waste_management;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PickupService pickupService() {
        return new PickupService();
    }

//    public PickupController pickupController() {
//        return new PickupController(pickupService());
//    }
}
