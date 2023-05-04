package main;

@FunctionalInterface
interface Addition{
	int add(int a,int b);
}

class AdditonImpl implements Addition{
	
	@Override
	public int add(int a,int b) {
		return (a+b);
	}
}

public class LambdaFunctions {
	public static void main(String[] args) {
		Addition addition = (a, b) -> (a+b);
		System.out.print(addition.add(10,20));
	}
}
