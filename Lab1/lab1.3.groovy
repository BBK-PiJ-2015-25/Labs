// Lab 1.3 - Yet another loop

// If the user enters a number lower than 10 it will begin the loop and ask the user
// for another number. If that number i 0 the loop will end. If the number is not equal to 1 (and not zero)
// the number will be printed and if i is still less than 10 the loop will run again. This will continue until 
// the user enters zero inside the loop or i is equal to 10.

String str = System.console().readLine();
int i = Integer.parseInt(str);
while (i < 10) {
	i++;

	String str = System.console().readLine();
	int j = Integer.parseInt(str);

	if (j == 0) {
		break;
	} else if (j != 1) {
		println j;
	}
}