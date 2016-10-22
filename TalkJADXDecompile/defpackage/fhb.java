package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: fhb */
public class fhb {
    private static final boolean a;
    private int b;
    public final fdc c;
    public final fhc d;
    public final long e;
    public String f;

    static {
        kae kae = glk.o;
        a = false;
    }

    public fhb(bko bko) {
        this.b = -1;
        this.c = new fdc(bko);
        this.d = new fhc();
        this.e = glj.b();
    }

    public List<fok> i() {
        return this.d.b();
    }

    public int u_() {
        return 1;
    }

    public Object v_() {
        return null;
    }

    public void w_() {
    }

    public boolean a(fdn fdn, int i, fny fny) {
        Collection<fok> i2 = i();
        if (i2.isEmpty()) {
            return false;
        }
        for (fok d_ : i2) {
            d_.d_(this.f);
        }
        if (a) {
            int size = i2.size();
            String valueOf = String.valueOf(getClass().getSimpleName());
            new StringBuilder(String.valueOf(valueOf).length() + 76).append("sendRequestsToServer: sending ").append(size).append(" requests from executing operation ").append(valueOf);
        }
        fdn.a((Collection) i2, i, fny);
        return true;
    }

    public boolean a(fdn fdn, int i) {
        return a(fdn, i, null);
    }

    public int a(bhb bhb) {
        w_();
        a(this.c.c, this.b);
        this.d.c();
        return bhn.a;
    }

    public final void a(fok fok) {
        this.d.a(fok);
    }

    public void b(int i) {
        this.b = i;
    }

    public int j() {
        return this.b;
    }
}
