package day2;

public class NumberCalculate {
	public static int add(int a,int b)
	{
		int sum=a+b;
		return(sum);
	}
	public static int sub(int a,int b)
	{
		int sub=a-b;
		return(sub);
	}
	public static int mul(int a,int b)
	{
		int mil=a*b;
		return(mil);
	}
	public static int div(int a,int b)
	{
		int div=a/b;
		return(div);
	}
	public static void main(String[] args) {
		int a=20,b=10;
		int s=add(a,b);
		System.out.println("sum of "+a+" and "+b+" = "+s);
		int m=sub(a,b);
		System.out.println("subtraction of "+a+" and "+b+" = "+m);
		int n=mul(a,b);
		System.out.println("multiplication of "+a+" and "+b+" = "+n);
		int p=div(a,b);
		System.out.println("division of "+a+" and "+b+" = "+p);

	}

}