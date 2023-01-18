class Fibonnaci
{
 public static void main(String[] args)
 {
    int a=0;
	int b=1;
	int n=9;
	System.out.println(a);
	System.out.println(b);
	for(int i=0;i<n;i++)
	{
	int c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	}
	
	
 }
}
/*:\learn\java\java_she _arise\interviewcode>java Fibonacci.java
0
1
1
2
3
5
8
13
21
34
55*/