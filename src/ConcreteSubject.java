import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 04/11/2020
 * Time: 1:50 CH
 */

public class ConcreteSubject implements Subject {
    /*
     * Nhiệm vụ là lưu trữ trạng thái của các ConcreteObserver objects
     *  và từ các trạng thái này sẽ gửi đi thông báo mỗi khi trạng thái bị thay đổi.
     */
    private final List<Observer> observers;
    private int state;

    public ConcreteSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyChange(String msg) {
        for (Observer observer: observers) {
            observer.update(msg);
        }
    }

    public int getState() {
        // Lấy trạng thái hiện tại của Subject
        return state;
    }

    public void setState(int state) {
        // Thiết đặt trạng thái cho Subject
        this.state = state;
    }
}
