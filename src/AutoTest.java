public class AutoTest {
    public static void main(String[] args) {
        //użycie konstruktora w Auto do szybszego wywołania obiektu
        Auto mercedes = new Auto("Mercedes", "Klasa S",2000, 1000 );
        /*mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rok = 2000;
        mercedes.przebieg= 1000;*/

        mercedes.jedz();
        //mercedes.info();
        mercedes.hamuj();


        Auto audi = new Auto("Audi","A5", 2020, 100);
        /*audi.marka = "Audi";
        audi.model = "A5";
        audi.rok = 2020;
        audi.przebieg = 100;*/

        audi.jedz();
        //audi.info();
        audi.hamuj();

    }
}
