import java.util.concurrent.ThreadFactory;

final class clq implements ThreadFactory {
    clq(clo clo) {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(new clr(this, runnable), "ClearcutLoggerApiImpl");
    }
}
