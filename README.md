# Factorial
Calculate the factorial of a number, using a recursive method. 

```
private static int factorial(int x) {
		
	if( x==0 || x==1) //Base case
		return 1;
	else //Recursive case
		return x * factorial(x-1);
}
```
