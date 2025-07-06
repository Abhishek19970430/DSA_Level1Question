package twoDArrays;
import java.util.*;
public class WavePrintMatrix {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int N= sc.nextInt();
		int M= sc.nextInt();
	
		int [][] arr= new int [N][M];
		
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j< arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		
		
		
		// column allways increse but row only increse at even and decrease at odd
		int scol=0;
		
		while(scol<M) {
			if(scol%2==0) {
				for(int i=0;i<N;i++) {
					System.out.print(arr[i][scol]+",");
				}
				
			}else {
				for(int i=N-1;i>=0;i--) {
					System.out.print(arr[i][scol]+",");
				}
			}
			scol++;
		}
		
		

				
						
	}
	
	
}
