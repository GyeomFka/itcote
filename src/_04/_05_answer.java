package _04;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import com.sun.source.tree.Tree;

public class _05_answer {
	/**
	 * 자료구조 중 Set이라는 자료구조 add -> 기존 data 중복을 허락하지 않는다.
	 * Set -> 중복제거 자료구조
	 * + 정렬까지 되어있으면 좋다. -> TreeSet
	 */
	public static void main(String[] args) {
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

		Set<String> set = new TreeSet<>();

		set.add("김만겸");
		set.add("김만겸");
		set.add("김만겸");
		set.add("김만겸");
		set.add("김용환");
		set.add("김용환");
		set.add("김용환");
		set.add("김민철");
		set.add("이제동");
		set.add("이제동");
		set.add("이제동");

		for (String a : set) {
			System.out.println(a);
		}

	}
}
