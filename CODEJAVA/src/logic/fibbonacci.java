package logic;

public class fibbonacci {
		public static void main(String[] args) {
			
			
			
			int a = 0;
			int b = 1;
			int sum =a+b;
			
			System.out.println(a+" "+b);
			
			for(int i=3; i<=5;i++) {
				int c = a+b;
				System.out.println(" "+c);
				sum += c;
				a = b;
				b = c;
			}
			

			System.out.println("the sum of 10 numbers " +sum);
			

		}
}
