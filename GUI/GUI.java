package gui;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
 
public class GUI {
 
    public static void main(String[] args) {
        Okno okno = new Okno("Sprê¿yna");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //zapobiegnie to nagromadzeniu procesów Javy pomimo zamykania okienek
        okno.setVisible(true);
        okno.setSize(500, 300);
        okno.setResizable(false);        
        okno.setLayout(new BorderLayout());
       
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
       
        JCheckBox checkbox = new JCheckBox("Zezwól na zmianê koloru");
        checkbox.setFocusable(false);
        panel.add(checkbox);
       
        JLabel label = new JLabel("Skróæ sprê¿ynê");
        panel.add(label);
       
        okno.add(panel, BorderLayout.SOUTH);
       
        label.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent me){
                if (!okno.okregi.isEmpty())
                    okno.okregi.remove(0);
                okno.repaint();
            }
        });
       
        okno.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent ke){
                if (checkbox.isSelected())                    
                    switch (ke.getKeyChar()) {
                        case ('r') :
                            okno.refKolor = Color.RED;
                            break;
                        case ('g') :
                            okno.refKolor = Color.GREEN;
                            break;
                        case ('b') :
                            okno.refKolor = Color.BLUE;
                            break;
                        default :
                            okno.refKolor = Color.GRAY;
                            break;
                    }
                okno.repaint();
            }
        });
       
        okno.addMouseMotionListener(new MouseAdapter(){
            @Override
            public void mouseDragged(MouseEvent me){
                if (okno.okregi.size() > 100)
                    okno.okregi.remove(0);
                okno.okregi.add(new Point(me.getLocationOnScreen().x-okno.getLocationOnScreen().x, me.getLocationOnScreen().y-okno.getLocationOnScreen().y)); //poprawka na zmainê po³o¿enia okna
                okno.repaint();
            }
        });   
    }    
}
