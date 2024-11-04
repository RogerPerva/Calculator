package com.baeldung.calculatorproject;

import com.baeldung.calculatorproject.CalculatorService.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorprojectApplication implements CommandLineRunner {

	//Added with autowired the depenency CalculatorService that is the brain of the app that we need to run.
	@Autowired
	private CalculatorService calculatorService;

	public static void main(String[] args) {
		SpringApplication.run(CalculatorprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		boolean f = true;
		do{

			System.out.print("Choose the operation: \n add, \n minus, \n multiply, \n divide \n Option: ");
			String operation = scanner.nextLine();

			System.out.print("Enter only the first number: ");
			double num1 = scanner.nextDouble();

			System.out.print("Enter the second number: ");
			double num2 = scanner.nextDouble();

			scanner.nextLine();

			double result = calculatorService.calculate(operation, num1, num2);
			System.out.println("The result is: " + result);

			System.out.print("Do you want to continue?(Yes/No)");
			String continueInput = scanner.nextLine();
			if(continueInput.equalsIgnoreCase("no")){
				f=false;
				break;
			}
		}while(f);

	}
}
