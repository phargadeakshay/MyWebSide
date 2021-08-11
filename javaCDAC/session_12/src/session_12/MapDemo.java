package session_12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("chitra", 700);
		m.put("balaji", 800);
		m.put("vishakha", 200);
		m.put("nilesh", 500);
		
		System.out.println(m);
		
		System.out.println(m.put("chitra", 100));
         System.out.println(m);
    
    Set s = m.keySet();
    System.out.println(s);
    
    
    Collection c = m.values();
    System.out.println(c);
    
    Set  s1 = m.entrySet();
    System.out.println(s1);
    
    Iterator itr = s1.iterator();
    while (itr.hasNext()) 
    {
		Map.Entry m1 = (Entry) itr.next();
		System.out.println(m1.getKey()+ "----"+m1.getValue());
		if(m1.getKey().equals("vishakha"))
		{
			m1.setValue(100);
		}
	}
    System.out.println(m);
	}

}

//Hashmap:
//	Data structure is HashTable
//	Non-legacy(1,2)
//	Duplicate keys are not allowed
//	values can be duplicated
//	Intersection order is not priserved(bcoz based on HashCode of key)
//	Every method is non-synchronized
