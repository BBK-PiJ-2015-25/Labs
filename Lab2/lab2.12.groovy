// Lab 1.12 - Number pyramids

println("Lab 1.12 - Number pyramids");

int i = 0;
int x;

while (i < 10) {
	x = i;

	while (x > 0) {
		print(i);
		x--;
	}
	println(' ');

	i++;
}

println("End.");