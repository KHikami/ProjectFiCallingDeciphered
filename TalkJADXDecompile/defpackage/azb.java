package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: azb */
public final class azb {
    private final ky<bap, aqo<?, ?, ?>> a;
    private final AtomicReference<bap> b;

    public azb() {
        this.a = new ky();
        this.b = new AtomicReference();
    }

    public boolean a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        boolean containsKey;
        bap c = c(cls, cls2, cls3);
        synchronized (this.a) {
            containsKey = this.a.containsKey(c);
        }
        this.b.set(c);
        return containsKey;
    }

    public <Data, TResource, Transcode> aqo<Data, TResource, Transcode> b(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        aqo<Data, TResource, Transcode> aqo_Data__TResource__Transcode;
        bap c = c(cls, cls2, cls3);
        synchronized (this.a) {
            aqo_Data__TResource__Transcode = (aqo) this.a.get(c);
        }
        this.b.set(c);
        return aqo_Data__TResource__Transcode;
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3, aqo<?, ?, ?> aqo_____) {
        synchronized (this.a) {
            this.a.put(new bap(cls, cls2, cls3), aqo_____);
        }
    }

    private bap c(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        bap bap = (bap) this.b.getAndSet(null);
        if (bap == null) {
            bap = new bap();
        }
        bap.a(cls, cls2, cls3);
        return bap;
    }
}
