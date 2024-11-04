package com.baeldung.calculatorproject.CalculatorService;

import com.baeldung.calculatorproject.CalculatorOperations.DivideOperation;
import com.baeldung.calculatorproject.CalculatorOperations.MinusOperation;
import com.baeldung.calculatorproject.CalculatorOperations.MultiplyOperation;
import com.baeldung.calculatorproject.CalculatorOperations.SumOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Create the service beacuse the service class is the one that will use all the dependencies
//its like the brain
@Service
public class CalculatorService {

    //Delarate the operations here.
    private SumOperation sumOperation;
    private final MinusOperation minusOperation;
    private final MultiplyOperation multiplyOperation;
    private final DivideOperation divideOperation;


    //Setter injection:
    @Autowired
    public void setField(SumOperation sumOperation){
        this.sumOperation = sumOperation;
    }

    //Created a constructor with the operations::: Constructor injection

    public CalculatorService(SumOperation sumOperation, MinusOperation minusOperation,
                             MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        this.sumOperation = sumOperation;
        this.minusOperation = minusOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }

    public double calculate(String operation, double a, double b){
        switch (operation.toLowerCase()) {
            case "add":
                return sumOperation.calculate(a, b);
            case "minus":
                return minusOperation.calculate(a, b);
            case "multiply":
                return multiplyOperation.calculate(a, b);
            case "divide":
                return divideOperation.calculate(a, b);
            default:
                System.out.print("invalid operation");
                return 0;

        }
    }
}
