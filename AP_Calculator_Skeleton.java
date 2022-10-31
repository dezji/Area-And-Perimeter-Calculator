package dezji;

import static java.lang.System.out;
import java.util.Scanner;

public class AP_Calculator_Skeleton {

	public static void main(String[] args) {

		// variables needed for project
		Scanner inputLine = new Scanner(System.in);
		String userInput;
		String starCount = " * ";

		String retryMessage = "\nPlease enter a correct answer.";
		String negativeNumberMessage = "\nThe number must be greater than zero!";
		String typeOfCalculation = "\nWhich calculation would you like to do:\n(A)rea or (P)erimeter?";
		String typeOfShape = "\nWhat shape is it: (S)quare or (R)ectangle?";
		String startOverMessage = "\nWould you like to perform another calculation:\n(Y)es or (N)o?";

		String squareAreaQuestion = "\nEnter the number for any side:";
		String rectangleAreaQuestion_Side1 = "\nPlease enter the first number for side 1 (This side can be any side of the shape that you choose, length or height):";
		String rectangleAreaQuestion_Side2 = "\nPlease enter the second number for side 2\n(If you choose length for side 1, you must use the width for this number. If you chose width for side 1, you must use the length for this number):";

		boolean isInvalid = true;
		boolean startOver = true;

		int area = 0;
		int perimeter = 0;

		int side1 = 0;
		int side2 = 0;

		// welcome message
		out.println("\nWelcome to the Area and Perimeter Calculator!");

		/* Main While loop */
		while (startOver) {
			isInvalid = true;

			/* Prompt */
			// prompt user for type of calculation
			out.println(typeOfCalculation);
			userInput = inputLine.next().toUpperCase().substring(0, 1);
			inputLine.nextLine();

			/* While loop */
			// this loop validates a user's answer
			while (isInvalid) {

				if (!userInput.equals("A")) {
					if (!userInput.equals("P")) {
						out.println(retryMessage);
						out.println(typeOfCalculation);
						userInput = inputLine.next().toUpperCase();
					}

					// exits loop if conditions are true
					else {
						isInvalid = false;
					}
				}

				// exits loop if conditions are true
				else {
					isInvalid = false;
				}
			} /* End of while loop */

			// reset the invalid bool
			isInvalid = true;

			/* Area */
			// if choice is area, calculate here
			if (userInput.equals("A")) {

				/* Prompt */
				// determine the shape (rectangle or square)
				out.println(typeOfShape);
				userInput = inputLine.next().toUpperCase().substring(0, 1);
				inputLine.nextLine();

				/* While loop */
				// this loop validates a user's answer
				while (isInvalid) {

					if (!userInput.equals("S")) {
						if (!userInput.equals("R")) {
							out.println(retryMessage);
							out.println(typeOfShape);
							userInput = inputLine.next().toUpperCase();
						}

						// exits loop if conditions are true
						else {
							isInvalid = false;
						}
					}

					// exits loop if conditions are true
					else {
						isInvalid = false;
					}
				} /* End of while loop */

				// reset the invalid bool
				isInvalid = true;

				/* Square */
				if (userInput.equals("S")) {

					/* While loop */
					// this loop validates a user's answer
					while (isInvalid) {
						out.println(squareAreaQuestion);
						while (!inputLine.hasNextInt()) {
							out.print(retryMessage);
							out.println(squareAreaQuestion);
							inputLine.next();
						}

						side1 = inputLine.nextInt();

						if (side1 <= 0) {
							out.print(negativeNumberMessage);
						} else {
							isInvalid = false;
						}

					} /* End of while loop */

					inputLine.nextLine();

					// reset the invalid bool
					isInvalid = true;

					// square calculation area in here
					area = side1 * side1;

					out.println("\nThe area for this square is " + area + ".\nThis is because " + side1 + " * " + side1
							+ " = " + area + ".");
					out.println("\nArea means the space inside of a shape." + "\nThis can be drawn out by making "
							+ side1 + " boxes " + side1 + " times in the shape of a square.\n");

					// calculation for square is number * number, number squared but add it together
					// for him then multiply it then square it. explain like he's five
					for (int i = 0; i < side1; i++) {
						out.println(starCount.repeat(side1));
					}

					// prompt the user for whether they want to perform another calculation
					out.println(startOverMessage);
					userInput = inputLine.nextLine().toUpperCase().substring(0, 1);

					while (isInvalid) {
						if (userInput.equals("Y")) {
							isInvalid = false;
							startOver = true;
						} else if (userInput.equals("N")) {
							isInvalid = false;
							startOver = false;
						} else {
							if (!userInput.equals("Y")) {
								if (!userInput.equals("N")) {
									out.print("\nPlease choose (Y)es or (N)o.");
									out.println(startOverMessage);
									userInput = inputLine.next().toUpperCase().substring(0, 1);
								}
							}
						}
					} // end of start over prompt

				} /* End of Square */

				/* Rectangle */
				else {

					/* While loop */
					// this loop validates a user's answer
					while (isInvalid) {
						out.println(rectangleAreaQuestion_Side1);
						while (!inputLine.hasNextInt()) {
							out.print(retryMessage);
							out.println(rectangleAreaQuestion_Side1);
							inputLine.next();
						}

						side1 = inputLine.nextInt();

						if (side1 <= 0) {
							out.print(negativeNumberMessage);
							;
						}

						else {
							isInvalid = false;
						}

					} /* End of while loop */

					inputLine.nextLine();

					// reset the invalid bool
					isInvalid = true;

					/* While loop */
					// this loop validates a user's answer
					while (isInvalid) {
						out.println(rectangleAreaQuestion_Side2);

						while (!inputLine.hasNextInt()) {
							out.print(retryMessage);
							out.println(rectangleAreaQuestion_Side2);
							inputLine.next();
						}

						side2 = inputLine.nextInt();

						if (side2 <= 0) {
							out.print(negativeNumberMessage);
						}

						else {
							isInvalid = false;
						}
					} /* End of while loop */

					inputLine.nextLine();

					// reset the invalid bool
					isInvalid = true;

					// calculation for rectangle area

					area = side1 * side2;

					out.println("\nThe area for this rectangle is " + area + ".\nThis is because " + side1 + " * "
							+ side2 + " = " + area + ".");
					out.println("\nArea means the space inside of a shape." + "\nThis can be drawn out by making "
							+ side1 + " boxes " + side2 + " times in the shape of a rectangle.\n");

					// calculation for square is number * number, number squared but add it together
					// for him then multiply it then square it. explain like he's five
					for (int i = 0; i < side2; i++) {
						out.println(starCount.repeat(side1));
					}

					// prompt the user for whether they want to perform another calculation
					out.println(startOverMessage);
					userInput = inputLine.nextLine().toUpperCase().substring(0, 1);

					while (isInvalid) {
						if (userInput.equals("Y")) {
							isInvalid = false;
							startOver = true;
						} else if (userInput.equals("N")) {
							isInvalid = false;
							startOver = false;
						} else {
							if (!userInput.equals("Y")) {
								if (!userInput.equals("N")) {
									out.print("\nPlease choose (Y)es or (N)o.");
									out.println(startOverMessage);
									userInput = inputLine.next().toUpperCase().substring(0, 1);
								}
							}
						}
					} // end of start over prompt
				} /* End of Rectangle */
			} /* End of area */

			/* Perimeter */
			// if choice is perimeter
			else {
				/* Prompt */
				// determine the shape (rectangle or square)
				out.println(typeOfShape);
				userInput = inputLine.next().toUpperCase().substring(0, 1);
				inputLine.nextLine();

				/* While loop */
				// this loop validates a user's answer
				while (isInvalid) {

					if (!userInput.equals("S")) {
						if (!userInput.equals("R")) {
							out.println(retryMessage);
							out.println(typeOfShape);
							userInput = inputLine.next().toUpperCase();
						}

						// exits loop if conditions are true
						else {
							isInvalid = false;
						}
					}

					// exits loop if conditions are true
					else {
						isInvalid = false;
					}
				} /* End of while loop */

				// reset the invalid bool
				isInvalid = true;

				/* Square */
				if (userInput.equals("S")) {

					/* While loop */
					// this loop validates a user's answer
					while (isInvalid) {
						out.println(squareAreaQuestion);
						while (!inputLine.hasNextInt()) {
							out.print(retryMessage);
							out.println(squareAreaQuestion);
							inputLine.next();
						}

						side1 = inputLine.nextInt();

						if (side1 <= 0) {
							out.print(negativeNumberMessage);
						} else {
							isInvalid = false;
						}

					} /* End of while loop */

					inputLine.nextLine();

					// reset the invalid bool
					isInvalid = true;

					// square calculation area in here
					perimeter = side1 * 4;

					out.println("\nThe perimeter for this square is " + perimeter + ".\nThis is because 4" + " * "
							+ side1 + " = " + perimeter + ".\n"
							+ "The 4 comes from a square having 4 equal sides.\nThese sides have the length of " + side1
							+ ".");
					out.println("\nPerimeter means the space outside of a shape."
							+ "\nThis can be understood by writing the number " + side1
							+ " on each side of the square.\n" + "The equation for the picture would then be:\n" + side1
							+ " + " + side1 + " + " + side1 + " + " + side1 + " = " + perimeter + ".");

					// prompt the user for whether they want to perform another calculation
					out.println(startOverMessage);
					userInput = inputLine.nextLine().toUpperCase().substring(0, 1);

					while (isInvalid) {
						if (userInput.equals("Y")) {
							isInvalid = false;
							startOver = true;
						} else if (userInput.equals("N")) {
							isInvalid = false;
							startOver = false;
						} else {
							if (!userInput.equals("Y")) {
								if (!userInput.equals("N")) {
									out.print("\nPlease choose (Y)es or (N)o.");
									out.println(startOverMessage);
									userInput = inputLine.next().toUpperCase().substring(0, 1);
								}
							}
						}
					} // end of start over prompt

				} /* End of Square */

				/* Rectangle */
				else {

					/* While loop */
					// this loop validates a user's answer
					while (isInvalid) {
						out.println(rectangleAreaQuestion_Side1);
						while (!inputLine.hasNextInt()) {
							out.print(retryMessage);
							out.println(rectangleAreaQuestion_Side1);
							inputLine.next();
						}

						side1 = inputLine.nextInt();

						if (side1 <= 0) {
							out.print(negativeNumberMessage);
							;
						}

						else {
							isInvalid = false;
						}

					} /* End of while loop */

					inputLine.nextLine();

					// reset the invalid bool
					isInvalid = true;

					/* While loop */
					// this loop validates a user's answer
					while (isInvalid) {
						out.println(rectangleAreaQuestion_Side2);

						while (!inputLine.hasNextInt()) {
							out.print(retryMessage);
							out.println(rectangleAreaQuestion_Side2);
							inputLine.next();
						}

						side2 = inputLine.nextInt();

						if (side2 <= 0) {
							out.print(negativeNumberMessage);
						} else {
							isInvalid = false;
						}
					} /* End of while loop */

					inputLine.nextLine();

					// reset the invalid bool
					isInvalid = true;

					// calculation for rectangle area
					perimeter = 2 * (side1 + side2);

					// output the results and explanation
					out.println("\nThe perimeter for this rectangle is " + perimeter + ".\nThis is because " + side1
							+ " * 2 = " + (side1 * 2) + "." + "\nAnd " + side2 + " * 2 = " + (side2 * 2)
							+ ".\nWhen you add " + (side1 * 2) + " and " + (side2 * 2) + " together, you end up with "
							+ perimeter + " as the perimeter for this rectangle.");
					out.println("\nPerimeter means the space outside of a shape.\nA rectangle has "
							+ "2 parallel sides for the width, and 2 parallel sides for the length.\n"
							+ "That's where the 2 comes from when multiplying the sides together.\n"
							+ "Once you've done that, all you have to do is add the numbers together and you get "
							+ "the perimeter of the rectangle.");

					// prompt the user for whether they want to perform another calculation
					out.println(startOverMessage);
					userInput = inputLine.nextLine().toUpperCase().substring(0, 1);

					while (isInvalid) {
						if (userInput.equals("Y")) {
							isInvalid = false;
							startOver = true;
						} else if (userInput.equals("N")) {
							isInvalid = false;
							startOver = false;
						} else {
							if (!userInput.equals("Y")) {
								if (!userInput.equals("N")) {
									out.print("\nPlease choose (Y)es or (N)o.");
									out.println(startOverMessage);
									userInput = inputLine.next().toUpperCase().substring(0, 1);
								}
							}
						}
					} // end of start over prompt
				} /* End of Rectangle */
			} /* End of perimeter */
		}

		out.print("Thank you for using the Area and Perimeter Calculator!");
		inputLine.close();
	}

}
