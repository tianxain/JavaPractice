package diliuzhang;

import java.util.*;
import java.util.Map.Entry;

public class Test2 {
	public static void main(String[] args) {
		Map<String, String> treemap=new TreeMap<String, String>(new MyComparator());
		treemap.put("1", "Lucy");
		treemap.put("2", "Jhon");
		treemap.put("3", "Smith");
		treemap.put("4", "Aimee");
		treemap.put("5", "Amanda");
		
		Set<Entry<String, String>> entrySet=treemap.entrySet();
		Iterator<Entry<String, String>> it=entrySet.iterator();
		while(it.hasNext())
		{
		   Map.Entry entry=(Map.Entry)(it.next());
		   Object key=entry.getKey();
		   Object value=entry.getValue();
		   System.out.println(key+":"+value);
		}
	}
}
