package org.example.controller;

import org.example.service.HistoryService;
import org.example.service.OperationService;
import org.example.NumbersAndOperation;
import org.example.entity.History;
import org.springframework.stereotype.Component;


@Component
public class OperationController {
    private NumbersAndOperation numbersAndOperation;
    private OperationService operationService;
    private HistoryService historyService;


    public OperationController(NumbersAndOperation numbersAndOperation, OperationService operationService, HistoryService historyService) {
        this.numbersAndOperation = numbersAndOperation;
        this.operationService = operationService;
        this.historyService = historyService;
    }

    public void run() {
        while (true) {
            System.out.println("Для работы с калькулятором нажмите 1");
            System.out.println("Для выхода нажмите любую другую клавишу");
            if (numbersAndOperation.getEnterNumber().equals("1")) {
                Double firstNumber = numbersAndOperation.getFirstNumber();
                Double secondNumber = numbersAndOperation.getSecondNumber();
                String operation = numbersAndOperation.getOperation();
                Double result = operationService.getMap().get(operation).calc(firstNumber, secondNumber);
                System.out.println(result);
                System.out.println(historyService.historyList(new History(firstNumber, secondNumber, operation, result)));
            } else {
                System.exit(0);
            }
        }
    }
}