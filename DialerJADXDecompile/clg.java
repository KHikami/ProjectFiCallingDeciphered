import java.util.Arrays;

public final class clg extends ckv {
    public long c;
    public long d;
    public int e;
    public byte[] f;
    public long g;
    public byte[] h;
    public long i;
    private long j;
    private String k;
    private int l;
    private boolean m;
    private clh[] n;
    private cle o;
    private byte[] p;
    private byte[] q;
    private cld r;
    private String s;
    private clf t;
    private int u;
    private int[] v;

    public clg() {
        this.c = 0;
        this.d = 0;
        this.j = 0;
        this.k = "";
        this.e = 0;
        this.l = 0;
        this.m = false;
        this.n = clh.d();
        this.o = null;
        this.f = clc.e;
        this.p = clc.e;
        this.q = clc.e;
        this.r = null;
        this.s = "";
        this.g = 180000;
        this.t = null;
        this.h = clc.e;
        this.u = 0;
        this.v = clc.a;
        this.i = 0;
        this.a = null;
        this.b = -1;
    }

    protected final int a() {
        int i;
        int i2 = 0;
        int a = super.a();
        if (this.c != 0) {
            a += ckt.b(1, this.c);
        }
        if (!this.k.equals("")) {
            a += ckt.b(2, this.k);
        }
        if (this.n != null && this.n.length > 0) {
            i = a;
            for (cla cla : this.n) {
                if (cla != null) {
                    int b = ckt.b(3);
                    int c = cla.c();
                    i += (c + ckt.d(c)) + b;
                }
            }
            a = i;
        }
        if (!Arrays.equals(this.f, clc.e)) {
            a += ckt.b(6, this.f);
        }
        if (!Arrays.equals(this.p, clc.e)) {
            a += ckt.b(8, this.p);
        }
        if (this.e != 0) {
            a += ckt.b(11) + ckt.a(this.e);
        }
        if (!Arrays.equals(this.q, clc.e)) {
            a += ckt.b(13, this.q);
        }
        if (!this.s.equals("")) {
            a += ckt.b(14, this.s);
        }
        if (this.g != 180000) {
            a += ckt.b(ckt.c(this.g)) + ckt.b(15);
        }
        if (this.d != 0) {
            a += ckt.b(17, this.d);
        }
        if (!Arrays.equals(this.h, clc.e)) {
            a += ckt.b(18, this.h);
        }
        if (this.v != null && this.v.length > 0) {
            i = 0;
            while (i2 < this.v.length) {
                i += ckt.a(this.v[i2]);
                i2++;
            }
            a = (a + i) + (this.v.length * 2);
        }
        if (0 != 0) {
            a += ckt.b(21, 0);
        }
        return this.i != 0 ? a + ckt.b(22, this.i) : a;
    }

    public final void a(ckt ckt) {
        int i = 0;
        if (this.c != 0) {
            ckt.a(1, this.c);
        }
        if (!this.k.equals("")) {
            ckt.a(2, this.k);
        }
        if (this.n != null && this.n.length > 0) {
            for (cla cla : this.n) {
                if (cla != null) {
                    ckt.b(3, 2);
                    if (cla.b < 0) {
                        cla.c();
                    }
                    ckt.c(cla.b);
                    cla.a(ckt);
                }
            }
        }
        if (!Arrays.equals(this.f, clc.e)) {
            ckt.a(6, this.f);
        }
        if (!Arrays.equals(this.p, clc.e)) {
            ckt.a(8, this.p);
        }
        if (this.e != 0) {
            ckt.a(11, this.e);
        }
        if (!Arrays.equals(this.q, clc.e)) {
            ckt.a(13, this.q);
        }
        if (!this.s.equals("")) {
            ckt.a(14, this.s);
        }
        if (this.g != 180000) {
            long j = this.g;
            ckt.b(15, 0);
            ckt.a(ckt.c(j));
        }
        if (this.d != 0) {
            ckt.a(17, this.d);
        }
        if (!Arrays.equals(this.h, clc.e)) {
            ckt.a(18, this.h);
        }
        if (this.v != null && this.v.length > 0) {
            while (i < this.v.length) {
                ckt.a(20, this.v[i]);
                i++;
            }
        }
        if (0 != 0) {
            ckt.a(21, 0);
        }
        if (this.i != 0) {
            ckt.a(22, this.i);
        }
        super.a(ckt);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof clg)) {
            return false;
        }
        clg clg = (clg) obj;
        if (this.c != clg.c) {
            return false;
        }
        if (this.d != clg.d) {
            return false;
        }
        if (0 != 0) {
            return false;
        }
        if (this.k == null) {
            if (clg.k != null) {
                return false;
            }
        } else if (!this.k.equals(clg.k)) {
            return false;
        }
        if (this.e != clg.e) {
            return false;
        }
        if (!ckz.a(this.n, clg.n)) {
            return false;
        }
        if (!Arrays.equals(this.f, clg.f)) {
            return false;
        }
        if (!Arrays.equals(this.p, clg.p)) {
            return false;
        }
        if (!Arrays.equals(this.q, clg.q)) {
            return false;
        }
        if (this.s == null) {
            if (clg.s != null) {
                return false;
            }
        } else if (!this.s.equals(clg.s)) {
            return false;
        }
        return this.g != clg.g ? false : !Arrays.equals(this.h, clg.h) ? false : !ckz.a(this.v, clg.v) ? false : this.i != clg.i ? false : (this.a == null || this.a.a()) ? clg.a == null || clg.a.a() : this.a.equals(clg.a);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((this.s == null ? 0 : this.s.hashCode()) + ((((((((((((((((((this.k == null ? 0 : this.k.hashCode()) + (((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.c ^ (this.c >>> 32)))) * 31) + ((int) (this.d ^ (this.d >>> 32)))) * 31) * 31)) * 31) + this.e) * 31) * 31) + 1237) * 31) + ckz.a(this.n)) * 31) * 31) + Arrays.hashCode(this.f)) * 31) + Arrays.hashCode(this.p)) * 31) + Arrays.hashCode(this.q)) * 31) * 31)) * 31) + ((int) (this.g ^ (this.g >>> 32)))) * 31) * 31) + Arrays.hashCode(this.h)) * 31) * 31) + ckz.a(this.v)) * 31) + ((int) (this.i ^ (this.i >>> 32)))) * 31;
        if (!(this.a == null || this.a.a())) {
            i = this.a.hashCode();
        }
        return hashCode + i;
    }
}
