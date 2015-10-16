// Lab 1.16 - Rock, Paper, Scissors (*)

println("Lab 1.16 - Rock, Paper, Scissors (*)");

int playerOne = 0;
int playerTwo = 0;
int i = 0;
String result;
String playerOneResult;
String playerTwoResult;

while (i < 1) {
	println("Enter your result:");
	result = System.console().readLine();

	playerOneResult = result.substring(0, 1);
	playerTwoResult = result.substring(1);

	if (playerOneResult == playerTwoResult) {
		continue;
	}

	// Rock beats scissors
	if (playerOneResult == 'R' && playerTwoResult == 'S') {
		playerOne++;
	} else if (playerOneResult == 'S' && playerTwoResult == 'R') {
		playerTwo++;
	}

	// Scissors beat paper
	if (playerOneResult == 'S' && playerTwoResult == 'P') {
		playerOne++;
	} else if (playerOneResult == 'P' && playerTwoResult == 'S') {
		playerTwo++;
	}

	// Paper beats rock
	if (playerOneResult == 'P' && playerTwoResult == 'R') {
		playerOne++;
	} else if (playerOneResult == 'R' && playerTwoResult == 'P') {
		playerTwo++;
	}

	if (playerOne >= playerTwo + 3) {
		println('Player one wins.');
		break;
	} else if (playerTwo >= playerOne + 3) {
		println('Player two wins.');
		break;
	}
}

println("End.");