
public class Addition {
	
	public void add(int a, int b) {
		int c = a + b;

	}
	
	public int add(int a, int b,int c) {
		return a+b+c;
	}
	
	public void add(int a, int b,int c,int d) {
	    
		System.out.println("Additions is "+(a+b+c+d));
	}
	 
	public static void main(String[] args) {
		
	Addition a = new Addition();
	a.add(10, 20);
	System.out.println("sum= "+a.add(1, 2, 3));
	a.add(10, 14,5,10);
	}
	

}
