package com.vkr.string.medium;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'initialize' function below.
     *
     * The function accepts STRING s as parameter.
     */
	
	static String str;

    public static void initialize(String s) {
    // This function is called once before all queries.
    	str = s;
    }

    /*
     * Complete the 'answerQuery' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER l
     *  2. INTEGER r
     */

    public static int answerQuery(int l, int r) {
    // Return the answer for this query modulo 1000000007.
    	
    	if(l == r) {
    		return 1;
    	}
    	
    	
    	String s = str.substring(l-1, r);
    	
    	int n = s.length();
    	
    	if(r-l == 1) {
    		if(s.charAt(0) == s.charAt(1)) {
    			return 1;
    		}else{
    			return 2;
    		}
    	}

    	
    	//int arr[] = new int[n];
    	ArrayList<Set> al = new ArrayList<>();
    	
    	for (int i = 0; i < n; i++) {
			al.add(new HashSet<>());
		}
    	
    	al = getCounter(s, al);
    	//System.out.println(al);
    	
    	//arr[n-1] = result;
    	
    	al = populateResult(s,al);
    	
    	
    	int result = 0; 
    	for (int i = al.size()-1; i >= 0; i--) {
    		Iterator itr = al.get(i).iterator();
        	int counter = 0;
        	while(itr.hasNext()) {
        		String s1 = itr.next().toString();
        		if(reverseStr(s1).equals(s1)) {
        			counter++;
        		}
        	}
        	if(result < counter) {
            	return counter;
        	}
		}
    	//System.out.println(arr[n-1]);
    	
    	
    	
    	// 012 013 123 023
    	// 0123 0132 0213 0231 0312 0321 
    	// 1023 1032 1203 1230 1302 1320  
    	// 2013 2031 2103 2130 2301 2310
    	// 3012 3021 3102 3120 3201 3210
    	
    	
    	
    	return result;
    }
    
    private static ArrayList<Set> populateResult(String s, ArrayList<Set> al) {
    	int x = s.length();
    	String s1;
    	while(x > 1) {
    		char[] ch = s.toCharArray();
    		for(int i = 0; i < x; i++) {
    			ch = s.toCharArray();
        		ch[i] = ' ';
        		s1 = String.valueOf(ch).replaceAll(" ", "");
    			getCounter(s1, al);
    			al = populateResult(s1, al);
    		}
    		x--;
    	}
    	
    	return al;
    }
    
    private static ArrayList<Set> getCounter(String s,ArrayList<Set> al) {
    	char ch[] = s.toCharArray();
    	//System.out.println(s);
    	Set<String> set = al.get(s.length()-1);
    	if(ch.length == 1) {
			set.add(s);
			al.set(s.length()-1, set);
	    	return al;
		}
    	for(int i = 0; i < s.length(); i++) {
    		int idx = 0;
    		String s1 = null;
   // 		char temp;
    		while(idx < s.length()-1) {
    			for(int j = idx; j < s.length()-1; j++) {
//    				temp = ch[j];
//        			ch[j] = ch[j+1]; 
//        			ch[j+1] = temp;
        			s1 = swap(s, j, j+1);
        			set.add(s1);
    			}
    			idx++;
    		}
    	}
    	al.set(s.length()-1, set);
    	return al;
    }
    
    static String swap(String str, int i, int j) 
    { 
        if (j == str.length() - 1) 
            return str.substring(0, i) + str.charAt(j) 
                + str.substring(i + 1, j) + str.charAt(i); 
  
        return str.substring(0, i) + str.charAt(j) 
            + str.substring(i + 1, j) + str.charAt(i) 
            + str.substring(j + 1, str.length()); 
    } 
    
    private static String reverseStr(String s) {
    	char ch[] = s.toCharArray();
    	String result = "";
    	for(int i = ch.length-1; i >= 0; i--) {
    		result += ch[i];
    	}
    	return result;
    }

}

public class Program1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        Result.initialize(s);

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int l = Integer.parseInt(firstMultipleInput[0]);

            int r = Integer.parseInt(firstMultipleInput[1]);

            int result = Result.answerQuery(l, r);
            System.out.println(result);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }

//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

