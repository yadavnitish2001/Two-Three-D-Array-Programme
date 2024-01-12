package twoDArrays;

import java.util.Scanner;

public class Hospital {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers of hospitals");
		int rows=sc.nextInt();		
		//creating an arrays
		int[][]arr=new int[rows][];
		/*
		arr[0]=new int[2];
		arr[1]=new int[4];
		arr[2]=new int[3];
		*/
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the number of patients in hospital  "+(i+1));
			int cols=sc.nextInt();
			arr[i]=new int[cols];
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the age for hospital "+(i+1)+" patients "+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("The age for hospital "+(i+1)+" patients "+(j+1)+" is "+arr[i][j]);
			}
		}
	}
}
