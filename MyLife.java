import java.util.*;

public class MyLife {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		Person player = new Person("John" , 18);
		Story theStory = new Story();

		String user_command;
		String prompt;

		System.out.println("Welcome!");

		while (true) {

			prompt = ("It is a " + theStory.getWeather() + " day at " +
			          "" + theStory.getPlace() + " on " + theStory.getDate());
			System.out.println(prompt);
			System.out.println("What would you like to do?");
			user_command = reader.nextLine();

			if (user_command.equals("help")) {
				Help helper = new Help();
				helper.printMain();
			} else if (user_command.equals("exit")) {
				break;
			} else if (user_command.equals("new day")) {
				theStory.newDay();
			} else {
				System.out.println("Please enter a valid command");
			}
		}
	}
}