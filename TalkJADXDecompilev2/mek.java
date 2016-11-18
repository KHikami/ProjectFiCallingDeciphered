package defpackage;

final class mek extends mdz {
    static final mek o = new mek();

    private mek() {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    public boolean b(char c) {
        return Character.isLetterOrDigit(c);
    }

    public String toString() {
        return "CharMatcher.javaLetterOrDigit()";
    }
}
