  

//public class ReverseString {
//	public static void main (String[]args) {
//		String str = "Shubham";
//				
//				StringBuffer sb = new StringBuffer(str);
//		                  System.out.println(sb.reverse());
//	}
//}




public class ReverseString {
	
	public static void main(String[]args) {
		String str = "Hello";
		String rev = "";
           int len = str.length();
           
           
		for ( int i = len-1; i>=0; i--)
		{
			  rev = rev +str.charAt(i);	
		}
		System.out.println("String var is ..." + rev);
}
}
