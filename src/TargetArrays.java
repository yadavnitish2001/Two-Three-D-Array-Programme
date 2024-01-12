
import java.util.Scanner;

public class TargetArrays {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Scanner sc=new Scanner(System.in);
		      System.out.println("Enter the size of an arrays");
		      int size=sc.nextInt();
		      //creating an arrays
		      int[]arr=new int[size];
		      
		      //for storing the values in arrays
		      
		      System.out.println("Enter the "+arr.length+" number");
		      for(int i=0;i<=arr.length-1;i++) {
		    	  arr[i]=sc.nextInt();
		      }
		      //taking an input of key for searching
		      System.out.println("Enter the target values for adding two values  from arrays");
		      int target=sc.nextInt();
		      
		      for(int i=0;i<=arr.length-1;i++) {
		    	  for(int j=i+1;j<=arr.length-1;i++) {
		    		  if(arr[i]+arr[j]==target) {
		    			  System.out.println("The sum of indexes "+(j)+" and "+(i)+" is equal to target values "+target);
		    			  return;
		    		  }
		    	  }  
		    	  }

			  System.out.println("The elements not find the sum in arrays");
		      }
			
		}

