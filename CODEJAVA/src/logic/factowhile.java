package logic;

public class factowhile {

	
		public static void main(String[] args) {
			
			int a=5;
			int fac=1;
			int i=1;
			while(i<=a) {
				fac *= i;
				i++;
			}
			System.out.println("factorial of "+a +" "+"is " +fac);
			
		}
}
