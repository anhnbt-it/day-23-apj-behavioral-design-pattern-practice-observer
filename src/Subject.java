import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 04/11/2020
 * Time: 9:54 SA
 */

public interface Subject {
    // Lớp được hiểu như là "Ông chủ", là một Interface

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyChange(String msg);
}
