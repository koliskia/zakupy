public class ubrania extends towary {
    private String rozmiar;

    public ubrania(int id, String nazwa, int cena, int waga, String rozmiar) {
        super(id, nazwa, cena, waga);
        this.rozmiar = rozmiar;
    }
}
