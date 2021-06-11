import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.*;
import java.awt.Graphics2D;

public class postac extends JPanel implements ActionListener
{
    Timer t = new Timer(10, this);
    double x=0, y=0, predkoscX=5, predkoscY=5;
    private JButton button;
    private boolean d=false;

    public postac()
    {
        setLayout(null);
        button = new JButton("start");
        button.setBounds(1, 1, 140, 60);
        add(button);
        button.setActionCommand("jeden");
        button.addActionListener(this);
    }

    public void paintComponent(Graphics g)
    {
        if(d)
        {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            Ellipse2D circle = new Ellipse2D.Double(x, y, 20, 20);
            g2.fill(circle);
            t.start();
        }
        
    }

    public void actionPerformed(ActionEvent e)
    {
        if(x<0||x>1920)
        {
            predkoscX = -predkoscX;
        }
        if(y<0||y>1080)
        {
            predkoscY = -predkoscY;
        }
        x+=predkoscX;
        y+=predkoscY;
        repaint();
        if(e.getActionCommand()=="jeden")
        {
            d=true;
            button.setEnabled(false);
            button.setVisible(false);
        }
    }   
}