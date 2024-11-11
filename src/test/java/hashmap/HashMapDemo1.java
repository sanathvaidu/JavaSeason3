package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		 Map<String,String> hMap =new HashMap<String,String>();
		hMap.put("manager", "Ravi");
		hMap.put("Test Lead","Gopi");
		hMap.put("Tester","Reyaz");
		hMap.put("Developer","sam");
		
		System.out.println(hMap);
		
		Set<Entry<String, String>>  entries =hMap.entrySet();
		
		for(Entry<String, String>  entry:entries)
		{
			System.out.println(entry.getKey() +"----"+entry.getValue() );
	}
		System.out.println(hMap.get("Developer"));
		System.out.println(hMap.containsKey("Tester"));
		System.out.println(hMap.containsKey("Data analyst "));

	}
}
