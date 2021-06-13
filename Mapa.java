import javax.swing.JFrame;

public class Mapa extends JFrame {
    public Mapa() {
        add(new Zawartosc());
        setSize(1920, 1080);
        setTitle("gra");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
