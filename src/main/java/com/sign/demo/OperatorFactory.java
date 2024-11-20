package com.sign.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * TODO
 *
 * @author yoba
 * @version 1.0
 */
public class OperatorFactory {

    static Map<String,Operator> operatorMap = new HashMap<>();

    static {
        operatorMap.put("add",new Addition());
        operatorMap.put("sub",new Subtract());
        operatorMap.put("mult",new Multiply());
        operatorMap.put("div",new Dividetion());
    }

    public static Optional<Operator> getOperation(String operator){
        return Optional.ofNullable(operatorMap.get(operator));
    }

}
