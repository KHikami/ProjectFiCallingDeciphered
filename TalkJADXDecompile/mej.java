final class mej extends mdz {
    static final mej o;

    private mej() {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    static {
        o = new mej();
    }

    public boolean b(char c) {
        return Character.isLetter(c);
    }

    public String toString() {
        return "CharMatcher.javaLetter()";
    }
}
