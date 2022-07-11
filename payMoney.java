package com.gl.paymoney;
import java.util.*;


public class payMoney {
	
	public int numberOfDays(int[] transactions,int targetAmount) {
		for (int i = 0; i < transactions.length; i++) {
		     if(targetAmount==transactions[i] || targetAmount<transactions[i]) {
		    	 return i + 1;
		     }else {
		    	 targetAmount = targetAmount - transactions[i];
		     }
	
	}
		return -1;
	
	
	}
	









}









