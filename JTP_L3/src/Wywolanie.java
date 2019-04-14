import java.util.Random;

public class Wywolanie
{
    Random random = new Random();

    public void metoda() throws MyException, MyException2, MyException3
    {
        int wybor = random.nextInt(3);

        if(wybor == 0)
        {
            throw new MyException("Nie dziala");
        }

        if(wybor == 1)
        {
            throw new MyException2("Nie dziala 2");
        }

        if(wybor == 2)
        {
            throw new MyException3("Nie dziala 3");
        }
    }
}
