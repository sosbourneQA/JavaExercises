
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
    	   int a = 24;
    	   int b = 26;
    	   int c = a+b;
    	   System.out.println("The sum is: "+ c);
    	   System.out.println("The sum is:" +(a+b));
    	   //sysout and then ctrl + space
    	   System.out.println(multiply(3,4, 10));
    	   System.out.println(subtract(9,4));
    	   System.out.println(division(5,10));
    	  
	}
	
	public static int multiply(int a, int b, int c) {
		return b*(a *c);
	   }
	
	
	public static int subtract(int a, int b) {
		return a-b;
	}
	
	
	public static String division(double a, double b) {
		if (a < b) {
			//int c = a/b;
			//return ""+c;
			return ""+ a/b;
			}
		else { 
			return "not possible"; 
			}
	
	}
	
	
}
