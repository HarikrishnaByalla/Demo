package Association;
class C{
	public void m1() {
		System.out.println("m1()defined");
	}
	
}  
class D{
	C c;
	public D(C c) {
	
	this.c=c;
	} 
public void m2() {
	c.m1();
}
}

public class Composition {

	public static void main(String[] args) {
         C c=new C();
         D d=new D(c);
         d.m2();
	}

}
