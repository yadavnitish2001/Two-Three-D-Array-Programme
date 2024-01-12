package twoDArrays;

import java.util.Scanner;

public class TeamPlayers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of teams");
        int n=sc.nextInt();
        //creating an arrays
        int[][]arr=new int[n][];
        
        for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the number of players in team  "+(i+1));
			int cols=sc.nextInt();
			arr[i]=new int[cols];
		}
        
        
        //Storing the data in arrays
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the height of team "+(i+1)+" player "+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
		
		//Displaying the data in arrays
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr[i].length;j++) {
						System.out.println("The height of teams "+(i+1)+" player "+(j+1)+" is "+arr[i][j]);
						
					}
				}

	}

}
