
public class TryCatchExample {
public static void main(String[] args) {
	int val1, val2;
    try {
      
       System.out.println("Try Block:: Start");
       val1 = 0;
       val2 = 25 / val1;
       System.out.println(val2);
       System.out.println("Try Block:: End");
    }
    catch (ArithmeticException e) { 
      
       System.out.println("ArithmeticException");
    }
   
    try{    
       String[] arr = {"s","p","t","v"};
       for(int i=0;i<=arr.length;i++) {
    	   System.out.println(arr[i]);
       }
    } 
   
    
    catch(ArrayIndexOutOfBoundsException e)  
    {  
        System.out.println("ArrayIndexOutOfBounds Exception");  
    } 
   
}  
 
}

