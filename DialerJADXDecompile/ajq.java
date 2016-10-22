import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public abstract class ajq implements RunnableFuture {
    public abstract int a();

    public abstract boolean cancel(boolean z);

    public abstract boolean isDone();

    public final Object get() {
        throw new UnsupportedOperationException();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
