import javax.swing.JFrame;

public class mapa extends JFrame {
    public mapa() {
        add(new Zawartosc());
        setSize(1920, 1080);
        setTitle("gra");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
