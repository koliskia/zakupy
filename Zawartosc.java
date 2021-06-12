import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.*;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;

public class Zawartosc extends JPanel implements ActionListener
{
    Timer t = new Timer(10, this);
    int x=0, y=0, predkoscX=5, predkoscY=5;
    int iloscPrzedmiotow=1;

    private ArrayList<Przedmiot> tablica = new ArrayList<Przedmiot>();
    private Random rand = new Random();
    private JButton button;
    private JButton minus;
    private JButton plus;

    private int d=0;

    public Zawartosc()
    {
        setLayout(null);
        //inicjowanie przycisku rozpoczynajacego symulacje
        button = new JButton("start");
        button.setBounds(1, 1, 140, 60);
        add(button);
        button.setActionCommand("jeden");
        button.addActionListener(this);

        //tworzenie przycisku zwiekszajacego
        plus = new JButton("+");
        plus.setBounds(200, 1, 60, 60);
        add(plus);
        plus.setActionCommand("plus");
        plus.addActionListener(this);

        //tworzenie przycisku zmniejszajacego
        minus = new JButton("-");
        minus.setBounds(300, 1, 60, 60);
        add(minus);
        minus.setActionCommand("minus");
        minus.addActionListener(this);

    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        if(d==1)
        {
            Graphics2D g2 = (Graphics2D) g;
            Ellipse2D circle = new Ellipse2D.Double(x, y, 20, 20);
            g2.fill(circle);
            t.start();

            for(int i=0 ; i<iloscPrzedmiotow ; i++)
            {
                Przedmiot z = tablica.get(i);
                g.drawRect(z.x1,z.y1,z.szerokosc,z.wysokosc);

            }
        }
        else if(d==0)
        {
            
            g.drawString("Ilosc przedmiotow: "+iloscPrzedmiotow, 400, 30);
            
        }
        else if(d==2)
        {
            //napisy na koniec symulacji
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

        if(d==1)
        {
            for(int i=0 ; i<iloscPrzedmiotow ; i++)
            {   
                if(tablica.get(i).hitbox(x,y))
                {
                   tablica.remove(i);
                    iloscPrzedmiotow--;

                    break;
                }

            }

            if(iloscPrzedmiotow==0)
            {
                d=2;
            }
        }
        

        repaint();
        if(e.getActionCommand()=="jeden")
        {
            d=1;
            button.setEnabled(false);
            button.setVisible(false);
            plus.setEnabled(false);
            plus.setVisible(false);
            minus.setEnabled(false);
            minus.setVisible(false);

            for(int i=0 ; i<iloscPrzedmiotow ; i++)
            {
                Przedmiot nazwa = new Przedmiot(rand.nextInt(1890),rand.nextInt(1050),30,30);
                tablica.add(nazwa);
                
            }

        }
        else if(e.getActionCommand()=="plus")
        {
            iloscPrzedmiotow++;
        }
        else if(e.getActionCommand()=="minus")
        {
            if(iloscPrzedmiotow > 1)
            {
                iloscPrzedmiotow--;
            }
            
        }
    }   
}