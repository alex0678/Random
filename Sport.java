package sport;
import sprzet.PilkaDoSportu;
 
public class Sport {    
    public enum Material{guma, skora, plastik, szklo;}
 
    public static void main(String[] args){
        PilkaDoSportu pilka1 = new PilkaDoSportu(Material.guma, 10, 4);
        System.out.println("Istniejace pilki: "+PilkaDoSportu.zwrocIlosc());
        PilkaDoSportu pilka2 = new PilkaDoSportu(Material.szklo, 2, 5);
        System.out.println("Istniejace pilki: "+PilkaDoSportu.zwrocIlosc());
        System.out.println(""); //pusta linia - separator
        System.out.println("Wysokosc odbicia pilki 1. rzuconej z wysokosci 5 wynosi: "+pilka1.wysokoscOdbicia(5));
        System.out.println("Wysokosc odbicia pilki 2. rzuconej z wysokosci 8 wynosi: "+pilka2.wysokoscOdbicia(8));
        System.out.println(""); //separator
        pilka1.setPromien(pilka1.getPromien()+1);
        pilka2.setPromien(pilka2.getPromien()+1);
        System.out.println("Wysokosc odbicia powiekszonej pilki 1. rzuconej z wysokosci 5 wynosi: "+pilka1.wysokoscOdbicia(5));
        System.out.println("Wysokosc odbicia powiekszonej pilki 2. rzuconej z wysokosci 8 wynosi: "+pilka2.wysokoscOdbicia(8));
        System.out.println(""); //separator
        PilkaDoSportu[] tablica = new PilkaDoSportu[]{pilka1, pilka2};
        pokazMaterial(tablica);
    }
   
    public static void pokazMaterial(PilkaDoSportu[] tablica){
        for (int i = 0; i < tablica.length; i++)
            System.out.println("Material pilki nr "+i+". to "+tablica[i].material.toString()+".");
    }
   
}