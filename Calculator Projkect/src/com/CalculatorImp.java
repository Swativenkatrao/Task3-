package com;

public class CalculatorImp implements CalculatorApp {
	
	@Override
	public int add(int a, int b){
		return a+b;
	}
	
	@Override
	public int sub(int a, int b){
		return a-b;
	}
	
	@Override
	public int mul(int a, int b){
		return a*b;
	}
	
	@Override
	public int div(int a, int b){
		return a/b;
	}
}
