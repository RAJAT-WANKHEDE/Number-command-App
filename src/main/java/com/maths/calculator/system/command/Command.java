package com.maths.calculator.system.command;

import com.maths.calculator.system.model.Result;

public interface Command {
    public Result execute(String[] attributes) throws Exception;
}
