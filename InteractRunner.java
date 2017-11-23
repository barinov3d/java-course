import java.util.Scanner;
/*
For executing calculator. Support input data from user
*/
public class InteractRunner{
	public static void main(String[] args){
	Scanner reader = new Scanner(System.in);
			try{
			Calculator calc = new Calculator();
			final String exit = "no";
			while(!exit.equals("yes")) {
				final String showResult = "no";
				System.out.println("Enter first arg :");
				String first = reader.next();
				String second = null;
				while (!showResult.equals("yes"))
				{
				if (second!=null){
				first = String.valueOf(calc.getResult());
				}
				System.out.println("Type '+','-','*','/'");
				String operator = reader.next();
				System.out.println("Enter next arg :");
				second = reader.next();
				switch(operator) {
				    	case "+": 
					    calc.add(Integer.valueOf(first), Integer.valueOf(second));
						break;
					case "-": 
					    calc.sub(Integer.valueOf(first), Integer.valueOf(second));
						break;
					case "*": 
					    calc.mult(Integer.valueOf(first), Integer.valueOf(second));
						break;
					case "/": 
					    calc.div(Integer.valueOf(first), Integer.valueOf(second));
						break;
					default: 
					    System.out.println("Wrong operator, please try again... Type '+','-','*','/' :");
					    break;
				}
				System.out.println("Show result? : yes/no");
				showResult = reader.next();
				}
				System.out.println("Result :" + calc.getResult());
				calc.cleanResult();
				System.out.println("Exit : yes/no");
				exit = reader.next();
			} 
			} finally { 
				reader.close();
			}
		}
	}	