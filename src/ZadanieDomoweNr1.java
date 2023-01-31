import java.util.Scanner;

public class ZadanieDomoweNr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        int suma = firstNumber + secondNumber;
        int odejmowanie = firstNumber - secondNumber;
        float dzielenie = firstNumber / secondNumber;
        int mnozenie = firstNumber * secondNumber;
        int modulo = firstNumber % secondNumber;

        System.out.println("Suma obu liczb wynosi " + suma);
        System.out.println("Odjęcie obu liczb wynosi " + odejmowanie);
        System.out.println("Dzielenie obu liczb wynosi " + dzielenie);
        System.out.println("Mnożenie obu liczb wynosi " + mnozenie);
        System.out.println("Modulo obu liczb wynosi " + modulo
        );

    }
}
