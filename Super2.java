class A{
	int i;
	int j;
}

class B extends A{
	int i;

	 B(int a, int b, int c){
		super.i = a;
		i = b;
		j = c;
	}
	void print(){
		System.out.println("I of A: "+super.i);
		System.out.println("I of B: "+i);
		System.out.println("J: "+j);
	}
}
public class Super2{
	public static void main(String[] args){
		B b = new B(5, 10, 11);
		b.print();
	}
}