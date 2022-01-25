package lottoNumbers;
import java.util.random.*;

public class LottoNumbers {
	public static void main(String[] args) {
		
		int counter=(0);
		
		while(counter<6) {
			counter++;
			double getNumber = Math.random() * 100;
			System.out.println(Math.round(getNumber));
			
		}
		
	}

}
