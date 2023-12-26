package com.maths.calculator.system.command.Operations;

import com.maths.calculator.system.command.Command;
import com.maths.calculator.system.command.validator.CommandValidator;
import com.maths.calculator.system.model.Result;

public class PowerCommand implements Command, CommandValidator {
    @Override
    public Result execute(String[] attributes) throws Exception {
        if (validate(attributes)){
            double a = Integer.valueOf(attributes[0]);
            double b=Integer.valueOf(attributes[1]);
            double power=  Math.pow(a,b);
            return Result.builder().message((int)a+" raised to the power of "+(int)b+" is : ").result(power).build();
        }
        return Result.builder().message("Please try again !").build();
    }

    @Override
    public boolean validate(String[] attributes) throws Exception {
        if (attributes.length != 2){
            throw new Exception("Enter two numbers to get power!");
        }
        return true;
    }
}
