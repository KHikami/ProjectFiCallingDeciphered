package p000;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class ire {
    final Context f18754a;
    final ite f18755b;
    private final Map<String, irf> f18756c = new HashMap();

    public ire(Context context, ite ite) {
        this.f18754a = context;
        this.f18755b = ite;
    }

    gti m23010a() {
        itf a = this.f18755b.mo3224o().m23201a();
        return new gti(this.f18754a, "HANGOUT_LOG_REQUEST", a == null ? null : a.m23189o());
    }

    public void m23016b() {
        for (irf a : this.f18756c.values()) {
            a.m23018a();
        }
    }

    private irf m23009c() {
        Object obj;
        iil.m21867a();
        itf a = this.f18755b.mo3224o().m23201a();
        if (a == null) {
            obj = null;
        } else {
            String o = a.m23189o();
        }
        irf irf = (irf) this.f18756c.get(obj);
        if (irf != null) {
            return irf;
        }
        irf = new irf(this);
        this.f18756c.put(obj, irf);
        return irf;
    }

    public void m23011a(int i) {
        iil.m21867a();
        m23009c().m23020a(i, null);
    }

    public void m23012a(int i, String str) {
        iil.m21867a();
        m23009c().m23020a(i, str);
    }

    public void m23013a(long j, int i, int i2) {
        iil.m21867a();
        m23009c().m23021a(j, i, i2);
    }

    public void m23015a(mdq mdq, long j) {
        iil.m21867a();
        m23009c().m23024a(mdq, j);
    }

    public void m23014a(mdh mdh, String str) {
        iil.m21867a();
        m23009c().m23023a(mdh, str);
    }
}
