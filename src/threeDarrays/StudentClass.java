package threeDarrays;

import java.util.Scanner;

public class StudentClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of schools ");
		int rows1=sc.nextInt();

		//creating an arrays
		int[][][]arr=new int[rows1][][];

		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the number of classes in school "+(i+1));
			int row2=sc.nextInt();
			arr[i]=new int[row2][];

			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the number  of students in class "+(j+1)+ " in school " +(i+1) );
				int st=sc.nextInt();
				arr[i][j]=new int[st];
			}
		}

			//Inputing the value
			for(int i=0;i<=arr.length-1;i++) {
				for(int j=0;j<=arr[i].length-1;j++) {
					for(int k=0;k<=arr[i][j].length-1;k++) {
						System.out.println("Enter the marks of students "+(k+1)+" in class "+(j+1)+" schools "+(i+1));
						arr[i][j][k]=sc.nextInt();
					}
				}
			}
			//Display the value
			for(int i=0;i<=arr.length-1;i++) {
				for(int j=0;j<=arr[i].length-1;j++) {
					for(int k=0;k<=arr[i][j].length-1;k++) {
						System.out.println("The marks of student "+(k+1)+" class "+(j+1)+" school "+(i+1)+" is "+arr[i][j][k]);
					}
				}
			}

		}
	}
