package ObjectProgramming;

public class Truck implements Vehicle{
    @Override
    public void go(int speed) {
        System.out.println("Jade ciezarowka z predkoscia " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje ciazarowke!");
    }

    @Override
    public String info() {
        return "Truck";
    }

    public void refuel(){
        System.out.println("Potrzebuje zatankowac!");
    }


}
