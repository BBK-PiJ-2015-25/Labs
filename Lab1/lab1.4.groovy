/**
 * Lab 1
 *
 * Prime number
 */

println "Please enter a number to see if it is prime:";

String userInput = System.console().readLine();
int userNumber   = Integer.parseInt(userInput);

int i = 10;

while (i > 0) {
    println userNumber + " - " + i;
    if (userNumber % i == 0 && i != userNumber && i != 1) {
	println "This number is not a prime number";
	break;
    }
    i--;
}

if (i == 0) {
    println "The number is a prime number";
}
