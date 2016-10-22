import java.util.Locale;

public final class dzz {
    private static final boolean d;
    public long a;
    public final long b;
    public eaf c;
    private final ead e;
    private byte[] f;
    private int g;
    private eag h;
    private String i;

    static {
        kae kae = glk.j;
        d = false;
    }

    public dzz(String str, int i, ead ead) {
        this(0, str, i, 0, 0, glj.a(), ead);
    }

    public dzz(long j, String str, int i, int i2, int i3, long j2, ead ead) {
        this.a = j;
        this.c = new eaa(this, str, i, i2, i3);
        this.e = ead;
        this.b = j2;
    }

    public ead a() {
        return this.e;
    }

    public int b() {
        return this.g;
    }

    public eag c() {
        return this.h;
    }

    public synchronized void a(String str) {
        this.i = str;
    }

    public synchronized String d() {
        return this.i;
    }

    public int a(dzy dzy, eag eag) {
        if (fde.e(this.c.b()) == null) {
            int b = this.c.b();
            String valueOf = String.valueOf(toString());
            glk.c("Babel_NetworkQueue", new StringBuilder(String.valueOf(valueOf).length() + 95).append("Account does not exist on device, removing request from the queue for id ").append(b).append(", request: ").append(valueOf).toString(), new Object[0]);
            eag.a(fdo.a);
            return eae.d;
        } else if (e()) {
            eag.a(fdo.a);
            return eae.d;
        } else if (a().d() && !dzy.a()) {
            eag.a(new fdo(101));
            return eae.c;
        } else if (!dzy.f()) {
            return eae.a;
        } else {
            eag.a(new fdo(102, null, 0, true, null));
            return eae.c;
        }
    }

    public int b(dzy dzy, eag eag) {
        if (d) {
            new StringBuilder(31).append("Processing ").append(this.a);
        }
        try {
            a().a(dzy.e(), this.c);
            return eae.b;
        } catch (fdo e) {
            eag.a(e);
            eag.a(e.a());
            eag.a(e.c());
            if (gwb.o(eag.a())) {
                return eae.c;
            }
            return eae.d;
        } catch (Exception e2) {
            eag.a(new fdo(139, e2));
            eag.a(139);
            return eae.d;
        }
    }

    synchronized dzz c(dzy dzy, eag eag) {
        this.g = a(dzy, eag);
        if (this.g == eae.a) {
            this.g = b(dzy, eag);
        }
        this.h = eag;
        return this;
    }

    mti<dzz> a(dzy dzy, eag eag, mtl mtl) {
        return msy.a(mtl.a(new eab(this, dzy, eag)), Throwable.class, new eac(this), mtl);
    }

    public void a(dzy dzy, fdo fdo) {
        a().a_(dzy.e(), this.c.b(), fdo);
    }

    public boolean d(dzy dzy, eag eag) {
        this.c.e();
        if (gwb.n(eag.a())) {
            this.c.f();
        }
        if (this.c.c() % 10 == 0) {
            int c = this.c.c();
            int a = eag.a();
            String valueOf = String.valueOf(this.e);
            glk.e("Babel_NetworkQueue", new StringBuilder(String.valueOf(valueOf).length() + 83).append("Retried: ").append(c).append(" errorCode: ").append(a).append(" Request: ").append(valueOf).append(" created: ").append(this.b).toString(), new Object[0]);
        }
        return this.e.a(dzy.e(), this.c, eag.c());
    }

    public boolean e() {
        long b = this.e.b();
        if (b != Long.MAX_VALUE && b > 0 && glj.a() > b + this.b) {
            return true;
        }
        return false;
    }

    public long f() {
        long b = this.e.b();
        if (b == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        if (b == 0) {
            return 0;
        }
        if (b > 0) {
            return (this.b + b) - glj.a();
        }
        return Long.MAX_VALUE;
    }

    public String toString() {
        Locale locale = Locale.US;
        String str = "REQUEST[id:%d; fc:%d; create:%d; type:%s]";
        Object[] objArr = new Object[4];
        objArr[0] = Long.valueOf(this.a);
        objArr[1] = Integer.valueOf(this.c.c());
        objArr[2] = Long.valueOf(this.b);
        objArr[3] = this.e == null ? "null" : this.e.toString();
        return String.format(locale, str, objArr);
    }

    public long g() {
        return this.c.b;
    }

    public boolean b(String str) {
        return this.e.a(str);
    }

    public byte[] h() {
        if (this.f == null) {
            this.f = foh.a(this.e);
        }
        return this.f;
    }

    public void a(dzy dzy) {
        ead ead = this.e;
        dzy.e();
        ead.f();
    }
}
