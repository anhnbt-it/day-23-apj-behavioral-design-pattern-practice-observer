/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 04/11/2020
 * Time: 9:57 SA
 */

public class HexObserver extends Observer {

    private final Subject subject;

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Hex: " + Integer.toHexString(subject.getState()));
    }
}
