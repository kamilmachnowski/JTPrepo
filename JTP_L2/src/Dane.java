import java.util.Random;

public class Dane
{
    private int N = 10;
    private int limitLiter = 25;
    private int ktoreNazwisko = 1;
    private int iteracja = 0;
    private Random random = new Random();
    private String[] imiona = {"Jan", "Mariusz", "Andrzej", "Zbigniew", "Adam", "Wladyslaw", "Kazimierz", "Igor", "Bartlomiej", "Konrad"};
    private String nazwiskoSufiks = "abacki";

    public String generujImie()
    {
        String imie = imiona[random.nextInt(N)];
        return imie;
    }

    public String generujNazwisko()
    {
        String nazwisko = nazwiskoSufiks;

        for(int i = 0; i < ktoreNazwisko; i++)
        {
            nazwisko = (char)('A' + iteracja) + nazwisko;
        }

        iteracja++;
        if(iteracja > limitLiter)
        {
            iteracja = 0;
            ktoreNazwisko++;
        }
        return nazwisko;
    }

}
