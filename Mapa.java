import javax.swing.JFrame;

/**
 * Tworzenie mapy
 */
public class Mapa extends JFrame {
    /**
     * Tworzenie mapy
     */
    public Mapa() {
        add(new Zawartosc());
        setSize(1920, 1080);
        setTitle("gra");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
