
public class Player {
	private String playerCountry,playerName;
	
	public Player()
	{   
		playerCountry = "India";
				
	}
	public Player(String playername)
	{
		this(); //use "this" always top in constuctor
		this.playerName = playername;
		
	}
	
	public String toString()
	{
		return "Player Name = "+playerName+"   Country= "+playerCountry;
		
	}
	
	public static void main(String[] args)
	{
		Player p = new Player();
		System.out.println(p);
		Player p1 = new Player("Virat");
		System.out.println(p1);
	}
}
