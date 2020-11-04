/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 04/11/2020
 * Time: 10:00 SA
 */

public class BinObserver implements Observer {
    private ConcreteSubject subject;

    public BinObserver() {}

    public BinObserver(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update(String msg) {
        System.out.println("Binary: " + Integer.toBinaryString(subject.getState()));
    }
}
