package Techno;

public class OperationTechno implements OnOff {
    private boolean state = false;

    @Override
    public void on() {
        state = true;
    }

    @Override
    public void off() {
        state = false;
    }

    @Override
    public void printState() {
        if (state) {
            System.out.println("Машина включена...");
        } else {
            System.out.println("Машина НЕ включена.....");
        }
    }
}