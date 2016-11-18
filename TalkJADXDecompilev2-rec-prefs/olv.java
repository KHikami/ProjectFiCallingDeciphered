package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public final class olv {
    static final List<olv> f28750a;
    public static final olv f28751b = olx.OK.m33509b();
    public static final olv f28752c = olx.CANCELLED.m33509b();
    public static final olv f28753d = olx.UNKNOWN.m33509b();
    public static final olv f28754e = olx.INVALID_ARGUMENT.m33509b();
    public static final olv f28755f = olx.DEADLINE_EXCEEDED.m33509b();
    public static final olv f28756g = olx.NOT_FOUND.m33509b();
    public static final olv f28757h = olx.ALREADY_EXISTS.m33509b();
    public static final olv f28758i = olx.PERMISSION_DENIED.m33509b();
    public static final olv f28759j = olx.UNAUTHENTICATED.m33509b();
    public static final olv f28760k = olx.RESOURCE_EXHAUSTED.m33509b();
    public static final olv f28761l = olx.FAILED_PRECONDITION.m33509b();
    public static final olv f28762m = olx.ABORTED.m33509b();
    public static final olv f28763n = olx.OUT_OF_RANGE.m33509b();
    public static final olv f28764o = olx.UNIMPLEMENTED.m33509b();
    public static final olv f28765p = olx.INTERNAL.m33509b();
    public static final olv f28766q = olx.UNAVAILABLE.m33509b();
    public static final olv f28767r = olx.DATA_LOSS.m33509b();
    public static final olf<olv> f28768s = olf.a("grpc-status", new oly());
    public static final olf<String> f28769t = olf.a("grpc-message", f28770u);
    private static final olc<String> f28770u = new olw();
    private final olx f28771v;
    private final String f28772w;
    private final Throwable f28773x;

    public static olv m33496a(int i) {
        if (i < 0 || i > f28750a.size()) {
            return f28753d.m33498a("Unknown code " + i);
        }
        return (olv) f28750a.get(i);
    }

    public static olv m33497a(Throwable th) {
        for (Throwable th2 = (Throwable) bm.m6123a((Object) th, (Object) "t"); th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof olz) {
                return ((olz) th2).a;
            }
            if (th2 instanceof oma) {
                return ((oma) th2).a;
            }
        }
        return f28753d.m33503b(th);
    }

    static String m33495a(olv olv) {
        if (olv.f28772w == null) {
            return olv.f28771v.toString();
        }
        String valueOf = String.valueOf(olv.f28771v);
        String str = olv.f28772w;
        return new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(str).length()).append(valueOf).append(": ").append(str).toString();
    }

    private olv(olx olx) {
        this(olx, null, null);
    }

    private olv(olx olx, String str, Throwable th) {
        this.f28771v = (olx) bm.m6123a((Object) olx, (Object) "code");
        this.f28772w = str;
        this.f28773x = th;
    }

    public olv m33503b(Throwable th) {
        return mez.m31976b(this.f28773x, th) ? this : new olv(this.f28771v, this.f28772w, th);
    }

    public olv m33498a(String str) {
        return mez.m31976b(this.f28772w, str) ? this : new olv(this.f28771v, str, this.f28773x);
    }

    public olv m33502b(String str) {
        if (str == null) {
            return this;
        }
        if (this.f28772w == null) {
            return new olv(this.f28771v, str, this.f28773x);
        }
        olx olx = this.f28771v;
        String str2 = this.f28772w;
        return new olv(olx, new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str).length()).append(str2).append("\n").append(str).toString(), this.f28773x);
    }

    public olx m33499a() {
        return this.f28771v;
    }

    public String m33501b() {
        return this.f28772w;
    }

    public Throwable m33504c() {
        return this.f28773x;
    }

    public boolean m33505d() {
        return olx.OK == this.f28771v;
    }

    public oma m33506e() {
        return new oma(this);
    }

    public oma m33500a(okw okw) {
        return new oma(this, okw);
    }

    public olz m33507f() {
        return new olz(this);
    }

    public String toString() {
        return gwb.m1436P((Object) this).m31974a("code", this.f28771v.name()).m31974a("description", this.f28772w).m31974a("cause", this.f28773x).toString();
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
            olv olv = (olv) treeMap.put(Integer.valueOf(olx.m33508a()), new olv(olx));
            if (olv != null) {
                String valueOf = String.valueOf(olv.m33499a().name());
                String valueOf2 = String.valueOf(olx.name());
                throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(valueOf2).length()).append("Code value duplication between ").append(valueOf).append(" & ").append(valueOf2).toString());
            }
        }
        f28750a = Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }
}
