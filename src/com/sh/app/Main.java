package com.sh.app;

import com.sh.app.animal.Cat;
import com.sh.app.animal.Dog;
import com.sh.app.animal.Tiger;

public class Main {

	public static void main(String[] args) {
		System.out.println("HELLO WORLD");
		System.out.println("HELLO GIT");
		
		new Dog().bark();
		new Cat().jump();
		new Tiger().jump();
		
	}
	public void test() {
		System.out.println("Main#test");
	}
}
