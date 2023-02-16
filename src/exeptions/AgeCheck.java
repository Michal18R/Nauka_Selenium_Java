package exeptions;

import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) throws InvalidAgeException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        int wiek = scanner.nextInt();

        if (wiek >= 18) {
            System.out.println("Jesteś pełnoletni :) ");
        } else if (wiek >0 && wiek < 18 ) {
            throw new InvalidAgeException("Jesteś niepełnoletni!");
        } else if (wiek <= 0){
            throw new InvalidAgeException("Zły podany wiek!");
        }
    }
}
