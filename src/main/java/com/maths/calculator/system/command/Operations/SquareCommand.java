package com.maths.calculator.system.command.Operations;

import com.maths.calculator.system.command.Command;
import com.maths.calculator.system.command.validator.CommandValidator;
import com.maths.calculator.system.model.Result;

public class SquareCommand implements Command, CommandValidator {
    @Override
    public Result execute(String[] attributes) throws Exception {
        if (validate(attributes)){
            for (String number : attributes){
                double sq = Math.pow(Double.valueOf(number),2);
                System.out.println("Square of "+number+" is : "+ (int)sq);
            }
            return Result.builder().message("This are solution for square").build();
        }
        return Result.builder().message("Please try again !").build();
    }

    @Override
    public boolean validate(String[] attributes) throws Exception {
        if (attributes.length<1){
            throw new Exception("Required minimum one number to get square of number!");
        }
        return true;
    }

}
