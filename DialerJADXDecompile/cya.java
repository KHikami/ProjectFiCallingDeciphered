/* compiled from: PG */
final class cya extends cxn {
    static final cya a;

    private cya() {
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    static {
        a = new cya();
    }

    public final boolean b(char c) {
        return Character.isUpperCase(c);
    }

    public final String toString() {
        return "CharMatcher.javaUpperCase()";
    }
}
