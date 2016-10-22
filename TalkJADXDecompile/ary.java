import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class ary {
    final Lock a;
    int b;

    ary() {
        this.a = new ReentrantLock();
    }
}
