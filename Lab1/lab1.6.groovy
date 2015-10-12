/**
 * Lab 1
 *
 * Division
 */
println "Enter a number: ";
String first = System.console().readLine();
int firstNum = Integer.parseInt(first);

println "Enter another number: ";
String second = System.console().readLine();
int secondNum = Integer.parseInt(second);

int total = firstNum;
int times = 0;
int remainder = 0;

while (total > 0) {
   if (total >= secondNum) {
      times++;
      total -= secondNum;
   } else {
     remainder = total;
     break;
   }
}

println firstNum+" divided by "+secondNum+" is "+times+" with a remainder of "+remainder;
