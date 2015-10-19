// Lab 1.18 - π (**)

println("Lab 1.18 - π (**)");

String userInput;
int n;
double total;

println("Enter a number to find pie: ");

userInput = System.console().readLine();
n = Integer.parseInt(userInput);

int i = 0;
while (i >= 0) {
	if(i % 2 == 0) {
       total += -1 / ( 2 * i - 1);
	} else {
       total += 1 / (2 * i - 1);
	}

	println(total);

	i++;
}

println("End.");