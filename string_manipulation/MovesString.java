/**
 * Copyright 2016-2017 Shyam Bhimani
 */

package string_manipulation;

import java.util.Arrays;

public class MovesString {

	public void easyStrings(String st1, String st2) {

		char a[] = st1.toCharArray();

		char b[] = st2.toCharArray();

		char temp = 'a';
		char tempArr[]=st1.toCharArray();
		int count=0;

		//System.out.println("A="+new String(a));
	//	System.out.println("B="+new String(b));
		
		
		if (1 > a.length || 2000 < b.length) {

			System.out.println("Invalid input");

		} else if (a.length == b.length) {

			if (a != b) {
				// aaaab
				// baaaa
				
				//Step One.
				for(int i=0; i<tempArr.length-1;i++){
					count++;
					temp=tempArr[i];
					tempArr[i]=tempArr[i+1];
					tempArr[i+1]=temp;
					if(tempArr==b){
						System.out.println(count);
						break;
					}
			//		System.out.println("Temp Array: " +new String(tempArr));
				}
				
				//Step 2.
				count=0;
				char []tempArr1=a;
				//System.out.println("TEMP ARRY AFTET STEP 1 = "+new String(tempArr1));
				temp=tempArr1[0];
				tempArr1[0]=tempArr1[tempArr1.length-1];
				tempArr1[tempArr1.length-1]=temp;
				count++;
				if(Arrays.equals(tempArr1, b)){
					System.out.println(count);
				}
			
			/*	if (a[0] == b[b.length - 1] && b[0] == a[a.length - 1]) {

					a[0] = b[0];
					a[a.length - 1] = b[b.length - 1];

					if (a == b) {

						System.out.println("took 1 step");

					} else if(a != b){
						

						for (int i = 0; i < (a.length - 1); i++) {

							temp = a[i + 1];
							a[i + 1] = a[i];
							a[i] = temp;

							if (a == b) {

								System.out.println("Took 2 Steps");
							}
						}
					}

				}*/

			}

		} else {
			
			System.out.println("invalid input");
		}

	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		String st1 = "baaaaac";
		String st2 = "caaaaab";

		MovesString m = new MovesString();

		m.easyStrings(st1, st2);

	}

}