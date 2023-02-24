package zadaniaNaRozmowieKwalifikacyjnej;

// n1=1 n2=1 n3=n2+n1
// zwraca n-ty wyraz ciągu fibonnaciego
public class Fibonacci {

    public static void main(String[] args) {
        fibo(1);
        fibo(2);
        fibo(5);
        fibo(6);
    }
    public static void fibo(int n){
        long n1 = 1;
        long n2 = 1;
        for (/*znamy już pierwsze dwie dlatego zaczynamy od 3 liczby*/ int i=3; i<=n; i++){
            long temp = n2 + n1;
            n1 = n2;
            n2 = temp;
        }
        System.out.println(n2);
    }
}
