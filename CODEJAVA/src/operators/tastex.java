package operators;

public class tastex {
		public static void main(String[] args) {
			
			
			int a = 100;
			int b = 700;
			int c = 50;
//			String r = (a > b) ? (a > c ? "a ":"c") : (b > c ? "b" :"c");
//
//			System.out.println("The greatest value is: " + r);
			
			
		String v  =  (a>b)?(a>c?"a is greater":"c is greater"):(b > c ? "b is greater" :"c is greater");
			System.out.println(v);

		}
}
