package testin;

public class A {
	public int f(){
		return 1;
	}
}

class B extends A{
	@Override
	public int f(){
		return 1;
	}
}
class test{
	public static void main(String [] args){
		B x = new B();
		System.out.println(x.f());
	}
}