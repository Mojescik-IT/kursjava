package ObjectProgramming;

public class Bike implements Vehicle {


    @Override
    public void go(int speed) {
        System.out.println("Jade rowerem z predkoscia " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje rowerem!");
    }

    @Override
    public String info() {
        return "Bike";
    }


    public void refuel(){
        System.out.println("Musze odpoczac!");
    }
}
