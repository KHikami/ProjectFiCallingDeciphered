package defpackage;

/* renamed from: mem */
final class mem extends mdz {
    static final mem o;

    private mem() {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    static {
        o = new mem();
    }

    public boolean b(char c) {
        return Character.isUpperCase(c);
    }

    public String toString() {
        return "CharMatcher.javaUpperCase()";
    }
}
