// Lab 1.1 -  Ternary operator

// Prints whether the user is an adult if their age is above 17

int currentYear = 2012;
print "When were you born (year)?";

String str = System.console().readLine();
int birthYear = Integer.parseInt(str);

int ageAprox = currentYear - birthYear;

String result = (ageAprox > 17) ? "" : "not ";
println "It seems you are " + result + "an adult.";