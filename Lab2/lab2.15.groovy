// Lab 1.15 - Guess my number (*)

println("Lab 1.15 - Guess my number (*)");

int numberToGuess = Math.abs(1000 * Math.random())
int goes = 0;
int success = 0;
int guess;

while (success == 0) {
	println("Tell me a number:");
	String userGuess = System.console().readLine();
	guess = Integer.parseInt(userGuess);

	if (guess > numberToGuess) {
		println("No! My number is lower.");
	} else if (guess < numberToGuess) {
		println("No! My number is higher.");
	} else {
		success = 1;
		println("CORRECT!");
		println("You needed " + goes + " guesses");
	}

	goes++;
}



println("End.");