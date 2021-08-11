package pack_08;

import java.util.Scanner;

public class XYZ {
public static void main(String[] args) {
	

Scanner s= new Scanner(System.in);
Product p[] =new Product[2];

for(int i=0; i<p.length;i++)
{
System.out.println("Enter Product Id");
int pid  = s.nextInt();
System.out.println("Enter Product Price");
float price = s.nextFloat();
System.out.println("Enter Product Quantity");
float qty = s.nextFloat();
p[i] = new Product(pid,price,qty);

}


System.out.println("Product Details = ");

for(int i = 0;i<p.length;i++)
{
	System.out.println(p[i].getPid()+" " +p[i].getPrice()+" "+p[i].getQuantity());
}

double d = Product.total(p);
System.out.println("Total = "+d);

}

}