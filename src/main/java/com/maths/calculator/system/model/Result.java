package com.maths.calculator.system.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class Result {
    public  String message;
    public  double result;
}
