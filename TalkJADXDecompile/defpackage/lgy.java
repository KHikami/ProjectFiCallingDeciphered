package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: lgy */
public final class lgy {
    final ReferenceQueue<Object> a;
    final ExecutorService b;
    private final AtomicBoolean c;

    lgy(ExecutorService executorService) {
        this.a = new ReferenceQueue();
        this.c = new AtomicBoolean(false);
        this.b = executorService;
    }

    public mti<?> a(Object obj) {
        bm.a(obj);
        if (this.c.compareAndSet(false, true)) {
            this.b.execute(new lgz(this));
        }
        mti mtt = new mtt();
        mtt.a(new lha(obj, this.a, mtt), gwb.aT());
        return mtt;
    }
}
