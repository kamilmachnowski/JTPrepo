package pl.lab3.zadanie1;


import java.util.Random;

public class Factorial {
    private int factorial;

    Factorial(int x) {
        if (x < 0) {
            int random = new Random().nextInt(2);
            switch (random) {
                case 0:
                    factorialWithMyException();
                    break;
                case 1:
                    factorialWithMyExceptionTheSecond();
                    break;
                case 2:
                    factorialWithMyExceptionTheThird();
                    break;
                default:
                    System.out.println("Ops, tego nie przewidzielismy. :O ");
                    break;
            }
        } else if (x == 0) {
            factorial = 0;
            System.out.println(getFactorial());
        } else {
            factorial = 1;
            for (int i = x; i > 0; i--) {
                factorial *= i;
            }
            System.out.println(getFactorial());
        }
    }


    private void factorialWithMyExceptionTheThird() {
        try {
            throw new MyExceptionTheThird("Nie można wyciągnąć silni z liczby ujemnej. ");
        } catch (MyExceptionTheThird ex) {
            System.out.println("Złapano trzeci wyjątek. ");
            System.out.println(ex.getMessage());
        }
    }

    private void factorialWithMyExceptionTheSecond() {
        try {
            throw new MyExceptionTheSecond("Nie można wyciągnąć silni z liczby ujemnej. ");
        } catch (MyExceptionTheSecond ex) {
            System.out.println("Złapano drugi wyjątek. ");
            System.out.println(ex.getMessage());
        }
    }

    private void factorialWithMyException() {
        try {
            throw new MyException("Nie można wyciągnąć silni z liczby ujemnej. ");
        } catch (MyException ex) {
            System.out.println("Złapano pierwszy wyjątek. ");
            System.out.println(ex.getMessage());
        }
    }


    private int getFactorial() {
        return factorial;
    }
}
