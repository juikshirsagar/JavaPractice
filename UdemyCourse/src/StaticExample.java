

class A{
	static int num=10;
	public static void display() {
	System.out.println("A");
	}
}
public class StaticExample {
public static void main(String[] args) {
	System.out.println(A.num);
	A.display();
}
}
