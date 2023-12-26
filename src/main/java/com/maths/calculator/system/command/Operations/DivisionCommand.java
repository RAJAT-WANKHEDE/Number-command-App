package com.maths.calculator.system.command.Operations;

import com.maths.calculator.system.command.Command;
import com.maths.calculator.system.command.validator.CommandValidator;
import com.maths.calculator.system.model.Result;

public class DivisionCommand implements Command, CommandValidator {
    @Override
    public Result execute(String[] attributes) throws Exception {
        if (validate(attributes)){
            double div = Double.valueOf(attributes[0]);
            for(int i = 1 ; i< attributes.length;i++){
                div /= Double.valueOf(attributes[i]);
            }
            return Result.builder().message("Division of given numbers : ").result(div).build();
        }
        return Result.builder().message("Please try again !").build();
    }

    @Override
    public boolean validate(String[] attributes) throws Exception {
        if (attributes.length<2){
            throw new Exception("Enter two or more numbers to Divide !");
        }
        for (String number : attributes){
            if(Integer.valueOf(number)==0){
                throw new Exception("Zero value not allow for division !");
            }
        }
        return true;
    }
}
