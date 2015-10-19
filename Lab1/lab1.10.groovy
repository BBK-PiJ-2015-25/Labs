// Lab 1.10 - You said high, I said low. . .

println('Lab 1.10 - You said high, I said low. . .');

int current = 0;
int previous = 0;
int result = 1;

while (current != -1) {
	println("Enter a number: (enter -1 to quit)");
	String input = System.console().readLine();
	current = Integer.parseInt(input);

	if ((previous != current - 1 && previous != current + 1) && previous != 0 && current != -1) {
		result = 0;
	}

	previous = current;
}

if (result == 0) {
	println("No");
} else {
	println("Yes");
}