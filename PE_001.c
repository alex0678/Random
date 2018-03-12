#include <stdio.h>

int main(){
	
	int wynik = 0;
	
	for(int i = 1; i < 1000; i++){
		if(i%3 == 0 || i%5 == 0)
			wynik += i;
	}
		
	printf("Wynik: %d", wynik);
	getchar();
		
}
