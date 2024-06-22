package org.example.behavioral.strategy.operation;

import org.example.behavioral.strategy.Strategy;

public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
