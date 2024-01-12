import java.util.Scanner;

public class EmployeesName {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Employees:");
        int n=sc.nextInt();
        //Creating an Array
        String[] arr=new String[n];
        //Storing the percentage of students in array
       for(int i=0;i<=arr.length-1;i++) {
    	   System.out.println("Enter the Names of Employees:");
    	   arr[i]=sc.next();
       }
       //displaying the names
       System.out.println("The Names are:");
       for(int i=0;i<=arr.length-1;i++) {
        System.out.println(arr[i]+" ");
        }
	}
}
