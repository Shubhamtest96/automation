/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    
	    String a = "Hello" ;   // string literals mutable 
	    
	    String b = "Hello"  ; 
	    // in memory another obj will not created 
	    
	    a.concat("world") ; 
	    System.out.println(a);
		System.out.println("Hello World my boy");
		
		StringBuffer sb = new StringBuffer ("Hello");
		sb.append("testing");
		  System.out.println(sb);
		  
		 // its not thread safe non sync 
		  StringBuilder sb1 = new 
	}
}
