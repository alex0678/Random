package sprzet;
import sport.Sport.Material;
 
public class PilkaDoSportu extends Pilka{
    int sprezystosc;
    public Material material;
   
    public PilkaDoSportu(Material material, int sprezystosc, int promien){
        super(promien);  
        this.sprezystosc = sprezystosc;
        this.material = material;
    }
   
    @Override
    public int wysokoscOdbicia(int wysokoscPoczatkowa){
        return wysokoscPoczatkowa * this.sprezystosc * this.getPromien();
    }
}
