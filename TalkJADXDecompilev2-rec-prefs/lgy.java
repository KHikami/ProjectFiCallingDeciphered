package p000;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public final class lgy {
    final ReferenceQueue<Object> f24986a = new ReferenceQueue();
    final ExecutorService f24987b;
    private final AtomicBoolean f24988c = new AtomicBoolean(false);

    lgy(ExecutorService executorService) {
        this.f24987b = executorService;
    }

    public mti<?> m29060a(Object obj) {
        bm.m6122a(obj);
        if (this.f24988c.compareAndSet(false, true)) {
            this.f24987b.execute(new lgz(this));
        }
        mti mtt = new mtt();
        mtt.mo3706a(new lha(obj, this.f24986a, mtt), gwb.aT());
        return mtt;
    }
}
