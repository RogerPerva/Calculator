package com.baeldung.calculatorproject.CalculatorConfiguration;

import com.baeldung.calculatorproject.CalculatorOperations.MinusOperation;
import com.baeldung.calculatorproject.CalculatorOperations.SumOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Here we need to create the beans that Spring with add to the container
//For that we need to at the annotation configuration as below.
@Configuration
public class CalculatorConfig {

    //Then we need to add the bean, in this case is SumOperation that is our first bean.
    @Bean
    public SumOperation sumOperation() {
        return new SumOperation();
    }

    //And our second bean is Minus Operation
    @Bean
    public MinusOperation minusOperation() {
        return new MinusOperation();
    }

    //Here we did not create the other beans such as Multiply or divide because we already
    //create those beans with @Component

}
