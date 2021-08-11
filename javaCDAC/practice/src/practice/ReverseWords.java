package practice;

//Java program to reverse a string
//s = input()
//public class ReverseWords
//{
//
//	public static void main(String[] args)
//	{
//		String s[] = "i like this program very much".split(" ");
//		String ans = "";
//		for (int i = s.length -1 ; i >= 0; i--)
//		{
//			ans += s[i] + " ";
//		}
//		System.out.println("Reversed String:");
//		System.out.println(ans);
//	}
//}



//Java program to
//reverse a String
import java.util.*;
 public class ReverseWords{
	 
static void reverse(char str[],int start,int end)
{

char temp;

while (start <= end)
{
	temp = str[start];
	str[start] = str[end];
	str[end] = temp;
	start++;
	end--;
}
}



static char[] reverseWordss(char []s)
{
int start = 0;
for (int end = 0; end < s.length; end++)
{
	if (s[end] == ' ')
	{
	reverse(s, start, end);
	start = end + 1;
	}
}
reverse(s, start, s.length - 1);
reverse(s, 0, s.length - 1);
return s;
}





public static void main(String[] args)
{
String s = "i like this program very much ";
char []p =reverseWordss(s.toCharArray());
System.out.print(p);
}
}

