package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import omq;

/* renamed from: fnv */
class fnv extends fbq<mvp> {
    private final Long b;

    protected /* synthetic */ omq a(fbn fbn, AtomicReference atomicReference, AtomicReference atomicReference2) {
        return b(fbn, atomicReference, atomicReference2);
    }

    protected mvp b(fbn fbn, AtomicReference<okw> atomicReference, AtomicReference<okw> atomicReference2) {
        return fbn.a(this.a, atomicReference, atomicReference2);
    }

    protected int a(Context context, fdo fdo) {
        int i = this.a;
        String valueOf = String.valueOf(fdo);
        glk.d("Babel_Registration", new StringBuilder(String.valueOf(valueOf).length() + 57).append("Unregistering account failed: ").append(i).append(" with exception ").append(valueOf).toString(), new Object[0]);
        return bhn.d;
    }

    protected void a(Context context, mvp mvp) {
        ((iih) jyn.a(context, iih.class)).a(this.a).b().c(3227);
        jyn.a(context, fnh.class);
        mvk mvk = new mvk();
        mvk.a = "social";
        if (this.b != null) {
            mvk.d = gwb.a(this.b);
        }
        String valueOf = String.valueOf(mvk);
        glk.a("Babel_Registration", new StringBuilder(String.valueOf(valueOf).length() + 33).append("Send unregister account request: ").append(valueOf).toString(), new Object[0]);
        mvp.a(mvk);
    }

    public String b() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.a).toString();
    }

    public bhk c() {
        return bhk.NONE;
    }
}
