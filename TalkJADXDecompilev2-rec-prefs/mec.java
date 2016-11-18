package p000;

final class mec extends mdz {
    static final mdz f27569o = new mec();

    private mec() {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ boolean mo3735a(Object obj) {
        return super.m31929a((Character) obj);
    }

    public boolean mo3738b(char c) {
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
