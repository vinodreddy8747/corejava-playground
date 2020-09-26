package com.vkr.lambda;

import com.vkr.lambda.Program3.FuncInter1;
import com.vkr.lambda.Program3.FuncInter2;

public class Program4 {

	public static void main(String[] args) {
		FuncInter1 add = new FuncInter1() {
			@Override
			public int operation(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};

		FuncInter1 multiply = new FuncInter1() {
			@Override
			public int operation(int a, int b) {
				// TODO Auto-generated method stub
				return a * b;
			}
		};

		Program3 tobj = new Program3();

		System.out.println("Addition is " + tobj.operate(6, 3, add));

		System.out.println("Multiplication is " + tobj.operate(6, 3, multiply));

		FuncInter2 fobj = new FuncInter2() {
			
			@Override
			public void sayMessage(String message) {
				System.out.println("Hello " + message);				
			}
		};
		fobj.sayMessage("all");
	}

}
