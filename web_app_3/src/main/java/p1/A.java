package p1;

import java.util.*;

public class A extends Thread{
	public void run() {
		for(int i=0;i<10000;i++) {
			System.out.println("run");
		}
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		for(int i=0;i<10000;i++) {
			System.out.println("main");
		}
	}
}