package stringPro;

public class CapitalFirstChar {
	
	public static void main(String[] args) {
		
		String p = "hii pratik how";
		String p1 [] = p.split(" ");
		
		
		for(int i=0; i<=p1.length-1; i++) {
			
			char c = p1[i].charAt(0);
			 String str = String.valueOf(c).toUpperCase();
			 String sub = p1[i].substring(1);
			 
			 System.out.print(str+ sub+ " ");
			
			
			
			
			
		}
		
		
		
	}

}
