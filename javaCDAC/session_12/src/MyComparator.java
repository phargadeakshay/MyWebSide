import java.util.Comparator;

public class MyComparator implements Comparator {

	
	private static final Integer o2 = null;

	public static int main(String[] args, Integer o1) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		
		if(i1 > i2)
		{
			return -1;
		}
		else if(i1>i2 )
		{
			return -1;
   			
		}
		else 
		{
			return 0;
		}
		
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
