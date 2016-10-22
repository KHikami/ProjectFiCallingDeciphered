/* compiled from: PG */
public final class dju {
    public static final dlx a;
    public static final dlx b;
    public static final dlx c;
    public static final dlx d;
    public static final dlx e;
    public final dlx f;
    public final dlx g;
    final int h;

    static {
        a = dlx.a(":status");
        b = dlx.a(":method");
        c = dlx.a(":path");
        d = dlx.a(":scheme");
        e = dlx.a(":authority");
        dlx.a(":host");
        dlx.a(":version");
    }

    public dju(String str, String str2) {
        this(dlx.a(str), dlx.a(str2));
    }

    public dju(dlx dlx, String str) {
        this(dlx, dlx.a(str));
    }

    public dju(dlx dlx, dlx dlx2) {
        this.f = dlx;
        this.g = dlx2;
        this.h = (dlx.b.length + 32) + dlx2.b.length;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dju)) {
            return false;
        }
        dju dju = (dju) obj;
        if (this.f.equals(dju.f) && this.g.equals(dju.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", new Object[]{this.f.a(), this.g.a()});
    }
}
