package _05;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _04_postfix {
	public static void main(String[] args) {
		String str = "";
		Stack<Integer> stack = new Stack<>();

		for (char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				stack.push(x - 48);
				// 0 -> 48 , 1 -> 49
			} else {
				int rt = stack.pop();
				int lt = stack.pop();
				if(x=='+') stack.push(lt+rt);
				else if (x=='-') stack.push(lt-rt);
				else if (x=='*') stack.push(lt*rt);
				else if (x=='/') stack.push(lt/rt);
			}
		}
		int answer = stack.get(0);

	}
}
