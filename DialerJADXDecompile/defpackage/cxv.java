package defpackage;

/* compiled from: PG */
/* renamed from: cxv */
final class cxv extends cxn {
    static final cxv a;

    private cxv() {
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    static {
        a = new cxv();
    }

    public final boolean b(char c) {
        return Character.isDigit(c);
    }

    public final String toString() {
        return "CharMatcher.javaDigit()";
    }
}
