/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 04/11/2020
 * Time: 9:59 SA
 */

public class OctObserver extends Observer {

    private final Subject subject;

    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Octal: " + Integer.toOctalString(subject.getState()));
    }
}
