package defpackage;

final class mel extends mdz {
    static final mel o = new mel();

    private mel() {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    public boolean b(char c) {
        return Character.isLowerCase(c);
    }

    public String toString() {
        return "CharMatcher.javaLowerCase()";
    }
}
