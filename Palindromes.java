package features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("madam","malayalam","atta","jahnavi");
		List<String> palindromes = Palindromes.filterList(strings,StrPredicates::isPalindrome);
		System.out.println(palindromes);
	}
	public static List<String> filterList(List<String>li, Predicate<String> pre) {
		List<String> finalList = new ArrayList<>();
		for (String st:li) {
			if (pre.test(st)) {
				finalList.add(st);
			}
		}
		return finalList;
	}

}
