package com.maths.calculator.system.command.Operations;

import com.maths.calculator.system.command.validator.CommandValidator;
import com.maths.calculator.system.model.Result;
import com.maths.calculator.system.command.Command;

public class AddCommand implements Command, CommandValidator {
    @Override
    public boolean validate(String[] attributes) throws Exception {
        if (attributes.length<2){
            throw new Exception("Enter two or more numbers to add !");  //user difine exception
        }
        return true;
    }

    @Override
    public Result execute(String[] attributes) throws Exception {
        if (validate(attributes)){
            int add =0;
            for (String number : attributes){
                add += Integer.valueOf(number);
            }
            return Result.builder().message("Addition of given numbers : ").result(add).build();

        }
        return Result.builder().message("Please try again !").build();
    }
}
