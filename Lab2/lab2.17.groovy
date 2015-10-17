// Lab 1.17 - Optimus Prime (**)

println("Lab 1.17 - Optimus Prime (**)");

int userNum;
String userInput;
int i = 1;
int lower;
int higher
boolean isNotPrime;

println("Enter a number to find the nearest prime: ")
userInput = System.console().readLine();
userNum   = Integer.parseInt(userInput);

while (0 == 0) {
	
	x = i;
	isNotPrime = false;

	while (x > 0) {
	    if (i % x == 0 && x != 1 && x != i) {
	    	isNotPrime = true;
			break;
	    }
	    x--;
	}

	if (isNotPrime) {
		i++;
		continue;
	}

	if (i < userNum) {
    	lower = i;
    } else if (i > userNum) {
    	higher = i;
    	break;
    }

	i++;
}

println(lower);
println(higher);

if (userNum - lower > higher - userNum) {
	println("Closest prime number is: "+higher);
} else if (userNum - lower < higher - userNum) {
	println("Closest prime number is: "+lower);
} else {
	println("Closest prime numbers are: "+lower+" and "+higher);
}

println("End.");