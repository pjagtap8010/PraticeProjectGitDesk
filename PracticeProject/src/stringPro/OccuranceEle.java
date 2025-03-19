package stringPro;

public class OccuranceEle {

	
	public static void main (String [] args) {
		
		
	//	String p = "hii pratik how are you hii";
	//	String [] p1 = p.split(" ");          
		
		 String [] p1 = {"p", "pra", "p", "jagtap", "pra"};
		
		boolean [] visited = new boolean [p1.length];
		
		for(int i=0; i<=p1.length-1; i++) {
			
			
			if(visited[i]) {
				continue;
			}
		
			 int count =1;
			for (int j=i+1; j<=p1.length-1; j++) {
				
				if(p1[i]==p1[j]) {
					
				visited[j] = true;
				count++;
				
				}
			}
			
			
			
			System.out.println(p1[i] + "=" + count);
			
		}
		
		
		
		
		
	}
	
	
}
