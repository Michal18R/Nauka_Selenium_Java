import java.util.Scanner;

public class InstrukcjaWarunkowaIf {

    public static void main(String[] args) {
        float dzielna = 4.0F;
        float dzielnik = 0;

        if (dzielnik != 0){
            System.out.println("Wynik dzielenia liczb wynosi " + dzielna/dzielnik);
        } else {
            System.out.println("Bazowy dzielnik wynosi 0. Podaj inną liczbę dzielnika ");
            Scanner scanner = new Scanner(System.in);
            int name = scanner.nextInt();
            dzielnik = name;
            System.out.println("Wynik dzielenia liczb wynosi " + dzielna/dzielnik);
        }
    }
}
