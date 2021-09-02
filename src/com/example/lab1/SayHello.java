package com.example.lab1;

import java.util.Scanner;

public class SayHello {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your name >");
		String name = s.next();
		System.out.println("Hello, "+name);
	}

}
