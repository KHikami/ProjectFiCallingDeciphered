final class mel extends mdz {
    static final mel o;

    private mel() {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    static {
        o = new mel();
    }

    public boolean b(char c) {
        return Character.isLowerCase(c);
    }

    public String toString() {
        return "CharMatcher.javaLowerCase()";
    }
}
