package com.sh.app;

import com.sh.app.animal.Dog;
import com.sh.app.animal.Pig;
import com.sh.app.animal.Tiger;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Hello Git");
		
		new Dog().bark();
		new Tiger().jump();
		
	}
	public void test() {
		System.out.println("Main#test");

	}
}
