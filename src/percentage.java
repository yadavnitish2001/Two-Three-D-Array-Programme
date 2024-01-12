import java.util.Scanner;

public class percentage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Semester:");
        int sem=sc.nextInt();
        //Creating an Array
        Float[] arr=new Float[sem];
        //Storing the percentage of students in array
       for(int i=0;i<=arr.length-1;i++) {
    	   System.out.println("Enter the percentage in semester "+(i+1)+":");
    	   arr[i]=sc.nextFloat();
       }
       //displaying the percentage
       System.out.println("The percentage in semester are:");
       for(int i=0;i<=arr.length-1;i++) {
    	   System.out.println("The percentage in semester "+(i+1)+" is:"+arr[i]);
        }
	}
}
