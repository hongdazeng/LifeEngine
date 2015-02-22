import java.util.*;

public class MyLife {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		Person player = new Person("John" , 18);

		String user_command;

		while (true) {
			System.out.println("What would you like to do?");
			user_command = reader.nextLine();
			if (user_command.equals("help")) {
				Help helper = new Help();
				helper.printMain();
			} else if (user_command.equals("exit")) {
				break;
			}

		}
	}
}