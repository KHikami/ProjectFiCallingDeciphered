package defpackage;

final class meh extends mdz {
    static final meh o = new meh();

    private meh() {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    public boolean b(char c) {
        return Character.isDigit(c);
    }

    public String toString() {
        return "CharMatcher.javaDigit()";
    }
}
