package defpackage;

/* compiled from: PG */
/* renamed from: cxz */
final class cxz extends cxn {
    static final cxz a;

    private cxz() {
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    static {
        a = new cxz();
    }

    public final boolean b(char c) {
        return Character.isLowerCase(c);
    }

    public final String toString() {
        return "CharMatcher.javaLowerCase()";
    }
}
