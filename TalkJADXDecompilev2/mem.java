package defpackage;

final class mem extends mdz {
    static final mem o = new mem();

    private mem() {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    public boolean b(char c) {
        return Character.isUpperCase(c);
    }

    public String toString() {
        return "CharMatcher.javaUpperCase()";
    }
}
