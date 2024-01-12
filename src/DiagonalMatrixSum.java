import java.util.Scanner;
public class DiagonalMatrixSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();
        
        System.out.println("Enter the number of columns");
        int columns= sc.nextInt();
        
        //Creating an arrays
        int[][]matrix=new int[rows][columns];
        
        //For storing the value
        for (int i=0;i<=matrix.length-1;i++) {
        	System.out.println("Enter the "+columns+" elements for row "+(i+1));
        	for(int j=0;j<=matrix[i].length-1;j++) {
        		matrix[i][j]=sc.nextInt();
        	}
        }
        //for displaying the arrays
        System.out.println("The matrix are ");
        for (int i=0;i<=matrix.length-1;i++) {
        	for(int j=0;j<=matrix[i].length-1;j++) {
        		System.out.print(matrix[i][j]+" ");
        	}
        	System.out.println();
	}
     //for displaying the arrays
        int sum1=0,sum2=0;
        for (int i=0;i<=matrix.length-1;i++) {
        	for(int j=0;j<=matrix[i].length-1;j++) {
        		if(i==j) {
        			sum1=sum1+matrix[i][j];
        		}
        		if(i+j==matrix.length-1) {
        			sum2=sum2+matrix[i][j];
        	}
        }
        }
        System.out.println("The first diagonal sum is "+sum1);
        System.out.println("The second diagonal sum is "+sum2);
        
      //for displaying the arrays(Third Logic)
       /*
         int sum1=0,sum2=0;
        for (int i=0;i<=matrix.length-1;i++) {
        	sum1=sum1+matrix[i][i];
        	sum2=sum2+matrix[i][matrix.length-1-i];
        }
        System.out.println("The first diagonal sum is "+sum1);
        System.out.println("The second diagonal sum is "+sum2);
        
         // for sum of diagonal 2
        int sum2=0;
        System.out.println("The matrix are ");
        for (int i=matrix.length-1;i>=0;i--) {
        	for(int j=matrix[i].length-1;j>=0;j--) {
        		if(i==j) {
        			sum2=sum2+matrix[i][j];
        		}
        	}
        	*/
}
}