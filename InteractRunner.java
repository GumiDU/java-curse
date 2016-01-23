package Note;

import java.util.Scanner;

public class InteractRunner {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		while (true) 
			start: {
				if(!calculator.isSave()) {
					try {
						System.out.println("Enter first value");
						calculator.setFirst(Double.parseDouble(sc.next()));
						System.out.println("Enter symbol (+ - * / e)");
						calculator.setOperation(sc.next());
						} catch (Exception e) {
							System.out.println("Enter numbs");
							break start;
						}
				}
				try {
					System.out.println("Enter second value");
					calculator.setSecond(Double.parseDouble(sc.next()));
				} catch (Exception e) {
					System.out.println("Enter numbs");
					break start;
				}
				System.out.println("Result: " + calculator.calc());
				System.out.println("Enter 'y' to exit/ or enter any symbol to continue !");
				if(sc.next().equals("y")) {
					System.out.println("Bye bye");
					break;
				}
				else {
					System.out.println("Enter symbol 'y' not save " + "'result'/ enter any symbol 'result' use next?");
					if(!sc.next().equals("y")) {
						calculator.setSave(true);
						calculator.setFirst(calculator.getResult());
					}
				}
		}
	 }
}