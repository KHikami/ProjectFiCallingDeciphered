package defpackage;

final class mej extends mdz {
    static final mej o = new mej();

    private mej() {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    public boolean b(char c) {
        return Character.isLetter(c);
    }

    public String toString() {
        return "CharMatcher.javaLetter()";
    }
}
