/* compiled from: PG */
final class cxx extends cxn {
    static final cxx a;

    private cxx() {
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    static {
        a = new cxx();
    }

    public final boolean b(char c) {
        return Character.isLetter(c);
    }

    public final String toString() {
        return "CharMatcher.javaLetter()";
    }
}
