package org.example;

import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class NumbersAndOperation {

    public Double getFirstNumber() {
        String num1 = null;
        System.out.println("Введите первое число");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            num1 = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Double.parseDouble(num1);
    }

    public Double getSecondNumber() {
        String num2 = null;
        System.out.println("Введите второе число");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            num2 = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Double.parseDouble(num2);
    }

    public String getOperation() {
        String operation = null;
        System.out.println("Введите операцию");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            operation = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return operation;
    }

    public String getEnterNumber(){
        String enterNumber = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            enterNumber = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return enterNumber;
    }
}
