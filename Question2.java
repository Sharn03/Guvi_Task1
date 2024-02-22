package TASK_1;
//Question 2 :
import java.util.Scanner;

public class Question2 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while(true)// while statement used to get input for multiple times
		
	{
		System.out.println("Enter the number");
		long num = s.nextInt();
		
		if(num<0)
			{
			System.out.println("Given number is Negative number\n");
			}
		else if(num>0)
			{
			System.out.println("Given number is Positive number\n");
			}
		else
			{
			System.out.println("Given number is neutral\n");
			s.close();// inorder close the resource leakage
			return;
			}
	}
	
	
 }
}
