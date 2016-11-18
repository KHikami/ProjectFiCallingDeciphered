package p000;

import android.os.Looper;

public final class hge<L> {
    private final hgf f16900a;
    private volatile L f16901b;

    hge(Looper looper, L l) {
        this.f16900a = new hgf(this, looper);
        this.f16901b = gwb.m2195f((Object) l, (Object) "Listener must not be null");
    }

    public void m19728a() {
        this.f16901b = null;
    }

    public void m19729a(hgg<? super L> hgg__super_L) {
        gwb.m2195f((Object) hgg__super_L, (Object) "Notifier must not be null");
        this.f16900a.sendMessage(this.f16900a.obtainMessage(1, hgg__super_L));
    }

    void m19730b(hgg<? super L> hgg__super_L) {
        Object obj = this.f16901b;
        if (obj == null) {
            hgg__super_L.mo3024a();
            return;
        }
        try {
            hgg__super_L.mo3025a(obj);
        } catch (RuntimeException e) {
            hgg__super_L.mo3024a();
            throw e;
        }
    }
}
