/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 04/11/2020
 * Time: 1:55 CH
 */

public class ConcreteObserver implements Observer {

    /*
     * Luôn duy trì một tham chiếu đến một ConcreteSubject
     * Cần phải lưu trữ trạng thái phù hợp với trạng thái của Subject
     * Thực thi phương thức update của Observer để trạng thái luôn đồng nhất với trạng thái của Subject (sử dụng mỗi khi có notify)
     */

    private ConcreteSubject subject;

    public ConcreteObserver() {
    }

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update(String msg) {
        System.out.println("Msg: " + subject.getState());
    }
}
