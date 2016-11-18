package defpackage;

final class mec extends mdz {
    static final mdz o = new mec();

    private mec() {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    public boolean b(char c) {
        switch (c) {
            case '\t':
            case '\n':
            case '\u000b':
            case '\f':
            case '\r':
            case ' ':
            case '':
            case ' ':
            case ' ':
            case ' ':
            case ' ':
            case '　':
                return true;
            case ' ':
                return false;
            default:
                if (c < ' ' || c > ' ') {
                    return false;
                }
                return true;
        }
    }

    public String toString() {
        return "CharMatcher.breakingWhitespace()";
    }
}
