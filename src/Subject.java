import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 04/11/2020
 * Time: 9:54 SA
 */

public class Subject {
    private final List<Observer> observers;
    private int state;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void add(Observer o) {
        observers.add(o);
    }

    public void execute() {
        for (Observer observer: observers) {
            observer.update();
        }
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }
}
