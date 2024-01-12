package twoDArrays;

import java.util.Scanner;
public class Vehiclesmodel {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of brands");
		     int rows =sc.nextInt();
			//creating an arrays
			String [][]arr=new String[rows][];
			String brand[]  = new String[rows];

			for(int i=0;i<=arr.length-1;i++) {
				System.out.println("Enter the name of brand");
		
				brand[i]=sc.next();
				
			}
			for(int i=0;i<=arr.length-1;i++) {
				System.out.println("Enter the name of model of brand "+brand[i]);
				for(int j=0;j<=arr.length-1;j++) {
					System.out.println("Enter the no. of model of "+brand[i]);
					int st=sc.nextInt();
					arr[j]=new String[st];
				}
			}
			
			for(int i=0;i<=arr.length-1;i++) {
				for(int j=0;j<=arr[i].length-1;j++) {
					System.out.println("Enter the of name of model of brand "+brand[i]);
					arr[i][j]=sc.next();
					}
			}
			for(int i=0;i<=arr.length-1;i++) {
				for(int j=0;j<=arr[i].length-1;j++) {
					System.out.println("the  name of model of brand "+brand[i]+" is "+ arr[i][j]);
		}

	}
	}

}
