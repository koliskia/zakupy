public class Przedmiot 
{
    int x1,y1,szerokosc, wysokosc;

    public Przedmiot(int x1, int y1, int szerokosc, int wysokosc)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;


    }

    public boolean hitbox(int x, int y)
    {
        if(x1-20<=x && x<=x1+szerokosc+20 && y1-20<=y && y<=y1+wysokosc+20)
        {
            return true;
        }
        else return false;
    }
}
