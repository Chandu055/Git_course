package Practice;

import java.util.Scanner;

public class ATMPinValidation {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Assuming a predefined PIN for demonstration purposes
	        final String correctPin = "1234";
	        int attempts = 0;
	        boolean accessGranted = false;

	        // Limiting the user to 3 attempts
	        while (attempts < 3 && !accessGranted) {
	            System.out.print("Enter your PIN: ");
	            String enteredPin = scanner.nextLine();
	            attempts++;

	            if (enteredPin.equals(correctPin)) {
	                System.out.println("Access Granted.");
	                accessGranted = true;
	            } else {
	                System.out.println("Incorrect PIN. Please try again.");
	            }
	        }

	        if (!accessGranted) {
	            System.out.println("You have exceeded the maximum number of attempts. Your account is locked.");
	        }

	        scanner.close();
	    
	}

	}


