package com.maths.calculator.system.command.Operations;

import com.maths.calculator.system.command.Command;
import com.maths.calculator.system.command.validator.CommandValidator;
import com.maths.calculator.system.model.Result;

public class AvgCommand implements Command, CommandValidator {
    @Override
    public Result execute(String[] attributes) throws Exception {
        if (validate(attributes)){
            int sum = 0 ;
            for (String number : attributes){
                sum += Integer.valueOf(number);
            }
            double avg = sum/attributes.length;
            return Result.builder().message("Average of given numbers is : ").result(avg).build();
        }
        return Result.builder().message("Please try again !").build();
    }

    @Override
    public boolean validate(String[] attributes) throws Exception {
        if (attributes.length<1){
            throw new Exception("Required minimum one number to get average !");
        }
        return true;
    }
}
