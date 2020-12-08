package com.Animaux.app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name,kind;
		int speed,size;
		Scanner myInput = new Scanner(System.in);
		System.out.println("enter your name : ");
		name = "";
		name += myInput.next();
		System.out.println("enter your Kind : ");
		kind = "";
		myInput.nextLine();
		kind += myInput.next();
		System.out.println("enter your speed : ");
		speed = myInput.nextInt();
		System.out.println("Enter your size : ");
		size = myInput.nextInt();
		Lion L1 = new Lion(name,kind,speed,size);
		String path  = "C:\\Users\\Admin\\Downloads\\LionGrowlAngryGene-PE931903.wav";
	System.out.println(L1.toString());
		try {
			
		
		L1.ReadSound(path);
		
			
		}catch(Exception e) {
			
			System.err.println(e);
			
		}
		
		
		
		

	}

}
