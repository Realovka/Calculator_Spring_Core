package org.example;

import org.example.operation.*;
import org.example.service.OperationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;


@Configuration
@ComponentScan("org.example")
public class RootConfiguration {

    @Bean
    public OperationService operationService(OperationInt addition, OperationInt division, OperationInt multiplication, OperationInt subtraction){
        Map<String, OperationInt> operationIntMap = new HashMap<>();
        operationIntMap.put("+", addition);
        operationIntMap.put("-", subtraction);
        operationIntMap.put("*", multiplication);
        operationIntMap.put("/", division);
        return new OperationService(operationIntMap);
    }

}
