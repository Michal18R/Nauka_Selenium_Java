public class Calculator {

    public int dodawanie (int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public int odejmowanie (int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public int mnozenie (int firstNumber, int secondNumber){
        if(firstNumber == 0){
            System.out.println("Nie można podać jako pierwszej liczby cyfrę zero");
        } else if (secondNumber == 0){
            System.out.println("Nie można podać jako drugiej liczby cyfrę zero");
        }
        return firstNumber * secondNumber;
    }

    public float dzielenie (int firstNumber, int secondNumber){
        if(firstNumber == 0){
            System.out.println("Nie można podać jako pierwszej liczby cyfrę zero");
        } else if (secondNumber == 0){
            System.out.println("Nie można podać jako drugiej liczby cyfrę zero");
        }

        float result = (float)firstNumber / (float)secondNumber;

        return result;
    }

    public int modulo (int firstNumber, int secondNumber){
        if(firstNumber == 0){
            System.out.println("Nie można podać jako pierwszej liczby cyfrę zero");
        } else if (secondNumber == 0){
            System.out.println("Nie można podać jako drugiej liczby cyfrę zero");
        }
        return firstNumber % secondNumber;
    }
}
