package TASK_1;
//Question:4
import java.util.Scanner;

public class Question4 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the 3 inputs");
	int num1 = s.nextInt();
	int num2 = s.nextInt();
	int num3 = s.nextInt();
	if(num1<num2 && num1<num3)
	{
		System.out.println("The minimum number is :" + num1);
	}
	else if(num2<num1 && num2<num3)
	{
		System.out.println("The minimum number is :" + num2);
	}
	else
	{
		System.out.println("The minimum number is :"+ num3);
	}
	s.close();
}
}
