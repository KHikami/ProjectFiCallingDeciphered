package p000;

import java.util.Collections;
import java.util.Map;

public final class bce extends alo<fsh> {
    private static final Object f2995i = new Object();
    public final gkh f2996e;
    public String f2997f;
    public Long f2998g = null;
    private final alu<fsh> f2999h;

    public bce(gkh gkh, alu<fsh> alu_fsh, alt alt) {
        super(gkh.m5545r(), alt);
        m2839a(new alw(1000, 2, 2.0f));
        this.f2999h = alu_fsh;
        this.f2996e = gkh;
        this.f2997f = null;
        if (this.f2996e.m5540m() != null) {
            dzh a = dzg.m13144a(eul.f12200g);
            try {
                this.f2997f = a.m13145a(this.f2996e.m5540m());
            } catch (Throwable e) {
                glk.m17980d("Babel", "Error getting auth token", e);
            }
            if (this.f2997f != null) {
                this.f2998g = a.m13148c(this.f2997f);
            }
        }
    }

    public alq mo463o() {
        return alq.LOW;
    }

    public Map<String, String> mo462g() {
        if (this.f2997f == null) {
            return Collections.emptyMap();
        }
        Map<String, String> kyVar = new ky();
        String str = "Authorization";
        String str2 = "Bearer ";
        String valueOf = String.valueOf(this.f2997f);
        kyVar.put(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        return kyVar;
    }

    protected als<fsh> mo460a(aln aln) {
        als<fsh> als;
        synchronized (f2995i) {
            try {
                alg alg = new alg();
                alg.f1182a = aln.f1209b;
                alg.f1188g = aln.f1210c;
                alg.f1186e = Long.MAX_VALUE;
                alg.f1187f = Long.MAX_VALUE;
                alg.f1184c = glj.m17956a();
                als = new als(new fsh(aln.f1209b, (String) aln.f1210c.get("Content-Type"), aln.f1210c.get("VolleyDiskCache") != null), alg);
            } catch (Throwable e) {
                int length = aln.f1209b.length;
                String valueOf = String.valueOf(m2847c());
                glk.m17982e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 43).append("Caught OOM for ").append(length).append(" byte media, url=").append(valueOf).toString(), new Object[0]);
                als = als.m2870a(new alx(e, (short) 0));
            }
        }
        return als;
    }

    private void m4835a(fsh fsh) {
        this.f2999h.m2874a((Object) fsh);
    }
}
