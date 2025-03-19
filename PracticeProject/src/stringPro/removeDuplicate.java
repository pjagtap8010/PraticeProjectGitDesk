package stringPro;

public class removeDuplicate {
	
	public static void main(String[] args) {
		String p = "hii pratik how";
		String r = "";
		
		for(int i=0; i<=p.length()-1; i++) {
			
			 String ch = "" + p.charAt(i);
			 
			if(r.contains(ch)) {
				
				continue;
				
				
				
			}
			
			r += ch;
		     
			
		}
		System.out.print(r);
		
	}

}
