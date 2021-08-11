package assignment_10;



class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }


}

public class throw_throws {

    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    
    public static void main(String[] args) {
        
        try{
            double ar = area(5);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception "+e);
        }
    }
}
