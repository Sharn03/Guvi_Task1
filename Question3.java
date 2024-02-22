package TASK_1;
//Question3 :
public class Question3 {
public static void main(String[] args) {
	int num = 876;
	int sum = 0;
	while(num>0)
	{
		int remainder =  num % 10;
		sum =  sum * 10 + remainder;
		num = num/10;
	}
	System.out.println("Reversed version of the given :" + sum);
}
}
