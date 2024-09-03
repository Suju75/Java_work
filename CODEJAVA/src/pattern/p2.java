package pattern;

public class p2 {
	
	public static void main(String[] args) {
		
       int num = 1;
       for(int i=5; i>=num;i--) {
    	   
    	   for(int k=i;k<=5;k+=2) {
    		   System.out.print(" ");
    	   }
    	  
    	   
    	   for(int j=1;j<=i;j++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
}
}

