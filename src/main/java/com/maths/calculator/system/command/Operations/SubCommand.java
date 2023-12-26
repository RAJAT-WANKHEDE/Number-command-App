package com.maths.calculator.system.command.Operations;

import com.maths.calculator.system.command.Command;
import com.maths.calculator.system.command.validator.CommandValidator;
import com.maths.calculator.system.model.Result;

public class SubCommand implements Command, CommandValidator {
    @Override
    public Result execute(String[] attributes) throws Exception {
        if (validate(attributes)){
            int sub = Integer.valueOf(attributes[0]);
            for (int i = 1; i<attributes.length;i++){
                sub -= Integer.valueOf(attributes[i]);
            }
            return Result.builder().message("Substraction of given numbers : ").result(sub).build();
        }
        return Result.builder().message("Please try again !").build();
    }

    @Override
    public boolean validate(String[] attributes) throws Exception {
        if (attributes.length<2){
            throw new Exception("Enter two or more numbers to substract !");
        }
        return true;
    }
}
