package org.example.operation;

import org.springframework.stereotype.Component;

@Component
public class Division implements OperationInt{
    @Override
    public Double calc(Double num1, Double num2) {
        return num1 / num2;
    }
}
