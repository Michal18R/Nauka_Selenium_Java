public class MetodyTest {

    public static void main(String[] args) {
        Metody metody = new Metody();
        metody.policzWynik();
        int result = metody.pobierzWynik();
        int result2 = result * 2;
        System.out.println("Resultat po mnożeniu razy 2 to: " + result2);

        System.out.println("Uruchamiane metody z param");
        metody.policzWynikParam(2);
        metody.policzWynikParam(120);

        metody.add(5,21);

    }
}
