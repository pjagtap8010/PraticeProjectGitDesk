package arithmeticPro;

public class SecondLarge {
	
	public static void main(String[] args) {
		
		int []a = {11,45,67,32};
		int temp;
		
		for(int i=0; i<= a.length-1; i++) {
			
			for(int j=i+1; j<=a.length-1; j++) {
							
				if(a[i]<a[j]) {
					
					temp = a[i];
					a[i] = a[j];
					a[j] =  temp;				
					
				}
				
			}
			
			
		}
		
		
		System.out.println(a[1]);
		
		
	}

}
