#include <stdio.h>

int main(){
	
	long dzielnik = 2;
	long long liczba = 600851475143;
	long najwieksza = 0;
	
	while (liczba > dzielnik){
		if (liczba % dzielnik == 0){
			liczba /= dzielnik;
			dzielnik = 2;
		}
			
		else{
			dzielnik++;
		
		}	
			
		
			
	}
	
	printf("Wynik: %d", dzielnik);
	getchar();
		
}
