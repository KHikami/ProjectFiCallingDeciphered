package p000;

public class beq {
    public static boolean f3146b;
    public final int f3147a;
    public final bfy f3148c;
    public final String f3149d;
    public long f3150e;

    public boolean m5009a() {
        return m5013e() && m5014f() - bew.f3165a > System.currentTimeMillis();
    }

    public void m5008a(long j) {
        this.f3150e = j;
    }

    @Deprecated
    public long m5010b() {
        return this.f3150e;
    }

    public String m5011c() {
        return this.f3149d;
    }

    public byte[] m5012d() {
        if (m5013e()) {
            return this.f3148c.f3239b;
        }
        throw new IllegalStateException("Tokens expired or invalid have no signature data");
    }

    public beq(long j, loa loa) {
        bfy bfy;
        f3146b = gwb.m2061b(loa.f25846d);
        this.f3149d = loa.f25843a.f28411a;
        if (loa.f25844b == null) {
            this.f3147a = 0;
        } else {
            this.f3147a = gwb.m1507a(beq.m5007a(gwb.m1507a(loa.f25844b)));
        }
        if (loa.f25845c != null) {
            bfy = new bfy(this, j, this.f3149d, loa.f25845c);
        } else {
            bfy = null;
        }
        this.f3148c = bfy;
    }

    public boolean m5013e() {
        return this.f3148c != null && this.f3148c.f3239b != null && this.f3148c.f3238a > 0 && this.f3147a == 0;
    }

    public long m5014f() {
        if (m5013e()) {
            return this.f3148c.f3238a;
        }
        throw new IllegalStateException("Tokens expired or invalid have no expiration time");
    }

    public static Integer m5007a(int i) {
        switch (i) {
            case 0:
                return Integer.valueOf(1);
            case 1:
                return Integer.valueOf(2);
            default:
                return null;
        }
    }
}
