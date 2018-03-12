#include <stdio.h>

int main(){
	
	int sumofsquares = 0;
	int sum = 0;
	
	for(int i = 1; i <= 100; i++){
		sum += i;
		sumofsquares += i*i;
	}
	
	int wynik = sum*sum - sumofsquares;
		
	printf("Wynik: %i", wynik);
	getchar();
		
}
