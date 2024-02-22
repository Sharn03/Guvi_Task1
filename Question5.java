package TASK_1;
//Question - 5:
import java.util.Scanner;

public class Question5 {
public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	System.out.println("Enter the Purchase amount");
	int purchase_amount = s.nextInt();
	if(purchase_amount < 500)
	{
		System.out.println("Final Amount : " + purchase_amount);
	}
	else if(purchase_amount>=500 && purchase_amount<=1000)
	{
		int Discount_percentage = 10;
		int Final_amount  = purchase_amount - (purchase_amount*Discount_percentage)/100;
		System.out.println("Final Amount : " + Final_amount);
	}
	else
	{
		int Discount_percentage = 20;
		int Final_amount  =purchase_amount - (purchase_amount*Discount_percentage)/100;
		System.out.println("Final Amount : " + Final_amount);
	}
	s.close();
}
}
