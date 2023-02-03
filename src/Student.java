public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;

    public void przedstawSie(){
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }
    public void zalogujSie(){
        System.out.println("Loguje się za pomocą nicku: " + nick);
    }
    public void podajNrIndeksu(){
        System.out.println("Mój numer indesku to: " + numerIndeksu);
    }
    public void podajEmail(){
        System.out.println("Mój email to: " + email);
    }
}
