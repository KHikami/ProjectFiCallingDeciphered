package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: azr */
public final class azr implements bbf {
    private final WeakReference a;
    private final boolean b;

    public azr(azo azo, boolean z) {
        this.a = new WeakReference(azo);
        this.b = z;
    }

    public final void a(String str, bbe bbe) {
        azo azo = (azo) this.a.get();
        if (azo != null) {
            boolean z = this.b;
            Object obj = (!(z && azo.c != null && TextUtils.equals(str, azo.c.d)) && (z || azo.d == null || !TextUtils.equals(str, azo.d.d))) ? null : 1;
            if (obj != null) {
                azo.a(bbe, z);
            } else {
                String str2 = "Dropping stale contact lookup info for ";
                String valueOf = String.valueOf(str);
                bdf.e(azo, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            ayo a = azs.a.a(str);
            if (a != null) {
                a.g.c = bbe.o;
            }
        }
    }

    public final void b(String str, bbe bbe) {
        azo azo = (azo) this.a.get();
        if (azo != null && azo.i != null && bbe.f != null && azo.c != null && str.equals(azo.c.d)) {
            boolean z;
            if (bdt.a(azo.c.k(), azo.c.c())) {
                z = false;
            } else {
                z = true;
            }
            ((azq) azo.i).a(bbe.f, z);
        }
    }

    public final void c(String str, bbe bbe) {
        azo azo = (azo) this.a.get();
        if (azo != null && azo.i != null && azo.c != null && str.equals(azo.c.d)) {
            azo.e.m = bbe.m;
            azo.d();
        }
    }
}
