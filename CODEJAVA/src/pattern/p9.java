package pattern;

public class p9 {
public static void main(String[] args) {
	
	
	// T
	int lines = 10;
	int space = 5;
	int star = 1;
	
	
	System.out.println("Printing T:");
	
	for(int i=0;i<=lines;i++) {
		System.out.print("* ");
		
	}
	System.out.println();
	
	for(int j=1;j<=7;j++)
	{
		for(int i=1;i<=space;i++)
		{
			System.out.print("  ");
		}
		
		for(int k=1;k<=star;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	//O
	
	System.out.println("Printing O");

     for (int i = 0; i <= lines; i++) {
         for (int j = 0; j <= lines; j++) {
             if (i == 0 || i == lines || j == 0 || j == lines) {
                 System.out.print("* ");
             } else {
                 System.out.print("  ");
             }
         }
         System.out.println();
     }
     
     System.out.println("Printing P");
     
     for (int i = 0; i <= lines; i++) {
         for (int j = 0; j <= lines; j++) {
        	  if (i == 0 || i == 5  || j == 0 || (j == lines && i <=5)) {
                  System.out.print(" *");
             
             }
             
             else {
                 System.out.print("  ");
             }
         }
         System.out.println();
     }
	
     
     System.out.println("Printing S");
	
     for (int i = 0; i <= lines; i++) {
         for (int j = 0; j <= lines; j++) {
        	  if (i == 0 || i == 5 || i == lines || j == 0 && i<=5 || (j == lines && i>5 )) {
                  System.out.print(" *");
             
             }
             
             else {
                 System.out.print("  ");
             }
         }
         System.out.println();
     }
	
	
	
}
}
