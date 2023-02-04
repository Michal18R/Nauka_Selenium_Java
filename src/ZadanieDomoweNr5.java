import java.util.Scanner;

// Stworzyć kalkulator za pomocą metod
public class ZadanieDomoweNr5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        System.out.println("Wynik dodania dwóch podanych liczb to: " + calculator.dodawanie(firstNumber,secondNumber));
        System.out.println("Wynik odejmowania dwóch podanych liczb to: " + calculator.odejmowanie(firstNumber,secondNumber));
        System.out.println("Wynik mnożenia dwóch podanych liczb to: " + calculator.mnozenie(firstNumber,secondNumber));
        System.out.println("Wynik dzielenia dwóch podanych liczb to: " + calculator.dzielenie(firstNumber,secondNumber));
        System.out.println("Wynik modulo dwóch podanych liczb to: " + calculator.modulo(firstNumber,secondNumber));
    }


}
