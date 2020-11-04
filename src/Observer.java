/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 04/11/2020
 * Time: 9:53 SA
 */

public interface Observer {
    /*
     * Phương thức này sẽ nhận thay đổi mỗi khi có thông báo từ Subject.
     */
    void update(String msg);
}
