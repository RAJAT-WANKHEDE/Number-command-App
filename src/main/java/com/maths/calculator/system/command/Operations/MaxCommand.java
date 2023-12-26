package com.maths.calculator.system.command.Operations;

import com.maths.calculator.system.command.Command;
import com.maths.calculator.system.command.validator.CommandValidator;
import com.maths.calculator.system.model.Result;

public class MaxCommand implements Command, CommandValidator {
    @Override
    public Result execute(String[] attributes) throws Exception {
        if (validate(attributes)){
            int max = 0 ;
            for (String number : attributes){
                max = Math.max(max,Integer.valueOf(number));
            }
            return Result.builder().message("Maximum of given number is : ").result(max).build();
        }
        return Result.builder().message("Please try again !").build();
    }

    @Override
    public boolean validate(String[] attributes) throws Exception {
        if (attributes.length<2){
            throw new Exception("Required two or more numbers to find Maximum !");
        }
        return true;
    }
}
