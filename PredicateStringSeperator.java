package in.chetan.predicate.StringSeperator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class PredicateStringSeperator {

	private static Map<Integer,String> map = new HashMap<>();
	static int count = 1;
	public static void main(String[] args) {
		
		Predicate<String> p = s1-> s1.length()>5;
		
		String[] s = {"Chetan","Mahendra","Kirti","Sapna","Ranu","Ankita"};
		
		for (String s2 : s) {
			if(p.test(s2)) {
				
				map.put(count, s2);
				count++;
			}
		}
        System.out.println(map);
	}

}
