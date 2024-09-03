package Marksex;

import java.util.Scanner;

public class exmark {
		public static void main(String[] args) {
//			int mark = 91;
			String choice = "Y";
			
			do {
				
				Scanner sc = new Scanner(System.in);
				System.out.println("enter marks : ");
				int mark = sc.nextInt();
				
				
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
				System.out.println("INVALID INPUT");
			}
			System.out.println("do you want to continue ? Y/N ?");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("Y"));
		}
	
	
}
