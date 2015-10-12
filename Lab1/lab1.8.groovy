/**
 * Lab1
 *
 * Maximising
 */

int i = 1;
int highest = 0;

while (i > 0) {
   println "Enter your number: ";
   x = System.console().readLine();
   i = Integer.parseInt(x);
   if (i < 0) {
      break;
   }
   if (i > highest) {
      highest = i;
   }
}

println "The highest number entered was: "+highest;
