import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;

public class zawartosc extends JPanel
{
    public zawartosc()
    {
        setLayout(null);
        JButton button = new JButton("start");
        button.setBounds(100, 100, 100, 100);
        add(button);
        //actionlistner
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setFont(new Font("TimesRoman", Font.PLAIN, 80));
        g.drawString("dupa", 600, 400);
    }

}
