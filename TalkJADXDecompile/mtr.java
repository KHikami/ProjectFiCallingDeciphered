import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class mtr<V> extends msv<V> implements mtk<V> {
    private final ScheduledFuture<?> a;

    public /* synthetic */ int compareTo(Object obj) {
        return a((Delayed) obj);
    }

    public mtr(mti<V> mti_V, ScheduledFuture<?> scheduledFuture) {
        super(mti_V);
        this.a = scheduledFuture;
    }

    public boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.a.cancel(z);
        }
        return cancel;
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }

    private int a(Delayed delayed) {
        return this.a.compareTo(delayed);
    }
}
