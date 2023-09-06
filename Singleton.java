// Singleton Design Pattern:Where a class is designed in such a way that the constructor is declared private 
//so that the user can create only a single instance of that class
class A{
    public static A instance;
    private A(){}
    public static A getInstance(){
        if(instance==null){
            instance=new A();
            System.out.println("first instance created");
            return instance;
        }else{
            System.out.println("cannot create another instance");
            return null;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	   A obj=A.getInstance();
	   A obj2=A.getInstance();
	}
}
