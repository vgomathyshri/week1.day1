package week1.day1;

import java.util.Iterator;

public class Fibbinocci {
	public static void main(String[] args) {
		int firstNum = 0;
		int secNum = 1;
		int sum1 = 0;
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i= 1; i<=11; i++) {
		sum1 = firstNum + secNum;
		System.out.println(sum1);
		firstNum= secNum;
		secNum = sum1;
		}
			
		
	}

}