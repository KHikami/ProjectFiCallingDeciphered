package defpackage;

import android.util.Log;

/* compiled from: PG */
/* renamed from: cxd */
public final class cxd implements Runnable {
    private /* synthetic */ i a;
    private /* synthetic */ cxh b;
    private /* synthetic */ cxe c;

    public cxd(i iVar, cxh cxh, cxe cxe) {
        this.a = iVar;
        this.b = cxh;
        this.c = cxe;
    }

    public final void run() {
        try {
            Object c = this.a.c();
            buf.B(c);
            cxh cxh = this.b;
            synchronized (cxh.a) {
                if (cxh.d) {
                    return;
                }
                try {
                    for (dln a : cxh.b.a) {
                        c.a(a);
                    }
                    cxh.c = c;
                    cxh.b = null;
                } catch (Exception e) {
                    cxh.a();
                    throw e;
                } catch (Throwable th) {
                    cxh.b = null;
                }
            }
        } catch (Throwable e2) {
            this.b.a();
            if (this.c != null) {
                this.c.a(e2);
            } else {
                Log.e("TransmitterFactory", "provider failed, but no callback", e2);
            }
        }
    }
}
