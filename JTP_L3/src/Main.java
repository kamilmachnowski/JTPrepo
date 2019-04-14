public class Main
{
    public static void main(String[] args)
    {
        Wywolanie wywolanie = new Wywolanie();
        Factorial silnia = new Factorial();
        //System.out.println(silnia.factorial(-5));
        try
        {
            System.out.println(silnia.factorialWithMyException(-3));
            System.out.println(silnia.factorialWithMyException(-1));
            System.out.println(silnia.factorialWithMyException(0));
            System.out.println(silnia.factorialWithMyException(1));
            System.out.println(silnia.factorialWithMyException(2));
            System.out.println(silnia.factorialWithMyException(4));
            System.out.println(silnia.factorialWithMyException(5));
        }
        catch (MyException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try
        {
            System.out.println(silnia.factorial(-3));
            System.out.println(silnia.factorial(-1));
            System.out.println(silnia.factorial(0));
            System.out.println(silnia.factorial(1));
            System.out.println(silnia.factorial(2));
            System.out.println(silnia.factorial(4));
            System.out.println(silnia.factorial(5));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.toString());
            e.printStackTrace();
        }

        //Wywolanie metody 5 razy dla testu
        for(int i=0; i<5; i++)
        {
            try
            {
                wywolanie.metoda();
            }
            catch(MyException e)
            {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            catch(MyException2 e2)
            {
                System.out.println(e2.getMessage());
                e2.printStackTrace();
            }
            catch (MyException3 e3)
            {
                System.out.println(e3.getMessage());
                e3.printStackTrace();
            }
        }
    }
}
