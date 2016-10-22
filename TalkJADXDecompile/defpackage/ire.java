package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ire */
public final class ire {
    final Context a;
    final ite b;
    private final Map<String, irf> c;

    public ire(Context context, ite ite) {
        this.c = new HashMap();
        this.a = context;
        this.b = ite;
    }

    gti a() {
        itf a = this.b.o().a();
        return new gti(this.a, "HANGOUT_LOG_REQUEST", a == null ? null : a.o());
    }

    public void b() {
        for (irf a : this.c.values()) {
            a.a();
        }
    }

    private irf c() {
        Object obj;
        iil.a();
        itf a = this.b.o().a();
        if (a == null) {
            obj = null;
        } else {
            String o = a.o();
        }
        irf irf = (irf) this.c.get(obj);
        if (irf != null) {
            return irf;
        }
        irf = new irf(this);
        this.c.put(obj, irf);
        return irf;
    }

    public void a(int i) {
        iil.a();
        c().a(i, null);
    }

    public void a(int i, String str) {
        iil.a();
        c().a(i, str);
    }

    public void a(long j, int i, int i2) {
        iil.a();
        c().a(j, i, i2);
    }

    public void a(mdq mdq, long j) {
        iil.a();
        c().a(mdq, j);
    }

    public void a(mdh mdh, String str) {
        iil.a();
        c().a(mdh, str);
    }
}
