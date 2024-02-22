package TASK_1;
//Question 1: 
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//Scanner Statment
		System.out.println("Enter the Start value");
		int start = s.nextInt();//getting the start from the user 
		System.out.println("Enter the end value");
		int end  =  s.nextInt();//getting the end value from the user
		while(start<=end)
		{
			System.out.print(start+" ");
			start++;
		}
		s.close();

	}

}
