/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 04/11/2020
 * Time: 9:59 SA
 */

public class OctObserver implements Observer {
    private ConcreteSubject subject;

    public OctObserver() {}

    public OctObserver(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update(String msg) {
        System.out.println("Octal: " + Integer.toOctalString(subject.getState()));
    }
}
