package session_12;

import java.util.Hashtable;

public class HashTableDemo {
	
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
//		System.out.println(h.capacity());
		h.put(new Tem(5),"A");
		h.put(new Tem(2),"B");
		h.put(new Tem(6),"C");
		h.put(new Tem(15),"D");
		h.put(new Tem(23),"E");
		h.put(new Tem(16),"F");
		h.put(new Tem(4),"D");
		h.put(new Tem(4),"D");
			
		System.out.println(h);
	}

}

//HashTable:
//	Data structure is HashTable
//	Intersection order is not priserved based on HashCode of key)
//	Null not allowed
//	Every method is synchronized (Thread-safe)
//	Best suitable for search Operation.
//	
//	
//	HashTable  h= new HashTable(); // initial capacity of 11

