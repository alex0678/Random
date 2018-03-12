package sprzet;
 
public abstract class Pilka {
    private int promien;
    private static int liczbaUtworzonychPilek = 0;
   
    protected Pilka(int promien){
        this.promien = promien;
        Pilka.liczbaUtworzonychPilek++;
    }
   
    abstract int wysokoscOdbicia(int wysokoscPoczatkowa);
   
    public static int zwrocIlosc(){
        return Pilka.liczbaUtworzonychPilek;
    }
   
    public int getPromien(){
        return this.promien;
    }
   
    public void setPromien(int promien){
        this.promien = promien;
    }
}