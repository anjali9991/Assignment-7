package ques2;

public class Main extends Animal{
	void eat()
	{
		System.out.println("Animal eats!!");
	}
public static void main(String[] args)
{
	Animal a=new Main();
	a.eat();
	a.speak();
}
}
