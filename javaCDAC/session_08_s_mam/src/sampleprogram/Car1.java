package sampleprogram;

abstract public class Car1 {
	
	String company;
	double price;
	Car1(String company,double price)
	{
		this.company = company;
		this.price = price;
	System.out.println("Company name is = "+company);
	System.out.println("price of car is : "+price);
	
	}
abstract void start();
abstract void move();
abstract void stop();


}
