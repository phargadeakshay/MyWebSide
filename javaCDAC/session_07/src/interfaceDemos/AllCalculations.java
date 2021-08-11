package interfaceDemos;

public class AllCalculations extends Factorial implements CampareCal,StaticCal{

//	@Override
	public void add(int a, int b) 
	{
		// TODO Auto-generated method stub
		System.out.println("Addition = "+(a+b));
	}
//	@Override
	public void sub(int a,int b)
	{
	int c = a-b;
	System.out.println("Substractions = "+c);
	}
	
//	@Override
	public void avg(int a, int b) 
	{
		// TODO Auto-generated method stub
		float average = (float)(a+b)/2;
		System.out.println("Average = "+average);	
	}
//	@Override
	public void min(int a,int b)
	{
		int c = (a<b)?a:b;
		System.out.println("Min ="+c);
	}


	}

	

