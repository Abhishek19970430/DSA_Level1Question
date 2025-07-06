package interviewQuestion;
import java.util.*;
public class SpiralMatrix {
	public static void main(String [] args) {
		Scanner sc= new Scanner( System.in);
		int m=4;
		int n=4;
		
		 int[][] matrix = { { 1, 2,3,4 }, 
                	        { 5, 6,7,8 }, 
		                    { 9,10,11,12},
		                    {13,14,15,16}
		                  };
		
		
	
     int srow=0;
     int scol=0;
     int erow=m-1;
     int ecol= n-1;

     while((srow<erow)&&(scol<ecol) ){
      for(int i=srow; i<=erow;i++){
        System.out.print(matrix[i][scol]+" ,");
     }
     for(int i=scol+1; i<=ecol;i++){
        System.out.print(matrix[erow][i]+" ,");
     }

     for(int i=erow-1; i>=srow;i--){
        System.out.print(matrix[i][ecol]+" ,");
     }

     for(int i=ecol-1; i>=scol+1;i--){
        System.out.print(matrix[srow][i]+" ,");
     }


     srow++;
     scol++;
     erow--;
     ecol--;

     }
     System.out.println("END");

     


    }
		
	}
	
	

