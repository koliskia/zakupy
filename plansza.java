import javax.swing.JFrame;

public class plansza extends JFrame
{
    public plansza()
    {
        add(new zawartosc());
        setSize(1920, 1080);
        setTitle("gra");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
}
