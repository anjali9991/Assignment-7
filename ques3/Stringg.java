package ques3;
import java.util.Scanner;
public class Stringg {
public static void main(String[] args)
{
	String str1;
	String str2;
	Scanner sc=new Scanner(System.in);
	str1=sc.nextLine();
	str2=sc.nextLine();
	sc.close();
	int num1=Integer.parseInt(str1);
	int num2=Integer.parseInt(str2);
	if(num1>num2)
		System.out.print(num1+" is greater number");
	else
		System.out.print(num2+" is greater number");
}
}
