package p000;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class azc {
    private final AtomicReference<bap> f2578a = new AtomicReference();
    private final ky<bap, List<Class<?>>> f2579b = new ky();

    public List<Class<?>> m4405a(Class<?> cls, Class<?> cls2) {
        Object bap;
        List<Class<?>> list;
        bap bap2 = (bap) this.f2578a.getAndSet(null);
        if (bap2 == null) {
            bap = new bap(cls, cls2);
        } else {
            bap2.m4678a(cls, cls2);
            bap bap3 = bap2;
        }
        synchronized (this.f2579b) {
            list = (List) this.f2579b.get(bap);
        }
        this.f2578a.set(bap);
        return list;
    }

    public void m4406a(Class<?> cls, Class<?> cls2, List<Class<?>> list) {
        synchronized (this.f2579b) {
            this.f2579b.put(new bap(cls, cls2), list);
        }
    }
}
