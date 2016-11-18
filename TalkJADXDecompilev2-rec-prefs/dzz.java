package p000;

import java.util.Locale;

public final class dzz {
    private static final boolean f10973d = false;
    public long f10974a;
    public final long f10975b;
    public eaf f10976c;
    private final ead f10977e;
    private byte[] f10978f;
    private int f10979g;
    private eag f10980h;
    private String f10981i;

    static {
        kae kae = glk.f15563j;
    }

    public dzz(String str, int i, ead ead) {
        this(0, str, i, 0, 0, glj.m17956a(), ead);
    }

    public dzz(long j, String str, int i, int i2, int i3, long j2, ead ead) {
        this.f10974a = j;
        this.f10976c = new eaa(this, str, i, i2, i3);
        this.f10977e = ead;
        this.f10975b = j2;
    }

    public ead m13246a() {
        return this.f10977e;
    }

    public int m13251b() {
        return this.f10979g;
    }

    public eag m13255c() {
        return this.f10980h;
    }

    public synchronized void m13250a(String str) {
        this.f10981i = str;
    }

    public synchronized String m13256d() {
        return this.f10981i;
    }

    public int m13245a(dzy dzy, eag eag) {
        if (fde.m15018e(this.f10976c.m13268b()) == null) {
            int b = this.f10976c.m13268b();
            String valueOf = String.valueOf(toString());
            glk.m17979c("Babel_NetworkQueue", new StringBuilder(String.valueOf(valueOf).length() + 95).append("Account does not exist on device, removing request from the queue for id ").append(b).append(", request: ").append(valueOf).toString(), new Object[0]);
            eag.m13279a(fdo.f12752a);
            return eae.f10999d;
        } else if (m13258e()) {
            eag.m13279a(fdo.f12752a);
            return eae.f10999d;
        } else if (m13246a().mo1019d() && !dzy.mo1189a()) {
            eag.m13279a(new fdo(101));
            return eae.f10998c;
        } else if (!dzy.mo1194f()) {
            return eae.f10996a;
        } else {
            eag.m13279a(new fdo(102, null, 0, true, null));
            return eae.f10998c;
        }
    }

    public int m13252b(dzy dzy, eag eag) {
        if (f10973d) {
            new StringBuilder(31).append("Processing ").append(this.f10974a);
        }
        try {
            m13246a().mo1007a(dzy.mo1193e(), this.f10976c);
            return eae.f10997b;
        } catch (fdo e) {
            eag.m13279a(e);
            eag.m13278a(e.m15082a());
            eag.m13277a(e.m15084c());
            if (gwb.m2317o(eag.m13276a())) {
                return eae.f10998c;
            }
            return eae.f10999d;
        } catch (Exception e2) {
            eag.m13279a(new fdo(139, e2));
            eag.m13277a(139);
            return eae.f10999d;
        }
    }

    synchronized dzz m13254c(dzy dzy, eag eag) {
        this.f10979g = m13245a(dzy, eag);
        if (this.f10979g == eae.f10996a) {
            this.f10979g = m13252b(dzy, eag);
        }
        this.f10980h = eag;
        return this;
    }

    mti<dzz> m13247a(dzy dzy, eag eag, mtl mtl) {
        return msy.m32869a(mtl.mo3695a(new eab(this, dzy, eag)), Throwable.class, new eac(this), mtl);
    }

    public void m13249a(dzy dzy, fdo fdo) {
        m13246a().a_(dzy.mo1193e(), this.f10976c.m13268b(), fdo);
    }

    public boolean m13257d(dzy dzy, eag eag) {
        this.f10976c.m13271e();
        if (gwb.m2308n(eag.m13276a())) {
            this.f10976c.m13272f();
        }
        if (this.f10976c.m13269c() % 10 == 0) {
            int c = this.f10976c.m13269c();
            int a = eag.m13276a();
            String valueOf = String.valueOf(this.f10977e);
            glk.m17982e("Babel_NetworkQueue", new StringBuilder(String.valueOf(valueOf).length() + 83).append("Retried: ").append(c).append(" errorCode: ").append(a).append(" Request: ").append(valueOf).append(" created: ").append(this.f10975b).toString(), new Object[0]);
        }
        return this.f10977e.mo1008a(dzy.mo1193e(), this.f10976c, eag.m13281c());
    }

    public boolean m13258e() {
        long b = this.f10977e.mo1017b();
        if (b != Long.MAX_VALUE && b > 0 && glj.m17956a() > b + this.f10975b) {
            return true;
        }
        return false;
    }

    public long m13259f() {
        long b = this.f10977e.mo1017b();
        if (b == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        if (b == 0) {
            return 0;
        }
        if (b > 0) {
            return (this.f10975b + b) - glj.m17956a();
        }
        return Long.MAX_VALUE;
    }

    public String toString() {
        Locale locale = Locale.US;
        String str = "REQUEST[id:%d; fc:%d; create:%d; type:%s]";
        Object[] objArr = new Object[4];
        objArr[0] = Long.valueOf(this.f10974a);
        objArr[1] = Integer.valueOf(this.f10976c.m13269c());
        objArr[2] = Long.valueOf(this.f10975b);
        objArr[3] = this.f10977e == null ? "null" : this.f10977e.toString();
        return String.format(locale, str, objArr);
    }

    public long m13260g() {
        return this.f10976c.f10987b;
    }

    public boolean m13253b(String str) {
        return this.f10977e.mo1016a(str);
    }

    public byte[] m13261h() {
        if (this.f10978f == null) {
            this.f10978f = foh.m15795a(this.f10977e);
        }
        return this.f10978f;
    }

    public void m13248a(dzy dzy) {
        ead ead = this.f10977e;
        dzy.mo1193e();
        ead.mo1011f();
    }
}
