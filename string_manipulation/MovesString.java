package com.java.keywords;

import java.util.Arrays;
import java.util.Scanner;

public class MovesString {

	public int swapLeftToRight(String st1, String st2) {

		char temp;
		char tempArr[] = st1.toCharArray();
		int count = 0;

		for (int i = 0; i < tempArr.length - 1; i++) {
			temp = tempArr[i];
			tempArr[i] = tempArr[i + 1];
			tempArr[i + 1] = temp;

			if (Arrays.equals(tempArr, st2.toCharArray())) {
				count = i + 1;
				break;
			}
		}
		
		return count;

	}

	public int swapRightToLeft(String st1, String st2) {
		char temp;
		char tempArr[] = st1.toCharArray();
		int count = 0;

		for (int i = tempArr.length - 1; i > 0; i--) {
			temp = tempArr[i];
			tempArr[i] = tempArr[i - 1];
			tempArr[i - 1] = temp;
			
			if (Arrays.equals(tempArr, st2.toCharArray())) {
				count=tempArr.length-i;
				break;
			}
		}
		
		return count;

	}

	public String swapLastFirst(String st1) {
		char temp;
		char tempArr[] = st1.toCharArray();
		temp = tempArr[0];
		tempArr[0] = tempArr[tempArr.length - 1];
		tempArr[tempArr.length - 1] = temp;

		return new String(tempArr);
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);

		String st1 = sc.next();
		String st2 = sc.next();

		MovesString m = new MovesString();

		if (1 < st1.length() && st1.length() < 2000 && 1 < st2.length() && st2.length() < 2000 && st1.length()==st2.length() && !st1.equals(st2)) {
			String st1new = m.swapLastFirst(st1);
			if (st1new.equals(st2)) {
				System.out.println(1);
			} else {
				int count = m.swapLeftToRight(st1, st2);
				int count1 = m.swapRightToLeft(st1, st2);
				if (count != 0) {
					if (count1 != 0) {
						if (count < count1) {
							System.out.println( count);
						} else {
							System.out.println( count1);
						}
					} else {
						System.out.println( count);
					}
				} else if (count1 != 0) {
					if (count != 0) {
						if (count1 < count) {
							System.out.println( count1);
						} else {
							System.out.println( count);
						}
					} else {
						System.out.println( count1);
					}
				}

			}
		}

	}
}