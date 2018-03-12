package muzyka;
import muzyka.Muzyka.Dzielo;
 
public class Kompozytor {
    public String imie;
    public String nazwisko;
    public String wiekTworczosci;
    public int wiekMuzyka;
    public Dzielo[] utwory;
   
    Kompozytor(String imie, String nazwisko, String wiekTworczosci, int wiekMuzyka, Dzielo[] utwory) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiekTworczosci = wiekTworczosci;
        this.wiekMuzyka = wiekMuzyka;
        this.utwory = utwory;
    }
   
    Kompozytor(Dzielo[] utwory){
        this.utwory = utwory;
    }
   
    public int sprawdzWiekTworczosci(){
        int wiekDec = 0;
        char[] litery = this.wiekTworczosci.toUpperCase().toCharArray(); //toUpperCase rozwiązuje problem małych i wielkich liter
        if (litery.length != 5){
            System.out.println("Długość pola wiekTwórczości jest różna od 5!");
            return 0;
        }
        for (char l : litery)
            switch (l){
                case 'X':
                    wiekDec += 10;
                    break;
               
                case 'V':
                    wiekDec += 5;                    
                    break;
                   
                case 'I':
                    wiekDec += 1;
                    break;
                   
                case ' ':
                    break;
                   
                default:
                    System.out.println("Podany wiek twórczości ma błąd!");
                    return 0; //jeżeli litera nie jest literą rzymską ani spacją, zwracamy kod błędu
            }
        return wiekDec;
    }
   
    public int ileLatZabraklo(int wiekTworczosci){
        int lata;
        lata = wiekTworczosci + this.utwory.length;
        return lata;
    }
   
    public void wyswietlStatystyki(){
        System.out.println("Imię: "+this.imie);
        System.out.println("Nazwisko: "+this.nazwisko);
        System.out.println("Wiek twórczości: "+this.wiekTworczosci);
        System.out.println("Wiek: "+this.wiekMuzyka);
        System.out.println("Dzieła: ");
        for (Dzielo u : this.utwory)
            System.out.println("- "+u.toString()+",");
        System.out.println("Kompozytorowi zabrakło "+this.ileLatZabraklo(this.sprawdzWiekTworczosci())+" lat do następnego koncertu...");
        System.out.println(""); //pusta linia
    }
}
