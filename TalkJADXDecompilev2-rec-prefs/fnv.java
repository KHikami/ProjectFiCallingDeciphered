package p000;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

class fnv extends fbq<mvp> {
    private final Long f13547b;

    protected /* synthetic */ omq mo2041a(fbn fbn, AtomicReference atomicReference, AtomicReference atomicReference2) {
        return m15776b(fbn, atomicReference, atomicReference2);
    }

    protected mvp m15776b(fbn fbn, AtomicReference<okw> atomicReference, AtomicReference<okw> atomicReference2) {
        return fbn.m14894a(this.a, atomicReference, atomicReference2);
    }

    protected int mo2040a(Context context, fdo fdo) {
        int i = this.a;
        String valueOf = String.valueOf(fdo);
        glk.m17981d("Babel_Registration", new StringBuilder(String.valueOf(valueOf).length() + 57).append("Unregistering account failed: ").append(i).append(" with exception ").append(valueOf).toString(), new Object[0]);
        return bhn.f3351d;
    }

    protected void m15773a(Context context, mvp mvp) {
        ((iih) jyn.m25426a(context, iih.class)).mo1979a(this.a).mo1693b().mo1714c(3227);
        jyn.m25426a(context, fnh.class);
        mvk mvk = new mvk();
        mvk.f28481a = "social";
        if (this.f13547b != null) {
            mvk.f28484d = gwb.m1523a(this.f13547b);
        }
        String valueOf = String.valueOf(mvk);
        glk.m17970a("Babel_Registration", new StringBuilder(String.valueOf(valueOf).length() + 33).append("Send unregister account request: ").append(valueOf).toString(), new Object[0]);
        mvp.m33111a(mvk);
    }

    public String mo542b() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.a).toString();
    }

    public bhk mo543c() {
        return bhk.NONE;
    }
}
