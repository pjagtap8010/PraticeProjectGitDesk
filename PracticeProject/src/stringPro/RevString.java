package stringPro;

public class RevString {
	
	public static void main(String[] args) {
		
		String p = "hii how are you";
		
		StringBuilder sb = new StringBuilder(p);
		sb.reverse();
		
		System.out.println(sb);
		
	}

}
