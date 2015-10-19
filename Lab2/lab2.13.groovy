// Lab 13 - All the primes up to 1,000 (*)

println("Lab 13 - All the primes up to 1,000 (*)");

int i = 1;
int x;

while (i <= 1000) {
	
	x = i;

	while (x > 0) {
	    if (i % x == 0 && x != 1 && x != i) {
			break;
	    }
	    x--;
	}

	if (x == 0) {
		println(i);
	}

	i++;
}

println('End.');