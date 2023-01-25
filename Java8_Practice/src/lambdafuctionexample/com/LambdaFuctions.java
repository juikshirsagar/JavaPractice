package lambdafuctionexample.com;

interface Calculator{
	void switchOn();
}

public class LambdaFuctions {

	public static void main( String[] args) {
		Calculator cal = () -> System.out.println("Switch On");
			cal.switchOn();
}
}