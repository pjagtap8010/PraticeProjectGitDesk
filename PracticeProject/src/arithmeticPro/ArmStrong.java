package arithmeticPro;

public class ArmStrong {
	
	public static void main(String[] args) {
		
		
		int a = 123;
		int rem =0;
		int rev =0;
		
		while(a!=0) {
			
			rem = a%10;
			rev = rev+ rem*rem*rem;
			a = a/10;
			
			
			
		}
		
		
		System.out.println(rev);
	}

}
