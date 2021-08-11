package sampleprogram;

public class MainClass extends Car1 implements Gadget{

	MainClass(String company, double price) 
	{
		super(company, price);
	
	}

public static void main(String[] args)
{
	
	Car1 c1 = new Car1("Maruti",500000)
	{
	@Override
	void start() 
	{
		
		
	}

	@Override
	void move() 
	{
		
		
	}

	@Override
	void stop() 
	{
	
		
	}
};
c1.start();
c1.move();
c1.stop();
Gadget g1 = new Gadget() {
	
	@Override
	public void mechanicalgadget() 
	{
		System.out.println("We are having multiple electronics gadget");
		
	}
	
	@Override
	public void electronicgadet() 
	{
	System.out.println("We are having multiple mechanical gadgets");	
		
	}
};

g1.electronicgadet();
g1.mechanicalgadget();
 
}

@Override
public void electronicgadet() {
	
}

public void mechanicalgadget()
{
	
}

void start()
{
	
}


void move() 
{
	
}

void stop()
{
	
}


}

