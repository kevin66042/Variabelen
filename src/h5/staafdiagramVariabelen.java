package h5;

import java.awt.*;
import java.applet.*;

public class staafdiagramVariabelen extends Applet{

    int Jeroen;
    int Valerie;
    int Hans;
    int Xas;

    public void init() {
        //Gewicht van de personen in KG
        Jeroen = 57;
        Valerie = 70;
        Hans = 10;

        Xas = 200;
    }

    public void paint(Graphics g) {
        g.drawLine(50,50,50,200);
        g.drawLine(50,200,300,200);
        //valerie
        g.setColor(Color.magenta);
        g.fillRect(80,Xas - Valerie,50,Valerie);
        g.setColor(Color.black);
        g.drawRect(80,Xas - Valerie,50,Valerie);
        //Jeroen
        g.setColor(Color.green);
        g.fillRect(150,Xas - Jeroen,50,Jeroen);
        g.setColor(Color.black);
        g.drawRect(150,Xas - Jeroen,50,Jeroen);
        //Hans
        g.setColor(Color.blue);
        g.fillRect(220,Xas - Hans,50,Hans);
        g.setColor(Color.black);
        g.drawRect(220,Xas - Hans,50,Hans);

        //schaal
        g.drawLine(45,60,55,60);
        g.drawLine(45,80,55,80);
        g.drawLine(45,100,55,100);
        g.drawLine(45,120,55,120);
        g.drawLine(45,140,55,140);
        g.drawLine(45,160,55,160);
        g.drawLine(45,180,55,180);
        g.drawLine(45,200,55,200);

        //namen
        g.drawString("Valerie",85,215);
        g.drawString("Jeroen",155,215);
        g.drawString("Hans",230,215);

        //Schaalnummering
        g.drawString("0",35,205);
        g.drawString("20",30,185);
        g.drawString("40",30,165);
        g.drawString("60",30,145);
        g.drawString("80",30,125);
        g.drawString("100",23,105);
        g.drawString("120",23,85);
        g.drawString("140",23,65);
        g.drawString("Gewicht",20,30);
        g.drawString("in KG",25,40);
    }
}
