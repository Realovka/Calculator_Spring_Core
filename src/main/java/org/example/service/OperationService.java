package org.example.service;

import org.example.operation.*;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component
public class OperationService {

    private Map<String ,OperationInt> map;

    public OperationService(Map<String, OperationInt> map) {
        this.map = map;
    }

    public Map<String, OperationInt> getMap() {
        return map;
    }

    public void setMap(Map<String, OperationInt> map) {
        this.map = map;
    }
}