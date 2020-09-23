package com.vkr.string.hard;

public class Test {

	public static void main(String[] args) {

		String[] arr = {"a", "b", "c", "aa", "d", "b"};
		int[]arr1 = {1,2,3,4,5,6};
		
		String str = "caaab";
		
		int len = str.length();
		int sum = 0;
		
		int idx = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if(str.indexOf(arr[i], idx) > -1){
				sum =  sum+ arr1[i];
				idx = str.indexOf(arr[i], idx);
			}
		}
		
		System.out.println(sum);

	}

}
