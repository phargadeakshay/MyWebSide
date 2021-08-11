package assignment_11;

import java.util.*;

//this is our custom_comparator;
class custom_comparator implements Comparator<Student>{
 public int compare(Student s1, Student s2){
     return  s2.rollno - s1.rollno;
 }
}


//this is our custom class 
class Student{
 int rollno;
 String name;
 Student(int roll , String name){
     rollno = roll;
     this.name = name;
 }
@Override
public String toString() {
	return "rollno=" +rollno+",name="+name+"\t";
}
 
 
}

public class A{
 public static void main(String[] args) {
    ArrayList<Student> obj = new ArrayList<>();
     obj.add(new Student(7, "Anurag"));
     obj.add(new Student(2, "ALok "));
     obj.add(new Student(17, "Aditi"));
     obj.add(new Student(4, "Seema"));
     obj.add( new Student(9, "Rohit"));
   System.out.println("befor shorting\n"+obj );

     Collections.sort(obj, new  custom_comparator());
     System.out.println("after shorting\n"+obj );
     

 }
}
