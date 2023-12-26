package com.maths.calculator.system;

import com.maths.calculator.system.command.Command;
import com.maths.calculator.system.command.Operations.*;
import com.maths.calculator.system.model.Result;

import java.util.Scanner;

public class MathCalculator {
    public static void main(String[] args) {
        System.out.println("~~~~~ Welcome to Math Operations Command Terminal ~~~~~\n");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter command: ");
            String commandLine = scanner.nextLine();

            String[] commandParts = commandLine.split(" ");
            String action = commandParts[0];

            Command command = null;

            switch (action.toLowerCase()) {
                case "add":
                    command = new AddCommand();
                    break;
                case "sub":
                    command = new SubCommand();
                    break;
                case "mul":
                    command = new MulCommand();
                    break;
                case "div":
                    command = new DivisionCommand();
                    break;
                case "fact":
                    command = new FactCommand();
                    break;
                case "pal":
                    command = new PalindromeCommand();
                    break;
                case "prime":
                    command = new PrimeCommand();
                    break;
                case "pow":
                    command = new PowerCommand();
                    break;
                case "square":
                    command = new SquareCommand();
                    break;
                case "max":
                    command = new MaxCommand();
                    break;
                case "avg":
                    command = new AvgCommand();
                    break;
                case "even":
                    command = new EvenCommand();
                    break;
                case "odd":
                    command = new OddCommand();
                    break;
                case "exit":
                    System.out.println("Exiting Math Operation Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
                    continue;
            }


            String[] attributes = new String[commandParts.length - 1];

            System.arraycopy(commandParts, 1, attributes, 0, attributes.length);

            try {
                Result result = command.execute(attributes);
                System.out.println(result.message + result.result);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
