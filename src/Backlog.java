import java.util.Scanner;

public class Backlog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Semester:");
        int sem=sc.nextInt();
        //Creating an Array
        String[] arr=new String[sem];
        //Storing the Backlog of students in array
       for(int i=0;i<=arr.length-1;i++) {
    	   System.out.println("Do you have any backlog in semester "+(i+1)+ " ?:");
    	   boolean a=sc.nextBoolean();
    	  if(a==true) {
    		  arr[i]="Yes";
    	  }
    	  else if(a==false) {
    		  arr[i]="No";
    	  }
       }
       //displaying the backlogs
       for(int i=0;i<=arr.length-1;i++) {
    	   System.out.println("The backlogs in semester "+(i+1)+":"+arr[i]);
        }
	}

}
