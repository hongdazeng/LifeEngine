import java.util.*;

public class MyLife {

	static Scanner reader = new Scanner(System.in);
	static Person player = new Person("John" , 18);
	static Story theStory = new Story();
	static Help helper = new Help();

	public static void main(String[] args) {

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