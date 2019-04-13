package pl.lab3.zadanie1;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        int[] numbs = {-3, -2, 0, 1, 2, 4, 5};
        for (int numb : numbs) {
            new Factorial(numb);
            sleep(1000);
        }
    }
}
