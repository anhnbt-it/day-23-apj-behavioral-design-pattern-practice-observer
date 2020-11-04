/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 04/11/2020
 * Time: 10:00 SA
 */

public class BinObserver extends Observer {
    private final Subject subject;

    public BinObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Binary: " + Integer.toBinaryString(subject.getState()));
    }
}
