import java.io.Serializable;

/* compiled from: PG */
public final class ddo implements Serializable {
    private static final long serialVersionUID = 1;
    public boolean a;
    public int b;
    public long c;
    boolean d;
    String e;
    boolean f;
    int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private String l;
    private boolean m;
    private ddp n;
    private boolean o;
    private String p;

    public ddo() {
        this.b = 0;
        this.c = 0;
        this.e = "";
        this.f = false;
        this.g = 1;
        this.l = "";
        this.p = "";
        this.n = ddp.FROM_NUMBER_WITH_PLUS_SIGN;
    }

    public final ddo a(int i) {
        this.a = true;
        this.b = i;
        return this;
    }

    public final ddo a(long j) {
        this.h = true;
        this.c = j;
        return this;
    }

    public final ddo a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.d = true;
        this.e = str;
        return this;
    }

    public final ddo a() {
        this.d = false;
        this.e = "";
        return this;
    }

    public final ddo a(boolean z) {
        this.i = true;
        this.f = z;
        return this;
    }

    public final ddo b(int i) {
        this.j = true;
        this.g = i;
        return this;
    }

    public final ddo b() {
        this.k = false;
        this.l = "";
        return this;
    }

    public final ddo a(ddp ddp) {
        if (ddp == null) {
            throw new NullPointerException();
        }
        this.m = true;
        this.n = ddp;
        return this;
    }

    public final ddo c() {
        this.m = false;
        this.n = ddp.FROM_NUMBER_WITH_PLUS_SIGN;
        return this;
    }

    public final ddo d() {
        this.o = false;
        this.p = "";
        return this;
    }

    public final ddo a(ddo ddo) {
        String str;
        if (ddo.a) {
            a(ddo.b);
        }
        if (ddo.h) {
            a(ddo.c);
        }
        if (ddo.d) {
            a(ddo.e);
        }
        if (ddo.i) {
            a(ddo.f);
        }
        if (ddo.j) {
            b(ddo.g);
        }
        if (ddo.k) {
            str = ddo.l;
            if (str == null) {
                throw new NullPointerException();
            }
            this.k = true;
            this.l = str;
        }
        if (ddo.m) {
            a(ddo.n);
        }
        if (ddo.o) {
            str = ddo.p;
            if (str == null) {
                throw new NullPointerException();
            }
            this.o = true;
            this.p = str;
        }
        return this;
    }

    public final boolean b(ddo ddo) {
        if (ddo == null) {
            return false;
        }
        if (this == ddo) {
            return true;
        }
        if (this.b == ddo.b && this.c == ddo.c && this.e.equals(ddo.e) && this.f == ddo.f && this.g == ddo.g && this.l.equals(ddo.l) && this.n == ddo.n && this.p.equals(ddo.p) && this.o == ddo.o) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ddo) && b((ddo) obj);
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = ((((((((((this.f ? 1231 : 1237) + ((((((this.b + 2173) * 53) + Long.valueOf(this.c).hashCode()) * 53) + this.e.hashCode()) * 53)) * 53) + this.g) * 53) + this.l.hashCode()) * 53) + this.n.hashCode()) * 53) + this.p.hashCode()) * 53;
        if (!this.o) {
            i = 1237;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Country Code: ").append(this.b);
        stringBuilder.append(" National Number: ").append(this.c);
        if (this.i && this.f) {
            stringBuilder.append(" Leading Zero(s): true");
        }
        if (this.j) {
            stringBuilder.append(" Number of leading zeros: ").append(this.g);
        }
        if (this.d) {
            stringBuilder.append(" Extension: ").append(this.e);
        }
        if (this.m) {
            stringBuilder.append(" Country Code Source: ").append(this.n);
        }
        if (this.o) {
            stringBuilder.append(" Preferred Domestic Carrier Code: ").append(this.p);
        }
        return stringBuilder.toString();
    }
}
