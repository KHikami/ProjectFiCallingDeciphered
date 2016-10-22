final class mek extends mdz {
    static final mek o;

    private mek() {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    static {
        o = new mek();
    }

    public boolean b(char c) {
        return Character.isLetterOrDigit(c);
    }

    public String toString() {
        return "CharMatcher.javaLetterOrDigit()";
    }
}
