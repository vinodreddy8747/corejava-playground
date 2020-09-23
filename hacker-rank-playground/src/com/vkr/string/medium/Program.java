package com.vkr.string.medium;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Program {

    // Complete the highestValuePalindrome function below.
    static String highestValuePalindrome(String s, int n, int k) {
    	
    	char ch[] = s.toCharArray();
    	
    	if(k > 0) {
    		int start = 0;
    		int end = n-1;
    		int mid = start + end / 2 + 1;

    		if(n == 1) {
    			if(k > 0){ return "9";}else{return s;}
    		}
    		
    		
    		if(n == k) {
    			Arrays.fill(ch, '9');
    			return String.valueOf(ch);
    		}
    		
    		if(k == 1 && reverseStr(String.valueOf(ch)).equals(String.valueOf(ch))) {
    			ch[mid-1] = '9';
    			return String.valueOf(ch);
    		}
    		
    		while(start < mid) {
    			if(k == 0) {
    				break;
    			}

    			if(ch[start] != ch[end]) {
    				if(convertCharToInt(ch[start]) > convertCharToInt(ch[end])) {
    					if(convertCharToInt(ch[start]) == 9) {
    						ch[end] = ch[start];
        					k--;
    					}
    					else {
        						ch[end] = ch[start];
            					k--;
    					}
    					
    				}else {
    					if(convertCharToInt(ch[end]) == 9) {
    						ch[start] = ch[end];
        					k--;
    					}
    					else {
	    						ch[start] = ch[end];
	        					k--;
    					}
    					
    				}
    			}
    			start++;
				end--;
    		}
    		
    		if(k > 0) {
    			start = 0;
        		end = n-1;
        		mid = start + end / 2 + 1;

        		while((start < mid)) {
        			if(k <= 0) {
        				break;
        			}
        			
        			if(convertCharToInt(ch[start]) < 9) {
        				if(k >= 2  &&  ch[start] == s.charAt(start) && ch[end] == s.charAt(end)) {
        					ch[end] = '9';
        					ch[start] = '9';
    						k = k-2;
        				}else if(k >= 1  && ch[start] == s.charAt(start) || ch[end] == s.charAt(end)) {
        					ch[end] = '9';
        					ch[start] = '9';
        					k--;
        				}
        				
        			}
        			
        			start++;
    				end--;
        		}
        		
    		}
   
    		if(reverseStr(String.valueOf(ch)).equals(String.valueOf(ch))) {
    			return String.valueOf(ch);
    		}else {
        		return "-1";
    		}
    		
    	}else {
    		if(reverseStr(s).equals(s)) {
    			return s;
    		}
    	}
    	System.out.println(String.valueOf(ch));
    	return "-1";
    }
    
    static int convertCharToInt(char c) {
    	return Integer.parseInt(Character.toString(c));
    }
    
    static String reverseStr(String s) {
    	char ch[] = s.toCharArray();
    	String res = "";
    	for (int i = ch.length-1; i >= 0; i--) {
			res += ch[i];
		}
    	return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String s = scanner.nextLine();

        String result = highestValuePalindrome(s, n, k);
        System.out.println(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

