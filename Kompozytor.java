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
        char[] litery = this.wiekTworczosci.toUpperCase().toCharArray(); //toUpperCase rozwi¹zuje problem ma³ych i wielkich liter
        if (litery.length != 5){
            System.out.println("D³ugoœæ pola wiekTwórczoœci jest ró¿na od 5!");
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
                    System.out.println("Podany wiek twórczoœci ma b³¹d!");
                    return 0; //je¿eli litera nie jest liter¹ rzymsk¹ ani spacj¹, zwracamy kod b³êdu
            }
        return wiekDec;
    }
   
    public int ileLatZabraklo(int wiekTworczosci){
        int lata;
        lata = wiekTworczosci + this.utwory.length;
        return lata;
    }
   
    public void wyswietlStatystyki(){
        System.out.println("Imiê: "+this.imie);
        System.out.println("Nazwisko: "+this.nazwisko);
        System.out.println("Wiek twórczoœci: "+this.wiekTworczosci);
        System.out.println("Wiek: "+this.wiekMuzyka);
        System.out.println("Dzie³a: ");
        for (Dzielo u : this.utwory)
            System.out.println("- "+u.toString()+",");
        System.out.println("Kompozytorowi zabrak³o "+this.ileLatZabraklo(this.sprawdzWiekTworczosci())+" lat do nastêpnego koncertu...");
        System.out.println(""); //pusta linia
    }
}