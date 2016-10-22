import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public final class olv {
    static final List<olv> a;
    public static final olv b;
    public static final olv c;
    public static final olv d;
    public static final olv e;
    public static final olv f;
    public static final olv g;
    public static final olv h;
    public static final olv i;
    public static final olv j;
    public static final olv k;
    public static final olv l;
    public static final olv m;
    public static final olv n;
    public static final olv o;
    public static final olv p;
    public static final olv q;
    public static final olv r;
    public static final olf<olv> s;
    public static final olf<String> t;
    private static final olc<String> u;
    private final olx v;
    private final String w;
    private final Throwable x;

    public static olv a(int i) {
        if (i < 0 || i > a.size()) {
            return d.a("Unknown code " + i);
        }
        return (olv) a.get(i);
    }

    public static olv a(Throwable th) {
        for (Throwable th2 = (Throwable) bm.a((Object) th, (Object) "t"); th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof olz) {
                return ((olz) th2).a;
            }
            if (th2 instanceof oma) {
                return ((oma) th2).a;
            }
        }
        return d.b(th);
    }

    static String a(olv olv) {
        if (olv.w == null) {
            return olv.v.toString();
        }
        String valueOf = String.valueOf(olv.v);
        String str = olv.w;
        return new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(str).length()).append(valueOf).append(": ").append(str).toString();
    }

    private olv(olx olx) {
        this(olx, null, null);
    }

    private olv(olx olx, String str, Throwable th) {
        this.v = (olx) bm.a((Object) olx, (Object) "code");
        this.w = str;
        this.x = th;
    }

    public olv b(Throwable th) {
        return mez.b(this.x, th) ? this : new olv(this.v, this.w, th);
    }

    public olv a(String str) {
        return mez.b(this.w, str) ? this : new olv(this.v, str, this.x);
    }

    public olv b(String str) {
        if (str == null) {
            return this;
        }
        if (this.w == null) {
            return new olv(this.v, str, this.x);
        }
        olx olx = this.v;
        String str2 = this.w;
        return new olv(olx, new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str).length()).append(str2).append("\n").append(str).toString(), this.x);
    }

    public olx a() {
        return this.v;
    }

    public String b() {
        return this.w;
    }

    public Throwable c() {
        return this.x;
    }

    public boolean d() {
        return olx.OK == this.v;
    }

    public oma e() {
        return new oma(this);
    }

    public oma a(okw okw) {
        return new oma(this, okw);
    }

    public olz f() {
        return new olz(this);
    }

    public String toString() {
        return gwb.P((Object) this).a("code", this.v.name()).a("description", this.w).a("cause", this.x).toString();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    static {
        TreeMap treeMap = new TreeMap();
        for (olx olx : olx.values()) {
            olv olv = (olv) treeMap.put(Integer.valueOf(olx.a()), new olv(olx));
            if (olv != null) {
                String valueOf = String.valueOf(olv.a().name());
                String valueOf2 = String.valueOf(olx.name());
                throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(valueOf2).length()).append("Code value duplication between ").append(valueOf).append(" & ").append(valueOf2).toString());
            }
        }
        a = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        b = olx.OK.b();
        c = olx.CANCELLED.b();
        d = olx.UNKNOWN.b();
        e = olx.INVALID_ARGUMENT.b();
        f = olx.DEADLINE_EXCEEDED.b();
        g = olx.NOT_FOUND.b();
        h = olx.ALREADY_EXISTS.b();
        i = olx.PERMISSION_DENIED.b();
        j = olx.UNAUTHENTICATED.b();
        k = olx.RESOURCE_EXHAUSTED.b();
        l = olx.FAILED_PRECONDITION.b();
        m = olx.ABORTED.b();
        n = olx.OUT_OF_RANGE.b();
        o = olx.UNIMPLEMENTED.b();
        p = olx.INTERNAL.b();
        q = olx.UNAVAILABLE.b();
        r = olx.DATA_LOSS.b();
        s = olf.a("grpc-status", new oly());
        u = new olw();
        t = olf.a("grpc-message", u);
    }
}
