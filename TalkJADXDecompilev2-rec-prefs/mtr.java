package p000;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class mtr<V> extends msv<V> implements mtk<V> {
    private final ScheduledFuture<?> f28295a;

    public /* synthetic */ int compareTo(Object obj) {
        return m32887a((Delayed) obj);
    }

    public mtr(mti<V> mti_V, ScheduledFuture<?> scheduledFuture) {
        super(mti_V);
        this.f28295a = scheduledFuture;
    }

    public boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.f28295a.cancel(z);
        }
        return cancel;
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.f28295a.getDelay(timeUnit);
    }

    private int m32887a(Delayed delayed) {
        return this.f28295a.compareTo(delayed);
    }
}
