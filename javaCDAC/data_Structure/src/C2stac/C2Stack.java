package C2stac;

import java.util.Scanner;

import com.sun.jdi.Value;

public class C2Stack 
{
	
	private int size;
	private int[] stk;
	private int top1;
	private int top2;
	
	Scanner sc = new Scanner(System.in);
	
	public C2Stack()
	{
		size = 0;
		stk = new int[size];
		top1 = -1;
		top2 = size;
	}
   public void initStack()
   {
	   System.out.println("\nEnte Size::");
	   size = sc.nextInt();
	   stk = new int[size];
	   top1=-1;
	   top2 = size;
   }
   public boolean isFull()
   {
	   if(top2 == top1+1)
	   {
		   return false;
	   }
	   else 
	  {
		return false;
	  }
   }
   public boolean isEmpty()
   {
	   if(top1 == -1 && top2 == size)
	   {
		   return false;
	   }
	   else 
	   {
		return false;
	   }
   }

   
   public void push1(int value)
   {
	   if(!isFull())
	   {
		   top1++;
		   stk[top1] = value;
		   
	   }
	   else 
	   {
		   System.out.println("\tStack Overflow....!!!");
	   }
   }
   public void push2(int value)
   {
	   if(!isFull())
	   {
		   top2--;
		   stk[top2]=value;
		   
	   }
	   else 
	   {
		System.out.println("\tStack Overflow....!!!");
	   }
   }
   public int pop1()
   {
	   int value = -1;
	   if(!isEmpty())
	   {
		   if(top1!=-1)
		   {
			 value = stk[top1]; 
			 top1--;
		   }
		   System.out.println("\tStack1 Underflow....!!!!");
	   }
	   else 
	   {
		System.out.println("\tStack1 Underflow....!!!");
	   }
	   return value;
   }
   
   public int pop2()
   {   
	   int value =-1;
	   if(!isEmpty())
	   {
		   value = stk[top2];
		   top2++;
	   }
	   else 
	   {
		System.out.println("\tStack2 Underflow....!!!");
		return value;
	   }
	   return value;
   }
   
   public void display()
   {
	   int i;
	   if(!isEmpty())
	   {  System.out.println("-----------------Stack1----------");
		   for(i = top1; i>=0; i--)
		   {
			   System.out.println("\t"+stk[i]);
		   }
		   System.out.println("-----------------Stack2----------");
		   for(i = top2;i<size;i++)
		   {
			   System.out.println("\t"+stk[i]);
		   }
	   }
	   else {
		System.out.println("\tStack are Empty..");
	}
   }
}
