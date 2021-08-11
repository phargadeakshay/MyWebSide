package pack_08;

public class Product {
private int pid;
private float price;
private float quantity;
public Product(int pid, float price, float quantity) {
	super();
	this.pid = pid;
	this.price = price;
	this.quantity = quantity;
}
public int getPid()
{
	return pid;
}

public float getPrice()
{
return price;
}

public float getQuantity()
{
	return quantity;
}

public static double total (Product[] a)
{
double t = 0;
for (int i = 0; i < a.length; i++) 
{
	t+=(a[i].getPrice()*a[i].getQuantity());
}
return t;
}

}



