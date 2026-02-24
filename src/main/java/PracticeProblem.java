/**
	* File: Lesson 1.7 - Booleans (and, or, not)
	* Author: Naren Nades
	* Date Created: Feb 14, 2023
	* Date Last Modified: Feb 24, 2026
	*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1 && bool2);
		System.out.println(bool1 || bool2);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		String letter1;
		String letter2;
		System.out.print("Input a lowercase letter: ");
		letter1 = input.nextLine();
		char c1 = letter1.charAt(0);
		System.out.print("Input another lowercase letter: ");
		letter2 = input.nextLine();
		char c2 = letter2.charAt(0);
		System.out.println(c1 < c2);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		double num1;
		System.out.print("Input a number: ");
		num1 = input.nextDouble();
		System.out.println(0 <= num1 && num1 <= 10);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		double num1;
		System.out.print("Input a number: ");
		num1 = input.nextDouble();
		System.out.println((num1 != 5) && num1 > 0);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		String word;
		System.out.print("Input a word: ");
		word = input.nextLine();
		System.out.println(word.compareTo("banana") != 0);
	}

	public static void q6() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		int num1;
		System.out.print("Enter an integer: ");
		num1 = input.nextInt();
		System.out.println("The integer " + num1 + " is " + (num1%2==0));
	}

}
