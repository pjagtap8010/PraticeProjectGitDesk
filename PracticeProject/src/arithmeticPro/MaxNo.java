package arithmeticPro;

public class MaxNo {
	
	public static void main(String[] args) {
		
		
		int []a = {11,45,67,32};
		int max =0;
		
		for(int i=0; i<=a.length-1; i++) {
			
			if(max<a[i]) {
				max = a[i];
			}
			
			
		}
		
		System.out.println(max);
		
	}

}
