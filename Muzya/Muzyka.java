package muzyka;
import java.util.Scanner;
public class Muzyka {
   
    public enum Dzielo {
        Mazurek1, Mazurek2, Mazurek3, Sonata1, Sonata2, Koncert1, Koncert2, Koncert3;
    }
   
    public static void main(String[] args) {
       
        Kompozytor kompozytor1 = new Kompozytor("Jan",  "Kowalski", "XVII ", 39, new Dzielo[]{Dzielo.Mazurek3, Dzielo.Koncert1, Dzielo.Koncert3, Dzielo.Sonata1, Dzielo.Sonata2});
        Kompozytor kompozytor2 = new Kompozytor("Piotr",  "Nowak", "XX   ", 65, new Dzielo[]{Dzielo.Koncert1, Dzielo.Koncert2, Dzielo.Koncert3, Dzielo.Mazurek1, Dzielo.Mazurek2});
        Kompozytor kompozytor3 = new Kompozytor(new Dzielo[]{Dzielo.Sonata1, Dzielo.Sonata2, Dzielo.Koncert2, Dzielo.Mazurek1, Dzielo.Mazurek2}); //dzieła ustawione poprzez konstruktor
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj imie kompozytora 3. : ");
        kompozytor3.imie = sc.next();
        System.out.print("Podaj nazwisko kompozytora 3. : ");
        kompozytor3.nazwisko = sc.next();
        System.out.print("Podaj wiek twórczości kompozytora 3. : ");
        kompozytor3.wiekTworczosci = sc.next();
        while (kompozytor3.wiekTworczosci.length() < 5)
            kompozytor3.wiekTworczosci += " "; //dopełnienie długości wieku twórczości do 5 znaków spacjami
       
        System.out.print("Podaj wiek kompozytora 3. : ");
        kompozytor3.wiekMuzyka = sc.nextInt();
        kompozytor3.utwory = new Dzielo[]{Dzielo.Sonata1, Dzielo.Sonata2, Dzielo.Koncert2, Dzielo.Mazurek1, Dzielo.Mazurek2}; //dzieła ustawione ręcznie
       
        System.out.println(""); //pusta linia
         
        if (kompozytor1.sprawdzWiekTworczosci() != 0) //nie wykona się, jeżeli metoda zwróciła 0
            System.out.println("Wiek twórczości kompozytora "+kompozytor1.imie+" "+kompozytor1.nazwisko+", zapisany dziesiętnie to: "+kompozytor1.sprawdzWiekTworczosci()+".");
        if (kompozytor2.sprawdzWiekTworczosci() != 0)
            System.out.println("Wiek twórczości kompozytora "+kompozytor2.imie+" "+kompozytor2.nazwisko+", zapisany dziesiętnie to: "+kompozytor2.sprawdzWiekTworczosci()+".");
        if (kompozytor3.sprawdzWiekTworczosci() != 0)
            System.out.println("Wiek twórczości kompozytora "+kompozytor3.imie+" "+kompozytor3.nazwisko+", zapisany dziesiętnie to: "+kompozytor3.sprawdzWiekTworczosci()+".");
       
        System.out.println(""); //pusta linia
       
        kompozytor1.wyswietlStatystyki();
        kompozytor2.wyswietlStatystyki();
        kompozytor3.wyswietlStatystyki();
    }
   
}
