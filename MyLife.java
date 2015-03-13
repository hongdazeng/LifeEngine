import java.util.*;

public class MyLife {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		Person player = new Person("John" , 18);
		Story theStory = new Story();
		Help helper = new Help();

		String user_command;
		String prompt;

		System.out.println("Welcome!");

		while (true) {

			prompt = ("\nIt is a " + theStory.getWeather() + " day at " +
			          "" + theStory.getPlace() + " on " + theStory.getDate());
			System.out.println(prompt);
			System.out.println("What would you like to do?");
			user_command = reader.nextLine();

			try {

				if (user_command.length() > 0) {
					parseCommand(user_command);
				} else {
					System.out.println("Please enter a valid command");
				}
			} catch (Exception e) {
				System.out.println("Something bad happened, please try again");
			}
		}
	}

	public static void parseCommand (String entry) {

	}
}