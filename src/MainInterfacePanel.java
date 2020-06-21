import javax.swing.*;
import java.awt.*;

public class MainInterfacePanel extends JPanel{
    
    
    public void paintComponent(Graphics graphics){
            super.paintComponent(graphics);
            Color[] colors={new Color(248,238,204), new Color(246,221,208),new Color(89,190,138),
                    new Color(242,192,103),new Color(217,51,76),new Color(102,23,93),
                    new Color(12,46,117), new Color(222,114,72),new Color(242,158,57),
                    new Color(235,90,41),new Color(246,194,67),new Color(36,90,90),
                    new Color(210,165,59), new Color(188,226,132)};



            setBackground(colors[1]);
            Graphics2D graphics2D= (Graphics2D)graphics;


        //the big bag in the middle
        graphics2D.setPaint(colors[11]);
        int[] xbag1={375,625,650,360};
        int[] ybag1={120,120, 500,500};
        graphics2D.fillPolygon(xbag1,ybag1,4);
        // the big bag's handel
        graphics2D.setPaint(colors[10]);
        graphics2D.setStroke(new BasicStroke(10.0f));
        graphics2D.drawArc(435,45,130,200,0,180);
        // the big bag's small handel,s circles
        graphics2D.fillOval(428,140,15,15);
        graphics2D.fillOval(558,140,15,15);



        // the second bag on the left
        graphics2D.setPaint(colors[6]);
        int[] xbag2={300,500,500,300};
        int[] ybag2={300,300, 500,500};
        graphics2D.fillPolygon(xbag2,ybag2,4);
        // the second bag's on the left handel
        graphics2D.setStroke(new BasicStroke(5.0f));
        graphics2D.setPaint(colors[9]);
        graphics2D.drawArc(360,245,80,170,0,180);
        // the big bag's small handel,s circles
        graphics2D.setColor(colors[9]);
        graphics2D.fillOval(356,326,9,9);
        graphics2D.fillOval(436,326,9,9);



        //third bag on the right
        graphics2D.setColor(colors[4]);
        int[] xbag3={565,755,770,550};
        int[] ybag3={340,340, 630,630};
        graphics2D.fillPolygon(xbag3,ybag3,4);
        // the second bag's on the left handel
        graphics2D.setStroke(new BasicStroke(7.0f));
        graphics2D.setColor(colors[6]);
        graphics2D.drawArc(615,290,80,190,0,180);
        // the big bag's small handel,s circles
        graphics2D.setColor(colors[6]);
        graphics2D.fillOval(611,379,10,10);
        graphics2D.fillOval(690,379,10,10);




        //third bag on the right
        graphics2D.setColor(colors[10]);
        int[] xbag4={380,590,600,370};
        int[] ybag4={440,440, 630,630};
        graphics2D.fillPolygon(xbag4,ybag4,4);
        // the second bag's on the left handel
        graphics2D.setStroke(new BasicStroke(7.0f));
        graphics2D.setColor(colors[4]);
        graphics2D.drawArc(442,380,90,170,0,180);
        // the big bag's small handel,s circles
        graphics2D.setColor(colors[4]);
        graphics2D.fillOval(439,462,9,9);
        graphics2D.fillOval(528,462,9,9);



        //the last bag
        graphics2D.setColor(colors[5]);
        int[] xbag5={150,457,477,130};
        int[] ybag5={400,400, 630,630};
        graphics2D.fillPolygon(xbag5,ybag5,4);
        // the second bag's on the left handel
        graphics2D.setColor(colors[13]);
        graphics2D.setStroke(new BasicStroke(9.0f));
        graphics2D.drawArc(240,330,130,200,0,180);
        // the big bag's small handel,s circles
        graphics2D.setColor(colors[13]);
        graphics2D.fillOval(234,427,13,13);
        graphics2D.fillOval(364,427,13,13);

        graphics2D.setPaint(colors[12]);
        graphics.setFont(new Font("Chernobyl",Font.BOLD+Font.ITALIC,100));
        graphics.drawString("Y.R SUPERMARKET",50,730);



    }
}
