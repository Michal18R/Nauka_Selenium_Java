public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 21, "AGH");
        teacher.walk();
        teacher.eat();
        teacher.teachMath();
        teacher.sayHello();

        Footballer footballer = new Footballer("Mike", 32, "Man City");
        footballer.walk();
        footballer.eat();
        footballer.playFutboll();
    }
}
