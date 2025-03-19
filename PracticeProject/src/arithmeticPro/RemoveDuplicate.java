package arithmeticPro;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
	
	
	int [] a = {1,1,1,2,2,2,2,3,3,4,4,4,5,5};
	int j=0;
	
	for(int i=0; i<=a.length-1; i++) {
		
		if(a[i] != a[j]) {
			
			a[j+1] = a[i];
			j++;
			
			System.out.println(a[i]);
		}
		
		
	}
	 
	
	  
	}
}
