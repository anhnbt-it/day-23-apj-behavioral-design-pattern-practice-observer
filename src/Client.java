import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 04/11/2020
 * Time: 10:01 SA
 */

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        // Client configures the number and type of Observer
        HexObserver hexObserver = new HexObserver(subject);
        OctObserver octObserver = new OctObserver(subject);
        BinObserver binObserver = new BinObserver(subject);
        subject.attach(hexObserver);
        subject.attach(octObserver);
        subject.attach(binObserver);

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            subject.setState(scanner.nextInt());
        }
        subject.notifyChange("Notify");
    }
}
