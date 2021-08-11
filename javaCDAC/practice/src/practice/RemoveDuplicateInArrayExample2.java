package practice;

import sun.security.util.Length;

public class RemoveDuplicateInArrayExample2{  
    public static int removeDuplicateElements(int arr[], int n){  
//        if (n==0 || n==1){  
//            return n;  
//        }    
        int j = 0,ind = -1,m;//for next element 
        int tem[]= new int[n];
        System.out.println(tem.length);
        for (int i=0; i < n; i++)
        {   int flag = 0;
           for(m =0;m<=ind;m++) 
           {	
        	   if (arr[i]==tem[m])
              {  
                flag =1;
                break;
              }
           }
          if(flag ==0) 
              {
        	  	ind = ind +1;
                tem[ind] = arr[i]; 
                System.out.print(tem[ind]+"\t");
              }
        }
        return ind;  
    }  
       
    public static void main (String[] args) {  
        int arr[] = {10,20,20,30,30,40,50,50,30,10,20,3,1};  
        int length = arr.length;  
     int  l = removeDuplicateElements(arr, length);  
  
    }  
}