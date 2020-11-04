/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 04/11/2020
 * Time: 9:57 SA
 */

public class HexObserver implements Observer {
    private ConcreteSubject subject;

    public HexObserver() {
    }

    public HexObserver(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update(String msg) {
        System.out.println("Hex: " + Integer.toHexString(subject.getState()));
    }
}
