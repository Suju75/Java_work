package Marksex;

public class exmark {
		public static void main(String[] args) {
			int mark = 91;
			
			if(mark>90 && mark<=100)
			{
				System.out.println("A grade");
			}
			else if(mark>70 && mark<=90 )
			{
				System.out.println("B grade");
			}
			else if(mark>50 && mark<=70 )
			{
				System.out.println("C grade");
			}
			else if(mark>34 && mark<=50 )
			{
				System.out.println("D grade");
			}
			else if(mark>0 && mark<=34 )
			{
				System.out.println("F grade");
			}
			else
			{
				System.out.println("INVALID OUTPUT");
			}
			
		}
	
	
}
