package defpackage;

/* compiled from: PG */
/* renamed from: dfx */
public final class dfx {
    private final String a;
    private final Object b;

    dfx(String str) {
        this(str, null);
    }

    private dfx(String str, Object obj) {
        this.a = (String) cob.i((Object) str);
        this.b = null;
    }

    public final String toString() {
        return this.a;
    }

    public final Object a(dfr dfr) {
        Object a = dfr.a(this);
        return a == null ? this.b : a;
    }
}
