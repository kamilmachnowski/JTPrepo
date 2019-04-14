import java.util.*;

public class Klienci
{
    private int N = 10;
    private double procent = 0.1;
    private Random random = new Random();
    private int liczbaMiesiecy = 12;
    private String[] imiona = {"Jan", "Mariusz", "Andrzej", "Zbigniew", "Adam", "Wladyslaw", "Kazimierz", "Igor", "Bartlomiej", "Konrad"};
    private List<Klient> klienci = new ArrayList<>();
    private Map<Integer, List<Klient>> wylosowani = new HashMap<>();
    private Map<String, Integer> zliczanieMapa = new HashMap<>();
    private List<Wystapienia> listaWystapien = new ArrayList<>();

    public void dodajKlienta(String imie, String nazwisko)
    {
        Klient klient = new Klient(imie, nazwisko);
        klienci.add(klient);
    }

    public void usunKlienta(Klient klient)
    {
        klienci.remove(klient);
    }

    public void usunKlienta(int indeks)
    {
        klienci.remove(indeks);
    }

    public void wyswietlKlientow()
    {
        for(Klient klient:klienci)
        {
            System.out.println(klient.toString());
        }
    }

    public boolean wyszukajKliienta(String imie, String nazwisko)
    {
        for(Klient klient:klienci)
        {
            if(klient.getImie().equals(imie) && klient.getNazwisko().equals(nazwisko))
            {
                return true;
            }
        }
        return false;
    }

    public void losowanieKlientow()
    {
        int numer;
        int iloscMAX = (int)(klienci.size()*procent);
        int ilosc = random.nextInt(iloscMAX);

        for(int i=0; i<ilosc; i++)
        {
            numer = random.nextInt(klienci.size());
            System.out.println(klienci.get(numer).toString());
        }
    }

    public void losowanieGlowne()
    {

        int ilosc = (int)(klienci.size()*procent);
        int numer;
        Klient klient;

        for(int i = 1; i <= liczbaMiesiecy; i++)
        {
            List<Klient> listaWylosowanych = new ArrayList<>();
            for(int j = 0; j < ilosc; j++)
            {
                numer = random.nextInt(klienci.size());
                klient = klienci.get(numer);
                if(!listaWylosowanych.contains(klient))
                {
                    listaWylosowanych.add(klient);
                }
            }
            wylosowani.put(i, listaWylosowanych);
        }
        wylosowani.forEach( (miesiac, klienciLista) -> System.out.println(miesiac + " " + klienciLista ));
    }

    public void zliczanie()
    {
        int ilosc;
        for(int i = 0; i < N; i++)
        {
            ilosc = 0;
            for(int j = 0; j < klienci.size(); j++)
            {
                if(imiona[i] == klienci.get(j).getImie())
                {
                    ilosc++;
                }
            }
            zliczanieMapa.put(imiona[i], ilosc);
            Wystapienia noweWystapienie = new Wystapienia(imiona[i], ilosc);
            listaWystapien.add(i, noweWystapienie);
        }

        System.out.println();
        System.out.println("ZLICZONE IMIONA (MAPA)");
        zliczanieMapa.forEach((imie, iloscImion) -> System.out.println(imie + " " + iloscImion));
        System.out.println();
        System.out.println("ZLICZONE IMIONA (LISTA)");
        for(Wystapienia wystapienie: listaWystapien)
        {
            System.out.println(wystapienie.getImie() + " " + wystapienie.getIlosc());
        }
    }
}
