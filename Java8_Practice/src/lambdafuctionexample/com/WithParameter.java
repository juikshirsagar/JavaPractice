package lambdafuctionexample.com;

interface Sum{
	void sum(int num);
	
}

interface Subtract{
	int subtract(int a,int b);
}


public class WithParameter {
 public static void main(String[] args) {
	Sum s= (input)-> System.out.println("Sum "+input);
	s.sum(6);
	
	Subtract sub=( a, b)->{
		if(a<b) {
			throw new RuntimeException("Invalid");
		}else {
			return a-b;
		}
	};
	
	
	
	System.out.println(sub.subtract(9,6));
	
	
}
	
}
