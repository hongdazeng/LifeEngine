import java.util.*;

public class Help {

	Scanner reader = new Scanner (System.in);
	String user_command;

	public void printMain() {
		System.out.println("Type library for command look up");
		System.out.println("Type exit to quit");
		System.out.println("Type 'who am i' to see your basic stats");
	}

	public void mainlibrary() {
		while (true) {
			System.out.println("Please enter a term to look up");
			user_command = reader.nextLine();

			if (user_command.equals("exit")) {
				break;
			} else if (user_command.equals("newday")) {
				System.out.println("newday - Increments day by 1");
				break;
			} else {
				System.out.println("The specific term is invalid");
			}
		}
	}
}