import java.util.Scanner;

public class ZadanieDomoweNr2 {

    public static void main(String[] args) {
        System.out.println("Podaj swój wiek");
        Scanner scanner = new Scanner(System.in);
        int wiek = scanner.nextInt();

        if (wiek < 18 && wiek > 0){
            System.out.println("Nie możesz niestety kupić alkoholu");
        } else if (wiek >= 18){
            System.out.println("Dziękuję za zakupy");
        } else if (wiek <= 0) {
            System.out.println("Wpisz poprawną wartość");
        }
    }
}
