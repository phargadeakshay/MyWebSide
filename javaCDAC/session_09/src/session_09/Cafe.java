package session_09;

public class Cafe {
	
	public enum Coffee
	{
		SMALL(30),MEDIUM(45),LARGE(60);  // This constants are 
	int price;
	private Coffee(int price) 
	{
	  this.price = price;
		
	}
	
	public int getPrice()
	{
		return price;
	}
	};
	
	public static void main(String[] args) {
		
		Coffee c = Coffee.MEDIUM;
		System.out.println("coffee price = "+c.getPrice());
	}

}
