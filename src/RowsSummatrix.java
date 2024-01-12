import java.util.Scanner;

public class RowsSummatrix {

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
        int sum=0;
        for (int i=0;i<=matrix.length-1;i++) {
        	sum=0;
        	for(int j=0;j<=matrix[i].length-1;j++) {
        		sum=sum+matrix[i][j];
        	}
        	System.out.println("The sum of "+i+"th row of matrix is "+sum);
	}
	}
	

}
