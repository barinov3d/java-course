public class Calculate {
	public static void main(String [] args){
System.out.println("Welcome to simple calculator!");
		float first = Float.valueOf(args[0]);
		float second = Float.valueOf(args[1]);
		float sum = first + second;
		System.out.println(first + " + " + second + " = " + sum );
		float sub = first - second;
		System.out.println(first + " - " + second + " = " + sub );
		float div = first / second;
		System.out.println(first + " / " + second + " = " + div );
		float mult = first * second;
		System.out.println(first + " * " + second + " = " + mult );

	}
}