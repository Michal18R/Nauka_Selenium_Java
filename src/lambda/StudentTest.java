package lambda;

public class StudentTest {



    public static void main(String[] args) {
        Student it = new ItStudent();
        sayHello("John", it, 18);


        // klasa anonimowa
        Student med = new Student() {
            @Override
            public void sayHello(String name, int age) {
                System.out.println("I will be a doctor");
                System.out.println("My name is " + name + ". W tym roku kończę " + age + " lat");
            }
        };

        sayHello("Kate", med, 25);

        // wyrażenie lambda
        // (parametr) -> System.out.println("My name is " + name);
        Student noStudent = (name, age) -> {
            System.out.println("I am not a student, My name is " + name + ". W tym roku kończę niestety " + age + " lat");
            if (age > 18){
                System.out.println("Możesz kupić alkohol");
            }
        };
        sayHello("Tom", noStudent, 34);
    }

    public static void sayHello(String name, Student student, int age){
        student.sayHello(name, age);
    }
}
