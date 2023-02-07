public class App {

    public String name;

    public void appInfo(){
        System.out.println("To jest Aplikacja");
    }

    public App (String name){
        System.out.println("Jestem w konstruktorze App");
        this.name = name;
    }

}

