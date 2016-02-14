// Lab 1.11 - Poker hands

println("Lab 1.11 - Poker hands");

int i = 0;

String rank1 = null;
String rank2 = null;
String rank3 = null;
String rank4 = null;
String rank5 = null;

String suit1 = null;
String suit2 = null;
String suit3 = null;
String suit4 = null;
String suit5 = null;

// CARD 1
while (rank1 == null) {
	println "Enter the rank of your first card: (1 - 10, K, Q, J)";
	String rank1Temp = System.console().readLine();

	if (rank1Temp == "K" || rank1Temp == "Q" || rank1Temp == "J") {
		rank1 = rank1Temp;
		break;
	}

	int rank1Int = Integer.parseInt(rank1Temp);

	if (rank1Int >= 1 && rank1Int <= 10) {
		rank1 = rank1Temp;
		break;
	}
}

while (suit1 == null) {
	println "Enter the suit of your first card: (spades, hearts, diamonds, clubs)";
	String suit1Temp = System.console().readLine();

	if (suit1Temp == "spades" || suit1Temp == "hearts" || suit1Temp == "diamonds" || suit1Temp == "clubs") {
		suit1 = suit1Temp;
	}
}

// CARD 2
while (rank2 == null) {
	println "Enter the rank of your second card: (1 - 10, K, Q, J)";
	String rank2Temp = System.console().readLine();

	if (rank2Temp == "K" || rank2Temp == "Q" || rank2Temp == "J") {
		rank2 = rank2Temp;
		break;
	}

	int rank2Int = Integer.parseInt(rank2Temp);

	if (rank2Int >= 1 && rank2Int <= 10) {
		rank2 = rank2Temp;
		break;
	}
}

while (suit2 == null) {
	println "Enter the suit of your second card: (spades, hearts, diamonds, clubs)";
	String suit2Temp = System.console().readLine();

	if (suit2Temp == "spades" || suit2Temp == "hearts" || suit2Temp == "diamonds" || suit2Temp == "clubs") {
		suit2 = suit2Temp;
	}
}

// CARD 3
while (rank3 == null) {
	println "Enter the rank of your third card: (1 - 10, K, Q, J)";
	String rank3Temp = System.console().readLine();

	if (rank3Temp == "K" || rank3Temp == "Q" || rank3Temp == "J") {
		rank3 = rank3Temp;
		break;
	}

	int rank3Int = Integer.parseInt(rank3Temp);

	if (rank3Int >= 1 && rank3Int <= 10) {
		rank3 = rank3Temp;
		break;
	}
}

while (suit3 == null) {
	println "Enter the suit of your third card: (spades, hearts, diamonds, clubs)";
	String suit3Temp = System.console().readLine();

	if (suit3Temp == "spades" || suit3Temp == "hearts" || suit3Temp == "diamonds" || suit3Temp == "clubs") {
		suit3 = suit3Temp;
	}
}

// CARD 4
while (rank4 == null) {
	println "Enter the rank of your fourth card: (1 - 10, K, Q, J)";
	String rank4Temp = System.console().readLine();

	if (rank4Temp == "K" || rank4Temp == "Q" || rank4Temp == "J") {
		rank4 = rank4Temp;
		break;
	}

	int rank4Int = Integer.parseInt(rank4Temp);

	if (rank4Int >= 1 && rank4Int <= 10) {
		rank4 = rank4Temp;
		break;
	}
}

while (suit4 == null) {
	println "Enter the suit of your fourth card: (spades, hearts, diamonds, clubs)";
	String suit4Temp = System.console().readLine();

	if (suit4Temp == "spades" || suit4Temp == "hearts" || suit4Temp == "diamonds" || suit4Temp == "clubs") {
		suit4 = suit4Temp;
	}
}

// CARD 5
while (rank5 == null) {
	println "Enter the rank of your fifth card: (1 - 10, K, Q, J)";
	String rank5Temp = System.console().readLine();

	if (rank5Temp == "K" || rank5Temp == "Q" || rank5Temp == "J") {
		rank5 = rank5Temp;
		break;
	}

	int rank5Int = Integer.parseInt(rank5Temp);

	if (rank5Int >= 1 && rank5Int <= 10) {
		rank5 = rank5Temp;
		break;
	}
}

while (suit5 == null) {
	println "Enter the suit of your fifth card: (spades, hearts, diamonds, clubs)";
	String suit5Temp = System.console().readLine();

	if (suit5Temp == "spades" || suit5Temp == "hearts" || suit5Temp == "diamonds" || suit5Temp == "clubs") {
		suit5 = suit5Temp;
	}
}

boolean poker        = false;
boolean flush        = (suit1 == suit2 && suit1 == suit3 && suit1 == suit4 && suit1 == suit5);
boolean straight     = false;
boolean threeOfAKind = false;
boolean twoPairs     = false;
boolean pair 		 = false;

// Poker
if ((rank1 == rank2 && rank1 == rank3 && rank1 == rank4) ||
	(rank1 == rank3 && rank1 == rank4 && rank1 == rank5) ||
	(rank2 == rank3 && rank2 == rank4 && rank2 == rank5)) {
	poker = true;
}

// Three of a kind
if ((rank1 == rank2 && rank1 == rank3) ||
	(rank1 == rank4 && rank1 == rank5) ||
	(rank1 == rank3 && rank1 == rank4) ||
	(rank2 == rank3 && rank2 == rank4)) {
	threeOfAKind = true;
}

// Pair
if ((rank1 == rank2) ||
	(rank1 == rank3) ||
	(rank1 == rank4) ||
	(rank1 == rank5) ||
	(rank2 == rank3) ||
	(rank2 == rank4) ||
	(rank2 == rank5) ||
	(rank3 == rank4) ||
	(rank3 == rank5) ||
	(rank4 == rank5)) {
	pair = true;
}

// Straight flush - all cards are of the same suite and their ranks are consecutive
if (straight && flush) {
	println "You have a straight flush.";
}

// Poker - four of the five cards have the same rank.
else if (poker) {
	println "You have a poker.";
}

// Full house - three of a kind plus two of a kind
else if (threeOfAKind && pair) {
	println "You have a full house";
}

// Flush - all cards share the same suit, but are not consecutive
else if (flush) {
	println "You have a flush.";
}

// Straight - all cards are consecutive, but not of the same suit
else if (straight) {
	println "You have a straight.";
} 

// Three are the same suit
else if (threeOfAKind) {
	println "You have a three of a kind.";
}

// Two pairs
else if (twoPairs) {
	println "You have two pairs.";
}

// Pair - two of the same suit
else if (pair) {
	println "You a pair.";
} 

// Nothing
else {
	println "You don't have a hand.";
}
 println "Script end."