package arithmeticPro;

public class FibonacciSeries {
	
	 public static void main(String[] args) {
		
		  int a =0;
		  int c =0;
		  int b =1;
		  
		  while(c<14) {
			  
			  
			  c = a+b;
			  System.out.println(c);
			  a=b;
			  b=c;
			  
			  c++;
			  
			  
		  }
		 
		 
		 
		 
		 
		 
	}

}
