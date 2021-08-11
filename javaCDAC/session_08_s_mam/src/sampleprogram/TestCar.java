package sampleprogram;
public class TestCar {

	public static void main(String[] args)
	{
		Car c1 = new Car()
		{
			void start()
			{
				System.out.println("Car starts..");
			}
			void move()
			{
				System.out.println("Car starte moving towards Destinations");
				
			}
			void stop()
			{
				System.out.println("Car Stop");
			}
		};
		
		c1.start();
		c1.move();
		c1.start();
	}
}

