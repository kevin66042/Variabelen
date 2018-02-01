package h5;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdrVariabelen extends Applet{
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        //lijn
        g.drawLine(100,75,300,75);
        g.drawString("Lijn",195,90);
        //teken rechthoek
        g.drawRect(100, 100, breedte, hoogte);
        g.drawString("Rechthoek",175,215);
        //teken afgeronde rechthoek
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        g.drawString("Afgeronde rechthoek",145,340);
        //teken gevulde rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde rechthoek met ovaal", 335,215);
        //teken ovaal
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);
        //teken gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal",375,340);
        //taartpunt met ovaal eromheen
        g.setColor(opvulkleur);
        g.fillArc(530,100,breedte,hoogte,0,45);
        g.setColor(lijnkleur);
        g.drawOval(530,100,breedte,hoogte);
        g.drawString("Taartpunt met ovaal eromheen",545,215);
        //cirkel
        g.drawOval(580,225,100,hoogte);
        g.drawString("Ovaal",615,340);
    }
}
