import java.util.ArrayList;
import java.util.List;

public class Klient
{
    private String imie;
    private String nazwisko;


    public Klient(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void setImie(String imie)
    {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }

    public String getImie()
    {
        return imie;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}

//List<Osoba>osoby = new ArrayList();
//for(Osoba osoba:osoby){}
// solid - wyszukaj