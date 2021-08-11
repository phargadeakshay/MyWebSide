package practice;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicateArray {
	
public static void removeDup(int r[])
{
   LinkedHashSet<Integer> ntt = new LinkedHashSet<Integer>();
   for (int i = 0; i < r.length; i++) 
   {
	   ntt.add(r[i]);
	  
   }
   TreeSet<Integer> tree= new TreeSet<Integer>(ntt);
//   ArrayList<Integer> array = new ArrayList<>(set); // can also use for short
   System.out.println("No Duplicate are in: "+ntt);
   System.out.println("No Duplicate are in: "+tree);
}

public static void main(String[] args) {
	int arr[] = {11,11,2,11,22,2,55,1,22,33,1};
	
	removeDup(arr);
}
	
	

}
