package com.leo.springaop;

public class ProductServiceImpl implements ProductService {
    @Override
    public int multiply(int number1, int number2) {
        return number1 * number2;
    }
}
