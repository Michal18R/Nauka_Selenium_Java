public class Footballer extends Person{

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        this.footballClub = footballClub;
        System.out.println("Jestem w konstruktorze Footballer");
    }
    // nadpisanie metody eat() z bazowej klasy
    public void eat(){
        System.out.println("I like healthy food");
    }
    public void playFutboll(){
        System.out.println("I am playing football in " + footballClub);
    }
}
