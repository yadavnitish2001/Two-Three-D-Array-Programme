package twoDArrays;

import java.util.Scanner;

public class CompanyEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of companies");
		int n=sc.nextInt();
		System.out.println("Enter the number of employees in each company");
		int m=sc.nextInt();
		//creating a multidimensional arrays
		String[][]arr=new String [n][m];
		//Storing the data in arrays
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the name of company "+(i+1)+" Employee "+(j+1));
				arr[i][j]=sc.next();
			}
		}
			//Displays the data in arrays
		System.out.println("The names of Employees  and company are:");
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
				 System.out.println("The name of company "+(i+1)+" Employee "+(j+1)+" is "+arr[i][j]);
		    }
	      }
      }
}
