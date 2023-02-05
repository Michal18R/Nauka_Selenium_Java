public class KonstruktorTest{

    public static void main(String[] args) {

        Konstruktor user = new Konstruktor("Tomek", "hello");

        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();

    }
}
