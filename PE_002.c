#include <stdio.h>

int main(){
	
	int wynik = 0;
	int obecny = 1;
	int poprzedni = 1;
	
	while(obecny <= 4000000){
		if (obecny % 2 == 0)
			wynik += obecny;
		
		int temp = poprzedni;
		poprzedni = obecny;
		obecny = temp + obecny;
	}
	
	printf("Wynik: %d", wynik);
	getchar();
		
}
