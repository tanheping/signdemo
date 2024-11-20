package com.sign.demo;

/**
 * TODO
 *
 * @author yoba
 * @version 1.0
 */
public class Multiply implements Operator
{
    @Override
    public int apply(int a, int b) {
        return a*b;
    }
}