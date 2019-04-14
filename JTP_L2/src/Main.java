public class Main
{
    public static void main(String[] args)
    {
        Dane generatorDanych = new Dane();
        Klienci klienci = new Klienci();
        for(int i = 0; i < 30; i++)
        {
            klienci.dodajKlienta(generatorDanych.generujImie(), generatorDanych.generujNazwisko());
        }

        klienci.losowanieGlowne();
        klienci.zliczanie();
        //klienci.wyswietlKlientow();
    }
}
