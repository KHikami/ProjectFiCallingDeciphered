package defpackage;

/* renamed from: beq */
public class beq {
    public static boolean b;
    public final int a;
    public final bfy c;
    public final String d;
    public long e;

    public boolean a() {
        return e() && f() - bew.a > System.currentTimeMillis();
    }

    public void a(long j) {
        this.e = j;
    }

    @Deprecated
    public long b() {
        return this.e;
    }

    public String c() {
        return this.d;
    }

    public byte[] d() {
        if (e()) {
            return this.c.b;
        }
        throw new IllegalStateException("Tokens expired or invalid have no signature data");
    }

    public beq(long j, loa loa) {
        bfy bfy;
        b = gwb.b(loa.d);
        this.d = loa.a.a;
        if (loa.b == null) {
            this.a = 0;
        } else {
            this.a = gwb.a(beq.a(gwb.a(loa.b)));
        }
        if (loa.c != null) {
            bfy = new bfy(this, j, this.d, loa.c);
        } else {
            bfy = null;
        }
        this.c = bfy;
    }

    public boolean e() {
        return this.c != null && this.c.b != null && this.c.a > 0 && this.a == 0;
    }

    public long f() {
        if (e()) {
            return this.c.a;
        }
        throw new IllegalStateException("Tokens expired or invalid have no expiration time");
    }

    public static Integer a(int i) {
        switch (i) {
            case wi.w /*0*/:
                return Integer.valueOf(1);
            case wi.j /*1*/:
                return Integer.valueOf(2);
            default:
                return null;
        }
    }
}
