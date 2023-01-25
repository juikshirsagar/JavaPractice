import java.util.Scanner;

public class Strings {

	static boolean allCharactersSame(String s ,String s1,String s2)
	{
	    int n = s.length();
	    int n2=s1.length();
	    int n3=s2.length();
	    for (int i = 1; i < n; i++)
	        if (s.charAt(i) != s.charAt(0))
	            return false;
	         
	    for (int i = 1; i < n2; i++)
	        if (s1.charAt(i) != s1.charAt(0))
	            return false;
	    
	    for (int i = 1; i < n3; i++)
	        if (s2.charAt(i) != s2.charAt(0))
	            return false;
	    return true;
	}
	

		 static public void main (String[] args){
			 Scanner scan=new Scanner(System.in);
		        
	        System.out.println("Enter the string");
	        String s = scan.next();
	        String s1 = scan.next();
	        String s2 = scan.next();
	        
		    
		    String string=s.concat(s1).concat(s2);
		    System.out.println("Input String : "+string);
		    
		    if (allCharactersSame(s,s1,s2))
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		         
		    }
}
