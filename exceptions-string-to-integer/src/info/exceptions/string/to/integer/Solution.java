
package info.exceptions.string.to.integer;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try {
			System.out.println(Integer.parseInt(S));
		} catch (Exception exception) {
			System.out.println("Bad String");
		} 
    }

}