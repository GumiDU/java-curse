public class Calculate {
	public static void main(String[] args) {
		System.out.println("Create calculate");
		float a = Float.valueOf(args[0]);
		float b = Float.valueOf(args[1]);
		System.out.println("sum " + (a + b));
		System.out.println("razn " + (a - b));
		System.out.println("proizv " + (a * b));
		System.out.println("delenie " + (a / b));
		System.out.println("v stepen' " + Math.pow(a, b));
	}
}