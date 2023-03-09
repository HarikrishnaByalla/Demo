package Association;

class A{
	public void m1() {
		System.out.println("m1()defined");
	}
}
class B{
	public void m2() {
		 
		A a=new A();//dependency
		a.m1();
	}
}
public class Agrigations {

	public static void main(String[] args) {
          B b=new B();
          b.m2();
	}

}
