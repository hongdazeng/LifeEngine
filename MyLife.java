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

			if (user_command.equals("help")) {
				helper.printMain();
			} else if (user_command.equals("library")) {
				helper.mainlibrary();
			} else if (user_command.equalsIgnoreCase("who am i")) {
				System.out.println(player.basicInfo());
			} else if (user_command.equals("exit")) {
				break;
			} else if (user_command.equals("newday")) {
				theStory.newDay();
			} else {
				System.out.println("Please enter a valid command");
			}
		}
	}
}