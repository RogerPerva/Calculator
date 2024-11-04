package com.baeldung.calculatorproject.CalculatorOperations;

import com.baeldung.calculatorproject.Interface.OperationsInterface;
import org.springframework.stereotype.Component;

@Component
public class MultiplyOperation implements OperationsInterface {
    @Override
    public double calculate(double a, double b){
        return (a * b);
    }
}
