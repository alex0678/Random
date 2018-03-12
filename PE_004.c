#include <stdio.h>

int rev(int number){
	int reversed = 0;
	
	while(number > 0){
		reversed *= 10;
		reversed += number % 10;
		number /= 10;
	}
	
	return reversed;
}

int main(){
	
	int wynik = 0;
	
	for(int i = 100; i < 1000; i++)
		for(int j = 100; j<1000; j++){
			if(i*j == rev(i*j) && i*j > wynik)
				wynik = i*j;				
		}
		
	printf("Wynik: %d", wynik);
	getchar();
		
}
