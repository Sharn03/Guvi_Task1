package TASK_1;

import java.util.Scanner;

//Question 6: Pattern Problem
public class Question6 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int num = s.nextInt();
	//let the number be 5
	for(int row = num ; row>=1;row--)//outer loop
	{
		for(int col = num;col>=1;col--)//inner loop
		{
			if(row>col)
			{
				System.out.print(row + " ") ;
			}
			else
			System.out.print(col + " ");
		}
		System.out.println();
	}
	s.close();
}
}
