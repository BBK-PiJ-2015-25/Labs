/**
 * Lab 1
 *
 * Multiplication
 */
println "Enter your first number: ";
String first = System.console().readLine();
int firstNum = Integer.parseInt(first);

println "Enter your second number";
String second = System.console().readLine();
int secondNum = Integer.parseInt(second);

int total = 0;
int i = 0;

while (i < firstNum) {
    total += secondNum;
    i++;
}

println "The total is of "+firstNum+"x"+secondNum+": "+total;
