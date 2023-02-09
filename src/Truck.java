public class Truck implements Vehicle{
    @Override
    public void jazda(int speed) {
        System.out.println("Jadę ciężarówką z prędkością " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuję wściekle!");
    }

    @Override
    public String info() {
        return "Truck";
    }
}
