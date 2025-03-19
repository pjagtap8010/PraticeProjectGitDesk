package arithmeticPro;

public class OccuranceNo {
	
	public static void main(String[] args) {
		
		
		int [] a = {1,3,4,5,4,2,1};
		
		boolean [] visited = new boolean[a.length];
		
		for(int i=0; i<=a.length-1; i++) {
			
			if(visited[i]) {
				continue;
			}
			
			
			int count =1;
			for(int j=i+1; j<=a.length-1; j++) {
				
				if (a[i]==a[j]) {
					
				visited[j] = true;
				count++;
				}
			}
		
			System.out.println(a[i]+ "=" + count);
		}
				
	}

}
