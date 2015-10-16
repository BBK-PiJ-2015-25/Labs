// Lab 14 -  Up to 1,000 primes (*)

println("Lab 14 -  Up to 1,000 primes (*)");

int i = 1;
int x;
int total = 0;

while (total <= 1000) {
	
	x = i;

	while (x > 0) {
	    if (i % x == 0 && x != 1 && x != i) {
			break;
	    }
	    x--;
	}

	if (x == 0) {
		total++;
		println(i);
	}

	i++;
}

println('End.');