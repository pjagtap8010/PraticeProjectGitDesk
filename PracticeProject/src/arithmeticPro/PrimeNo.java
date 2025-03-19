package arithmeticPro;

public class PrimeNo {
	
	public static void main(String[] args) {
		
		int a = 47;
		int b= 0;
		
		for(int i=2; i<=a-1; i++) {
			
			if(a%i==0) {
				
				b=1;
			}
				
		}
		if(b==0) {
			System.out.println("prime");
		}
		
		
	}

}
