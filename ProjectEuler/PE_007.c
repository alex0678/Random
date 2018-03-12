#include <stdio.h>
#include <math.h>

int isPrime(int n){
	for(int i = 2; i<=sqrt(n); i++)
		if(n%i == 0)
			return 0;	
	return 1;
}

int main(){
	
	int wynik = 2;
	int counter = 1;
	
	while (counter < 10001) {
		wynik++;
		if (isPrime(wynik))
			++counter;	
	}
	
	printf("Wynik: %i", wynik);
	getchar();
		
}
