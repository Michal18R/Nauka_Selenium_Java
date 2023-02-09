public class MathTeacher extends Person{

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        this.school = school;
        System.out.println("Jestem w konstruktorze MathTeacher");
    }
    //nadpisanie metdy walk() z bazowej klasy
    public void walk(){
        System.out.println("I walk very fast");
    }
    public void teachMath(){
        System.out.println("I am teaching math");
    }
    public void sayHello(){
        System.out.println("Hello. My name is " + name);
        System.out.println("I am " + age);
    }
}
