package com.env.transexp;

public class Calculator {
	static final String PID = "00001";
	static final String PROCESS = "Sportify";
	public int multiply(int x, int y){ 
		return x*y;
	}
	public int sum(int x, int y) {
		return x+y;
	}
	public int divide(int x, int y) {
		return x/y;
	}
	public int subtract(int x, int y) {
		return x-y;
	}
	public boolean OR(byte x, byte y) {
		return x == 1 || y == 1;
	}
	public boolean AND(byte x, byte y) {
		return (x == 1 && y == 1) || (x == 0 && y == 0);
	}
	public boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
