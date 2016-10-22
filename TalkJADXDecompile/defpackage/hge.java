package defpackage;

import android.os.Looper;

/* renamed from: hge */
public final class hge<L> {
    private final hgf a;
    private volatile L b;

    hge(Looper looper, L l) {
        this.a = new hgf(this, looper);
        this.b = gwb.f((Object) l, (Object) "Listener must not be null");
    }

    public void a() {
        this.b = null;
    }

    public void a(hgg<? super L> hgg__super_L) {
        gwb.f((Object) hgg__super_L, (Object) "Notifier must not be null");
        this.a.sendMessage(this.a.obtainMessage(1, hgg__super_L));
    }

    void b(hgg<? super L> hgg__super_L) {
        Object obj = this.b;
        if (obj == null) {
            hgg__super_L.a();
            return;
        }
        try {
            hgg__super_L.a(obj);
        } catch (RuntimeException e) {
            hgg__super_L.a();
            throw e;
        }
    }
}
