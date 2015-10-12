/**
 * Lib1
 *
 * Naive sorting
 */

println "Enter your first number: ";
String first = System.console().readLine();

println "Enter your second number: ";
String second = System.console().readLine();

println "Enter your third number: ";
String third = System.console().readLine();

int firstNum = Integer.parseInt(first);
int secondNum = Integer.parseInt(second);
int thirdNum = Integer.parseInt(third);

// Get the highest
if (firstNum > secondNum && firstNum > thirdNum) {
   println "Highest: "+firstNum;
} else if (secondNum > firstNum && secondNum > thirdNum) {
   println "Highest: "+secondNum;
} else {
   println "Highest: "+thirdNum;
}

// Get the middle
if ((firstNum > secondNum && firstNum < thirdNum) || (firstNum < secondNum && firstNum > thirdNum)) {
   println "Middle: "+firstNum;
} else if ((secondNum > firstNum && secondNum < thirdNum) || (secondNum > thirdNum && secondNum < firstNum)) {
   println "Middle: "+secondNum;
} else {
   println "Middle: "+thirdNum;
}

// Get the lowest
if (firstNum < secondNum && firstNum < thirdNum) {
   println "Lowest: "+firstNum;
} else if (secondNum < firstNum && secondNum < thirdNum) {
   println "Lowest: "+secondNum;
} else {
   println "Lowest: "+thirdNum;
}


println "Finish";

