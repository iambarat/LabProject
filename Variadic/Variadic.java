
public class Variadic {

	public static void main(String[] args) {
		System.out.println("The sum is : " + fun(5,6,7,9));
	
	}
	public static int fun(int... n)
	{
		int sum = 0;
		for(int value : n)
			sum += value;
		return sum;
	}

}
