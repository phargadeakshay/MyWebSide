package practice;

@FunctionalInterface  //lamda Expression can only use when interface is functionalInterface
                      // functionalInterface means only one method in the interface
interface DemoAnoa{
    void meth1(int a);
//    void meth2();
}

//
//class HarryFunc implements DemoAno{
//    @Override
//    public void meth1() {
//        System.out.println("This is method 1");
//    }
//}


public class A {
    public static void main(String[] args) {
 
        // Lambda Expressions

//        DemoAno obj = new HarryFunc();
//        obj.meth1();
        DemoAnoa obj = (a)->{System.out.println("I am method 1 from this lambda " + a);};
        obj.meth1(6);
    }
}
