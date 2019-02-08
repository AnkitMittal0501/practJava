import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateEle {
	public static void main(String[] args) {
		String names[] = { "Java", "JavaScript", "Ruby", "C++", "Ruby", "Python", "Java" };
		Set<String> setofName = new HashSet<String>();
		for (String n : names) {
			if (setofName.add(n) == false) {
				System.out.println(n);
			}
		}
		// Using HashMap
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String s : names) {
			Integer count = map.get(s);
			if (count == null) {
				map.put(s, 1);
			} else {
				map.put(s, ++count);
			}

		}
		Set<Entry<String, Integer>> Entryset = map.entrySet();
		for (Entry<String, Integer> entry : Entryset) {
			if(entry.getValue()>1)
			{
				System.out.println("Duplicate Entry is "+entry.getKey());
			}
		}
		System.out.println(map);
	}
}
