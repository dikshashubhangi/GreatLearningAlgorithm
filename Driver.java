package com.gl.paymoney;

import java.util.Scanner;


public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Transactions Array i.e Number of days you want to check:");
		int size = sc.nextInt();
		
		int[] transactions = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter daily transactions in Crores of Day: " + (i + 1));
			transactions[i] = sc.nextInt();
		}
		
		displayTransaction(transactions);

	}
	public static void displayTransaction(int[] transactions) {
		for (int i = 0; i < transactions.length; i++) {
			System.out.println(transactions[i] + " ");
		}
		System.out.println();
	}

}
