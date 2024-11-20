package com.sign.demo;

/**
 * TODO
 *
 * @author yoba
 * @version 1.0
 */
public class DoMainTest {

    public static void main(String[] args) {
        DoMainTest doMainTest = new DoMainTest();
        int result = doMainTest.calculateUsingFactory(6,6,"div");
        System.out.println(result);
    }

    public int calculateUsingFactory(int a, int b, String operator){
        Operator operators = OperatorFactory.getOperation(operator).orElseThrow(()-> new IllegalArgumentException());
        return operators.apply(a,b);
    }

}
