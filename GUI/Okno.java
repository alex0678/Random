package gui;
 
import java.awt.*;
import javax.swing.*;
import java.util.*;
 
 
public class Okno extends JFrame {
    ArrayList<Point> okregi = new ArrayList<>();
    Color refKolor = Color.BLACK;
    int limit = 100;
    int Xc;      //
    int Yc;      // zbêdne
    int Rc = 20; //
   
    Okno(String nazwaOkna){
        super(nazwaOkna);        
    }    
   
    @Override
    public void paint(Graphics g){      
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 500, 263);        
        g.setColor(refKolor);
        for (int i = 0; i < okregi.size() ; i++){
            int promien = okregi.size() - i;
            g.drawOval(okregi.get(i).x-promien, okregi.get(i).y-promien, 2*promien, 2*promien);
        }            
    }  
}
