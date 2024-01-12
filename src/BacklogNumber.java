import java.util.Scanner;

public class BacklogNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Semester:");
        int sem=sc.nextInt();
       
        int[]arr=new int [sem];
      //Storing the number of Backlog of students in array
        for(int i=0;i<=arr.length-1;i++) {
     	   System.out.println("Do you have any backlog in semester "+(i+1)+ " ?:");
     	   boolean res=sc.nextBoolean();
     	  if(res==true) {
    		  System.out.println("Enter the number of backlogs in semester"+(i+1));
    		  int backlog=sc.nextInt();
    		  arr[i]=backlog;
    	  }
    	  else if(res==false) {
    		  arr[i]=0;
    	  }
       }
        //displaying the backlogs
        for(int i=0;i<=arr.length-1;i++) {
     	   System.out.println("The backlogs in semester "+(i+1)+":"+arr[i]);
         }
	}

}
