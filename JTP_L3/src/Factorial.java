public class Factorial
{
    //print stack trace
    //myexception extends exception, 3 metody, catch(MyException
    //w drugim własny wyjątek

    public int factorial(int x)
    {
        if(x < 0)
        {
            throw new IllegalArgumentException();
        }
        if(x == 0 || x == 1)
        {
            return 1;
        }
        else
        {
            return x*factorial(x-1);
        }
    }

    public int factorialWithMyException(int x) throws MyException
    {
        if(x < 0)
        {
            throw new MyException("Nie dziala");
        }
        if(x == 0 || x == 1)
        {
            return 1;
        }
        else
        {
            return x*factorial(x-1);
        }
    }
}
