package p000;

import java.util.Collection;
import java.util.List;

public class fhb {
    private static final boolean f5734a = false;
    private int f5735b = -1;
    public final fdc f5736c;
    public final fhc f5737d;
    public final long f5738e;
    public String f5739f;

    static {
        kae kae = glk.f15568o;
    }

    public fhb(bko bko) {
        this.f5736c = new fdc(bko);
        this.f5737d = new fhc();
        this.f5738e = glj.m17963b();
    }

    public List<fok> mo1999i() {
        return this.f5737d.m15311b();
    }

    public int u_() {
        return 1;
    }

    public Object v_() {
        return null;
    }

    public void w_() {
    }

    public boolean m8041a(fdn fdn, int i, fny fny) {
        Collection<fok> i2 = mo1999i();
        if (i2.isEmpty()) {
            return false;
        }
        for (fok d_ : i2) {
            d_.d_(this.f5739f);
        }
        if (f5734a) {
            int size = i2.size();
            String valueOf = String.valueOf(getClass().getSimpleName());
            new StringBuilder(String.valueOf(valueOf).length() + 76).append("sendRequestsToServer: sending ").append(size).append(" requests from executing operation ").append(valueOf);
        }
        fdn.m15080a((Collection) i2, i, fny);
        return true;
    }

    public boolean m8040a(fdn fdn, int i) {
        return m8041a(fdn, i, null);
    }

    public int mo1991a(bhb bhb) {
        w_();
        m8040a(this.f5736c.f12723c, this.f5735b);
        this.f5737d.m15313c();
        return bhn.f3348a;
    }

    public final void m8039a(fok fok) {
        this.f5737d.m15308a(fok);
    }

    public void m8042b(int i) {
        this.f5735b = i;
    }

    public int m8044j() {
        return this.f5735b;
    }
}
