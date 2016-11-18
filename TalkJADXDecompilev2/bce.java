package defpackage;

import java.util.Collections;
import java.util.Map;

public final class bce extends alo<fsh> {
    private static final Object i = new Object();
    public final gkh e;
    public String f;
    public Long g = null;
    private final alu<fsh> h;

    public bce(gkh gkh, alu<fsh> alu_fsh, alt alt) {
        super(gkh.r(), alt);
        a(new alw(1000, 2, 2.0f));
        this.h = alu_fsh;
        this.e = gkh;
        this.f = null;
        if (this.e.m() != null) {
            dzh a = dzg.a(eul.g);
            try {
                this.f = a.a(this.e.m());
            } catch (Throwable e) {
                glk.d("Babel", "Error getting auth token", e);
            }
            if (this.f != null) {
                this.g = a.c(this.f);
            }
        }
    }

    public alq o() {
        return alq.LOW;
    }

    public Map<String, String> g() {
        if (this.f == null) {
            return Collections.emptyMap();
        }
        Map<String, String> kyVar = new ky();
        String str = "Authorization";
        String str2 = "Bearer ";
        String valueOf = String.valueOf(this.f);
        kyVar.put(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        return kyVar;
    }

    protected als<fsh> a(aln aln) {
        als<fsh> als;
        synchronized (i) {
            try {
                alg alg = new alg();
                alg.a = aln.b;
                alg.g = aln.c;
                alg.e = Long.MAX_VALUE;
                alg.f = Long.MAX_VALUE;
                alg.c = glj.a();
                als = new als(new fsh(aln.b, (String) aln.c.get("Content-Type"), aln.c.get("VolleyDiskCache") != null), alg);
            } catch (Throwable e) {
                int length = aln.b.length;
                String valueOf = String.valueOf(c());
                glk.e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 43).append("Caught OOM for ").append(length).append(" byte media, url=").append(valueOf).toString(), new Object[0]);
                als = als.a(new alx(e, (short) 0));
            }
        }
        return als;
    }

    private void a(fsh fsh) {
        this.h.a((Object) fsh);
    }
}
