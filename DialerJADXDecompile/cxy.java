/* compiled from: PG */
final class cxy extends cxn {
    static final cxy a;

    private cxy() {
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    static {
        a = new cxy();
    }

    public final boolean b(char c) {
        return Character.isLetterOrDigit(c);
    }

    public final String toString() {
        return "CharMatcher.javaLetterOrDigit()";
    }
}
