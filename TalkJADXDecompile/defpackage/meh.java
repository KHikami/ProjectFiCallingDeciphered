package defpackage;

/* renamed from: meh */
final class meh extends mdz {
    static final meh o;

    private meh() {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    static {
        o = new meh();
    }

    public boolean b(char c) {
        return Character.isDigit(c);
    }

    public String toString() {
        return "CharMatcher.javaDigit()";
    }
}
