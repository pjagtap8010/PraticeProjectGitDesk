package stringPro;

public class RemoveSpl {
	
	public static void main(String[] args) {
		
		String p =   "opi*(&564<>ljFDSE)";
	
		String p1 = p.replaceAll("[^a-zA-Z0-9]", " ");
		
		System.out.println(p1);
		
		
	}

}
