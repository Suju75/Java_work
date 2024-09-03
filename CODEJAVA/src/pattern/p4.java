package pattern;

public class p4 {
	public static void main(String[] args) {
		
	       int num = 2;
	       for(int i=1; i<=num;i+=1) {
	    	   
	    	   
	    	   System.out.println("");
	    	    
	       }
	       
	       	for(int i=3; i>=1;i-=2) {
	    	   
	    	   for(int k=i;k<=num;k+=2) {
	    		   System.out.print(" ");
	    	   }
	    	   
	    	   for(int j=1;j<=i;j++) {
	    		   
	    		   System.out.print(" *");	
	    		   
	    	   }
	    	   System.out.println("");
	    	    
	       }
    }
}
