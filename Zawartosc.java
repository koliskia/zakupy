import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.*;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;

public class Zawartosc extends JPanel implements ActionListener {
    Timer t = new Timer(10, this);
    int x = 0, y = 0, predkoscX = 5, predkoscY = 5, licznik = 0;
    int iloscPrzedmiotow = 0;

    String nazwaa, krajpocha, doZapis="", czygaza, czyplastika, rozmiara;
    int cenaa, wagaa, dniwaznosciaa;

    private ArrayList<Towary> tablica = new ArrayList<>();
    private Random rand = new Random();
    private JButton button;
    private JButton dodaj;
    private JButton dodajn;
    private JButton dodaju;
    private JLabel nazwal, cenal, wagal, dniwaznoscil, krajpochl;
    private JLabel nazwaln, cenaln, wagaln, dniwaznosciln, czygazln, czyplastikln;
    private JLabel nazwalu, cenalu, wagalu, rozmiarlu;
    private JLabel koniec;
    private JTextField nazwap, cenap, wagap, dniwaznoscip, krajpochp;
    private JTextField nazwapn, cenapn, wagapn, dniwaznoscipn, czygazpn, czyplastikpn;
    private JTextField nazwapu, cenapu, wagapu, rozmiarpu;

    private int d = 0;

    public Zawartosc() {
        setLayout(null);
        //inicjowanie przycisku rozpoczynajacego symulacje
        button = new JButton("start");
        button.setBounds(1, 1, 140, 60);
        add(button);
        button.setActionCommand("jeden");
        button.addActionListener(this);

        nazwal = new JLabel("Nazwa: ");
        nazwal.setBounds(50, 200, 100, 20);
        add(nazwal);
        nazwap = new JTextField("");
        nazwap.setBounds(100, 200, 100, 20);
        add(nazwap);

        cenal = new JLabel("Cena: ");
        cenal.setBounds(50, 230, 100, 20);
        add(cenal);
        cenap = new JTextField("");
        cenap.setBounds(100, 230, 100, 20);
        add(cenap);

        wagal = new JLabel("Waga: ");
        wagal.setBounds(50, 260, 100, 20);
        add(wagal);
        wagap = new JTextField("");
        wagap.setBounds(100, 260, 100, 20);
        add(wagap);

        dniwaznoscil = new JLabel("Dni waznosci: ");
        dniwaznoscil.setBounds(10, 290, 100, 20);
        add(dniwaznoscil);
        dniwaznoscip = new JTextField("");
        dniwaznoscip.setBounds(100, 290, 100, 20);
        add(dniwaznoscip);

        krajpochl = new JLabel("Kraj pochodzenia: ");
        krajpochl.setBounds(0, 320, 100, 20);
        add(krajpochl);
        krajpochp = new JTextField("");
        krajpochp.setBounds(100, 320, 100, 20);
        add(krajpochp);

        dodaj = new JButton("Dodaj owoc");
        dodaj.setBounds(100, 400, 140, 60);
        add(dodaj);
        dodaj.setActionCommand("dodaj");
        dodaj.addActionListener(this);

        //NAPOJE
        nazwaln = new JLabel("Nazwa: ");
        nazwaln.setBounds(500, 200, 100, 20);
        add(nazwaln);
        nazwapn = new JTextField("");
        nazwapn.setBounds(560, 200, 100, 20);
        add(nazwapn);

        cenaln = new JLabel("Cena: ");
        cenaln.setBounds(500, 230, 100, 20);
        add(cenaln);
        cenapn = new JTextField("");
        cenapn.setBounds(560, 230, 100, 20);
        add(cenapn);

        wagaln = new JLabel("Waga: ");
        wagaln.setBounds(500, 260, 100, 20);
        add(wagaln);
        wagapn = new JTextField("");
        wagapn.setBounds(560, 260, 100, 20);
        add(wagapn);

        dniwaznosciln = new JLabel("Dni waznosci: ");
        dniwaznosciln.setBounds(470, 290, 100, 20);
        add(dniwaznosciln);
        dniwaznoscipn = new JTextField("");
        dniwaznoscipn.setBounds(560, 290, 100, 20);
        add(dniwaznoscipn);

        czygazln = new JLabel("Czy gazowane? ");
        czygazln.setBounds(470, 320, 100, 20);
        add(czygazln);
        czygazpn = new JTextField("");
        czygazpn.setBounds(560, 320, 100, 20);
        add(czygazpn);

        czyplastikln = new JLabel("Czy plastik? ");
        czyplastikln.setBounds(470, 350, 100, 20);
        add(czyplastikln);
        czyplastikpn = new JTextField("");
        czyplastikpn.setBounds(560, 350, 100, 20);
        add(czyplastikpn);

        dodajn = new JButton("Dodaj napoj");
        dodajn.setBounds(560, 400, 140, 60);
        add(dodajn);
        dodajn.setActionCommand("dodajn");
        dodajn.addActionListener(this);


        //UBRANIA
        nazwalu = new JLabel("Nazwa: ");
        nazwalu.setBounds(900, 200, 100, 20);
        add(nazwalu);
        nazwapu = new JTextField("");
        nazwapu.setBounds(960, 200, 100, 20);
        add(nazwapu);

        cenalu = new JLabel("Cena: ");
        cenalu.setBounds(900, 230, 100, 20);
        add(cenalu);
        cenapu = new JTextField("");
        cenapu.setBounds(960, 230, 100, 20);
        add(cenapu);

        wagalu = new JLabel("Waga: ");
        wagalu.setBounds(900, 260, 100, 20);
        add(wagalu);
        wagapu = new JTextField("");
        wagapu.setBounds(960, 260, 100, 20);
        add(wagapu);

        rozmiarlu = new JLabel("Rozmiar: ");
        rozmiarlu.setBounds(870, 290, 100, 20);
        add(rozmiarlu);
        rozmiarpu = new JTextField("");
        rozmiarpu.setBounds(960, 290, 100, 20);
        add(rozmiarpu);

        dodaju = new JButton("Dodaj ubranie");
        dodaju.setBounds(960, 400, 140, 60);
        add(dodaju);
        dodaju.setActionCommand("dodaju");
        dodaju.addActionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (d == 1) {
            Graphics2D g2 = (Graphics2D) g;
            Ellipse2D circle = new Ellipse2D.Double(x, y, 20, 20);
            g2.fill(circle);
            t.start();

            for (int i = 0; i < iloscPrzedmiotow; i++) {
                Towary z = tablica.get(i);
                g.setColor(z.getColor());
                g.fillRect(z.x1, z.y1, z.szerokosc, z.wysokosc);
                g.setColor(Color.BLACK);
                g.drawString(z.getNazwa().substring(0, 3), z.x1 + 5, z.y1 + 12);
            }
        } else if (d == 0) {

            g.drawString("Ilosc przedmiotow: " + iloscPrzedmiotow, 400, 30);

        } else if (d == 2) {
            Zapis.Zapis(doZapis);
            koniec = new JLabel("KONIEC SYMULACJI");
            koniec.setBounds(50, 230, 300, 20);
            add(koniec);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (x < 0 || x > 1500) {
            predkoscX = -predkoscX;
        }
        if (y < 0 || y > 600) {
            predkoscY = -predkoscY;
        }
        x += predkoscX;
        y += predkoscY;


        if (d == 1) {
            licznik++;
            for (int i = 0; i < iloscPrzedmiotow; i++) {
                if (tablica.get(i).hitbox(x, y)) {
                    tablica.remove(i);
                    iloscPrzedmiotow--;
                    doZapis = doZapis + "\r\n" + licznik + "," + iloscPrzedmiotow;

                    break;
                }

            }

            if (iloscPrzedmiotow == 0) {
                d = 2;
            }
        }


        repaint();
        if (e.getActionCommand() == "jeden") {
            d = 1;
            button.setEnabled(false);
            button.setVisible(false);
            nazwal.setEnabled(false);
            nazwal.setVisible(false);
            cenal.setEnabled(false);
            cenal.setVisible(false);
            wagal.setEnabled(false);
            wagal.setVisible(false);
            dniwaznoscil.setEnabled(false);
            dniwaznoscil.setVisible(false);
            krajpochl.setEnabled(false);
            krajpochl.setVisible(false);
            nazwap.setEnabled(false);
            nazwap.setVisible(false);
            cenap.setEnabled(false);
            cenap.setVisible(false);
            wagap.setEnabled(false);
            wagap.setVisible(false);
            dniwaznoscip.setEnabled(false);
            dniwaznoscip.setVisible(false);
            krajpochp.setEnabled(false);
            krajpochp.setVisible(false);
            dodaj.setEnabled(false);
            dodaj.setVisible(false);
            nazwaln.setEnabled(false);
            nazwaln.setVisible(false);
            cenaln.setEnabled(false);
            cenaln.setVisible(false);
            wagaln.setEnabled(false);
            wagaln.setVisible(false);
            dniwaznosciln.setEnabled(false);
            dniwaznosciln.setVisible(false);
            czygazln.setEnabled(false);
            czygazln.setVisible(false);
            czyplastikln.setEnabled(false);
            czyplastikln.setVisible(false);
            nazwapn.setEnabled(false);
            nazwapn.setVisible(false);
            cenapn.setEnabled(false);
            cenapn.setVisible(false);
            wagapn.setEnabled(false);
            wagapn.setVisible(false);
            dniwaznoscipn.setEnabled(false);
            dniwaznoscipn.setVisible(false);
            czygazpn.setEnabled(false);
            czygazpn.setVisible(false);
            czyplastikpn.setEnabled(false);
            czyplastikpn.setVisible(false);
            dodajn.setEnabled(false);
            dodajn.setVisible(false);
            nazwalu.setEnabled(false);
            nazwalu.setVisible(false);
            cenalu.setEnabled(false);
            cenalu.setVisible(false);
            wagalu.setEnabled(false);
            wagalu.setVisible(false);
            rozmiarlu.setEnabled(false);
            rozmiarlu.setVisible(false);
            nazwapu.setEnabled(false);
            nazwapu.setVisible(false);
            cenapu.setEnabled(false);
            cenapu.setVisible(false);
            wagapu.setEnabled(false);
            wagapu.setVisible(false);
            rozmiarpu.setEnabled(false);
            rozmiarpu.setVisible(false);
            dodaju.setEnabled(false);
            dodaju.setVisible(false);


        } else if (e.getActionCommand() == "dodaj") {
            nazwaa = nazwap.getText();
            cenaa = Integer.parseInt(cenap.getText());
            wagaa = Integer.parseInt(wagap.getText());
            krajpocha = krajpochp.getText();
            dniwaznosciaa = Integer.parseInt(dniwaznoscip.getText());
            Zywnosc towar = new Zywnosc(rand.nextInt(1470), rand.nextInt(570), 30, 30, iloscPrzedmiotow, nazwaa, cenaa, wagaa, dniwaznosciaa, krajpocha, Color.GREEN);
            tablica.add(towar);
            iloscPrzedmiotow++;
        } else if (e.getActionCommand() == "dodajn") {
            nazwaa = nazwapn.getText();
            cenaa = Integer.parseInt(cenapn.getText());
            wagaa = Integer.parseInt(wagapn.getText());
            dniwaznosciaa = Integer.parseInt(dniwaznoscipn.getText());
            czygaza = czygazpn.getText();
            czyplastika = czyplastikpn.getText();
            Napoje towar = new Napoje(rand.nextInt(1470), rand.nextInt(570), 30, 30, iloscPrzedmiotow, nazwaa, cenaa, wagaa, dniwaznosciaa, czygaza, czyplastika, Color.YELLOW);
            tablica.add(towar);
            iloscPrzedmiotow++;
        } else if (e.getActionCommand() == "dodaju") {
            nazwaa = nazwapu.getText();
            cenaa = Integer.parseInt(cenapu.getText());
            wagaa = Integer.parseInt(wagapu.getText());
            rozmiara = rozmiarpu.getText();
            Ubrania towar = new Ubrania(rand.nextInt(1470), rand.nextInt(570), 30, 30, iloscPrzedmiotow, nazwaa, cenaa, wagaa, rozmiara, Color.CYAN);
            tablica.add(towar);
            iloscPrzedmiotow++;
        }
    }
}