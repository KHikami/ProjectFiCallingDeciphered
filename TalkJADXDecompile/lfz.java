import java.util.concurrent.ThreadFactory;

final class lfz implements ThreadFactory {
    lfz() {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(new lga(this, runnable));
    }
}
