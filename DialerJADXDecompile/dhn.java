import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* compiled from: PG */
public final class dhn {
    static final List a;
    public static final dhn b;
    public static final dhn c;
    public static final dhn d;
    public static final dhn e;
    public static final dhn f;
    public static final dhn g;
    public static final dhn h;
    public static final dhn i;
    public static final dhn j;
    public static final dha k;
    public static final dha l;
    private static final dgx p;
    public final dhp m;
    public final String n;
    public final Throwable o;

    public static dhn a(int i) {
        if (i < 0 || i > a.size()) {
            return d.a("Unknown code " + i);
        }
        return (dhn) a.get(i);
    }

    public static dhn a(Throwable th) {
        for (Throwable th2 = (Throwable) cob.i((Object) th); th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof dhr) {
                return ((dhr) th2).a;
            }
            if (th2 instanceof dhs) {
                return ((dhs) th2).a;
            }
        }
        return d.b(th);
    }

    static String a(dhn dhn) {
        if (dhn.n == null) {
            return dhn.m.toString();
        }
        String valueOf = String.valueOf(dhn.m);
        String str = dhn.n;
        return new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(str).length()).append(valueOf).append(": ").append(str).toString();
    }

    private dhn(dhp dhp) {
        this(dhp, null, null);
    }

    private dhn(dhp dhp, String str, Throwable th) {
        this.m = (dhp) cob.i((Object) dhp);
        this.n = str;
        this.o = th;
    }

    public final dhn b(Throwable th) {
        return cob.a(this.o, (Object) th) ? this : new dhn(this.m, this.n, th);
    }

    public final dhn a(String str) {
        return cob.a(this.n, (Object) str) ? this : new dhn(this.m, str, this.o);
    }

    public final dhn b(String str) {
        if (str == null) {
            return this;
        }
        if (this.n == null) {
            return new dhn(this.m, str, this.o);
        }
        dhp dhp = this.m;
        String str2 = this.n;
        return new dhn(dhp, new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str).length()).append(str2).append("\n").append(str).toString(), this.o);
    }

    public final boolean a() {
        return dhp.OK == this.m;
    }

    public final dhs b() {
        return new dhs(this);
    }

    public final dhr c() {
        return new dhr(this);
    }

    public final String toString() {
        return buf.C((Object) this).a("code", this.m.name()).a("description", this.n).a("cause", this.o).toString();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    static {
        TreeMap treeMap = new TreeMap();
        for (dhp dhp : dhp.values()) {
            dhn dhn = (dhn) treeMap.put(Integer.valueOf(dhp.r), new dhn(dhp));
            if (dhn != null) {
                String valueOf = String.valueOf(dhn.m.name());
                String valueOf2 = String.valueOf(dhp.name());
                throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(valueOf2).length()).append("Code value duplication between ").append(valueOf).append(" & ").append(valueOf2).toString());
            }
        }
        a = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        b = dhp.OK.a();
        c = dhp.CANCELLED.a();
        d = dhp.UNKNOWN.a();
        dhp.INVALID_ARGUMENT.a();
        e = dhp.DEADLINE_EXCEEDED.a();
        dhp.NOT_FOUND.a();
        dhp.ALREADY_EXISTS.a();
        f = dhp.PERMISSION_DENIED.a();
        g = dhp.UNAUTHENTICATED.a();
        h = dhp.RESOURCE_EXHAUSTED.a();
        dhp.FAILED_PRECONDITION.a();
        dhp.ABORTED.a();
        dhp.OUT_OF_RANGE.a();
        dhp.UNIMPLEMENTED.a();
        i = dhp.INTERNAL.a();
        j = dhp.UNAVAILABLE.a();
        dhp.DATA_LOSS.a();
        k = dha.a("grpc-status", new dhq());
        p = new dho();
        l = dha.a("grpc-message", p);
    }
}
