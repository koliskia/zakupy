import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.*;
import java.awt.Graphics2D;

public class Postac extends JPanel implements ActionListener
{
    Timer t = new Timer(10, this);
    double x=0, y=0, predkoscX=5, predkoscY=5, h, w;
    private JButton button;
    private JLabel size, xlet;
    private JTextField width,height;
    private boolean d=false;

    public Postac()
    {
        setLayout(null);
        button = new JButton("start");
        button.setBounds(1, 100, 140, 60);
        add(button);
        size = new JLabel("Rozmiar planszy");
        size.setBounds(1,10,100,20);
        add(size);
        width = new JTextField("");
        width.setBounds(200,10,70,20);
        add(width);
        xlet = new JLabel("x");
        xlet.setBounds(280,10,20,20);
        add(xlet);
        height = new JTextField("");
        height.setBounds(300,10,70,20);
        add(height);
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
        w = Integer.parseInt(width.getText());
        h = Integer.parseInt(height.getText());
        if(x<0||x>w)
        {
            predkoscX = -predkoscX;
        }
        if(y<0||y>h)
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