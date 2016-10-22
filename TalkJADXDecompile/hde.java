import java.util.concurrent.ThreadFactory;

final class hde implements ThreadFactory {
    final /* synthetic */ hdc a;

    hde(hdc hdc) {
        this.a = hdc;
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(new hdf(this, runnable), "ClearcutLoggerApiImpl");
    }
}
