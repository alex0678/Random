#include <stdio.h>

int GCD(int a, int b){
	int smaller = a < b ? a : b;  
	int bigger = a > b ? a : b;
	
	for(int i = smaller; i > 0; i--)
		if(!(smaller%i) && !(bigger%i))
			return i;
}

int LCM(int a, int b){
	int smaller = a < b ? a : b;  
	int bigger = a > b ? a : b;
	
	return bigger/GCD(a, b)*smaller;
}

int main(){
	
	int wynik = 1;

	for(int i = 1; i <= 20; i++)
		wynik = LCM(i, wynik);
		
	printf("Wynik: %i", wynik);
	getchar();
		
}
