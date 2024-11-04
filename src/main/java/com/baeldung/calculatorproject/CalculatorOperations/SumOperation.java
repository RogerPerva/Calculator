package com.baeldung.calculatorproject.CalculatorOperations;


import com.baeldung.calculatorproject.Interface.OperationsInterface;

public class SumOperation implements OperationsInterface {
    @Override
    public double calculate(double a, double b){
        return (a + b);
    }
}
