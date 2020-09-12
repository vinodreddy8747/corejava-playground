package com.vkr.sep12;

class Util{
	public static void printNumbers(int from, int to, char c) {
			for (int i = from; i < to; i++) {
				System.out.println( c + " value = " + i);
			}
	}
}

class E extends Thread{
	@Override
	public void run() {
		Util.printNumbers(1, 5, 'E');
	}
}

class F extends Thread{
	@Override
	public void run() {
		Util.printNumbers(5, 10, 'F');
	}
}

class G extends Thread{
	@Override
	public void run() {
		Util.printNumbers(10, 15, 'G');
	}
}

public class Program1 {
	public static void main(String[] args) {
		E e1 = new E();
		e1.start();
		
		F f1 = new F();
		f1.start();
		
		G g1 = new G();
		g1.start();
	}

}
