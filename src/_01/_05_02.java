package _01;

import java.util.Scanner;

public class _05_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = "a#b$cdef@g";
		char[] c = input.toCharArray();
		int lt = 0, rt = input.length()-1;

		while(lt < rt) {
			if(String.valueOf(c[lt]).matches("[^a-z]") && String.valueOf(c[lt]).matches("[^A-Z]")){ lt++;}
			else if(String.valueOf(c[rt]).matches("[^a-z]") && String.valueOf(c[rt]).matches("[^A-Z]")){ rt--;}
			else {
				char temp = c[lt];
				c[lt] = c[rt];
				c[rt] = temp;
				lt++;
				rt--;
			}
		}
		System.out.println(String.valueOf(c));
	}

}
