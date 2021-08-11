package session_09;

public class EnumExample {
	
	public enum Seassions{SUMMER,WINTER,AUTUMN,RAINY};

	public static void main(String[] args)
	{
		
//		Seassions s = Seassions.SUMMER;
//		System.out.println(s);
		
		
		for(Seassions s: Seassions.values())
		{
			System.out.println(s +" "+s.ordinal());
		}
	}
}
