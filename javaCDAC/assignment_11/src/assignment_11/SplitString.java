package assignment_11;

public class SplitString {
	public static void main(String[] args) {
		
	
	String str = "CoreJava_AdvanceJava_Sql_Html_Css"; 
    String arr[] = str.split("_");
    
    for (String string : arr) {
    	System.out.println(string);
		
	}

}
}