package com.maths.calculator.system.command.Operations;

import com.maths.calculator.system.command.Command;
import com.maths.calculator.system.command.validator.CommandValidator;
import com.maths.calculator.system.model.Result;

public class PrimeCommand implements Command, CommandValidator {
    @Override
    public Result execute(String[] attributes) throws Exception {
        if (validate(attributes)){
            for (String number : attributes ){
                int num = Integer.parseInt(number);
                int i,m=0,flag=0;
                m=num/2;
                if(num==0||num==1){
                    System.out.println(num+" is not prime number");
                }else{
                    for(i=2;i<=m;i++){
                        if(num%i==0){
                            System.out.println(num+" is not prime number");
                            flag=1;
                            break;
                        }
                    }
                }
                if(flag==0)   System.out.println(num+" is a prime number");
            }
            return Result.builder().message(" This are yours Prime Number Solutions ! ").build();
        }
        return Result.builder().message("Please try again !").build();
    }

    @Override
    public boolean validate(String[] attributes) throws Exception {
        if (attributes.length<1){
            throw new Exception("Required minimum one number to check Prime or Not !");
        }
        return true;
    }
}
