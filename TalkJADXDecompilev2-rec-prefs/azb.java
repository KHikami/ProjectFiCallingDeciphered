package p000;

import java.util.concurrent.atomic.AtomicReference;

public final class azb {
    private final ky<bap, aqo<?, ?, ?>> f2576a = new ky();
    private final AtomicReference<bap> f2577b = new AtomicReference();

    public boolean m4403a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        boolean containsKey;
        bap c = m4401c(cls, cls2, cls3);
        synchronized (this.f2576a) {
            containsKey = this.f2576a.containsKey(c);
        }
        this.f2577b.set(c);
        return containsKey;
    }

    public <Data, TResource, Transcode> aqo<Data, TResource, Transcode> m4404b(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        aqo<Data, TResource, Transcode> aqo_Data__TResource__Transcode;
        bap c = m4401c(cls, cls2, cls3);
        synchronized (this.f2576a) {
            aqo_Data__TResource__Transcode = (aqo) this.f2576a.get(c);
        }
        this.f2577b.set(c);
        return aqo_Data__TResource__Transcode;
    }

    public void m4402a(Class<?> cls, Class<?> cls2, Class<?> cls3, aqo<?, ?, ?> aqo_____) {
        synchronized (this.f2576a) {
            this.f2576a.put(new bap(cls, cls2, cls3), aqo_____);
        }
    }

    private bap m4401c(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        bap bap = (bap) this.f2577b.getAndSet(null);
        if (bap == null) {
            bap = new bap();
        }
        bap.m4679a(cls, cls2, cls3);
        return bap;
    }
}
