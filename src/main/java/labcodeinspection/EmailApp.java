package labcodeinspection;

import java.util.Scanner;
import java.util.logging.Logger;

public class EmailApp {

	private static final Logger LOGGER = Logger.getLogger(EmailApp.class.getName());

	private EmailApp() {
	}

	public static void main(final String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

			LOGGER.info("Enter your first name: ");
			final String firstName = scanner.nextLine();

			LOGGER.info("Enter your last name: ");
			final String lastName = scanner.nextLine();

			LOGGER.info("\nDEPARTMENT CODE\n1. for sales\n2. for Development\n3. for accounting\nEnter code: ");

			final int depChoice = scanner.nextInt();

			final Email email = new Email(firstName, lastName);
			email.setDeparment(depChoice);
			email.generateEmail();
			email.showInfo();
		}
	}
}