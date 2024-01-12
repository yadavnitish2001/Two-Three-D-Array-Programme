package twoDArrays;

import java.util.Scanner;

public class StudentsPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of classes");
		int rows =sc.nextInt();
		//creating an arrays
		float [][]arr=new float[rows][];
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the numbers of students in class "+(i+1));
			int st=sc.nextInt();
			arr[i]=new float[st];
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the percentage of class "+(i+1)+" Students "+(j+1));
				arr[i][j]=sc.nextFloat();
				}
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println(" the percentage of class "+(i+1)+" Students "+(j+1)+arr[i][j]);
	}

}
	}
}
