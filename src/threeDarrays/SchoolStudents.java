package threeDarrays;

import java.util.Scanner;

public class SchoolStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//creating an arrays
		int[][][]arr=new int[2][3][5];
		int arr1 [][][]=
			{
		         {
		             {1, 2, 3, 4,4},{5, 6, 7, 8,8},{9, 10, 11, 12,8}
		          },
		          {
		             {13, 14, 15, 16,9},{17, 18, 19, 20,0},{21, 22, 23, 24,89}
		          }};
		
		//Displays the arrays
		//Blocks
		for(int i=0; i<=1; i++)
		{
			//Rows
			for(int j=0; j<=2; j++)
			{
				//columns
				for(int k=0; k<=4; k++)
				{
					System.out.println("The marks of student "+(k+1)+" of class"+(j+1)+" of school "+(i+1)+" is "+arr1[i][j][k]);
					 // System.out.print("arr["+i+"]["+j+"]["+k+"] = " +arr[i][j][k]+"\t");
	            }
	            System.out.print("\n");
			}
		}
	}
}