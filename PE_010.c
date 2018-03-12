#include <stdio.h>
#include <math.h>

int main(){
	int limit = 2000000;
	//int limit = 10;
	unsigned long long wynik = 0;
	
	char tab[limit];
	
	for(int i = 2 ; i < limit; i++)
		tab[i] = 0;
		
	for(int i = 2; i < sqrt(limit); i++)
		if(tab[i] == 0)
			for(int j = i*i ; j < limit; j+=i)
				tab[j] = 1;						
		
	for(int i = 2; i < limit; i++)
		if(tab[i] == 0)
			wynik += i;
			
	printf("Wynik: %llu", wynik);
	getchar();		
}
