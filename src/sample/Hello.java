package sample;
import java.util.Scanner;
public class Hello 
{
	

	 
	

		public static void main(String[] args) 
		{
	      Scanner scan= new Scanner(System.in);
	      System.out.println("Enter Num");
	      int num= scan.nextInt();
	      if(num%2==0)
	      {
	    	  System.out.println("Even");
	      }
	      else
	      {
	    	  System.out.println("Odd");
	      }
		}

	}

