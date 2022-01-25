package oddEven;

public class OddEven {
	public static void main(String[] arg) {
		
		int n = 0;
		while(n<=99) {
			n++;
			if(n % 2 == 0)
				System.out.println(n + " This number is even.");
			else
				System.out.println(n + " This number is odd.");
		}
	}
}
