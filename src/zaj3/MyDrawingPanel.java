package zaj3;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kamil Bębnowski on 10.03.2019r.
 */
public class MyDrawingPanel extends JPanel {

    private int x = 120;
    private int y = 70;
    private int width=20;
    private int height=20;
    private Color col ;//= new Color(255,0,0);
    private String zmien="S";

    public void setZmien(String zmien) {
        this.zmien = zmien;
    }

    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        g.setColor(col);
        if(zmien == "S") {
            g.fillOval(x - 8, y - 8, width, height);
        }
        else
        {
            g.fillRect(x-8, y-8, width, height);
        }
    }


    public void SetColor(int r, int g, int b)
    {
        col = new Color (r, g, b);
    }



    public void moveBall(int dx, int dy){
        x+=dx;
        y+=dy;
    }

    public void moveBallTo(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public void SetSize(int width, int height){
        this.width+=width;
        this.height+=height;
    }

    public void NormalSize (){
        height=20;
        width=20;
    }

    public void Clear() {
        height=60;
        width=60;
        SetColor(255, 255, 255);
    }
}