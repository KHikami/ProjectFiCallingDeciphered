final class mec extends mdz {
    static final mdz o;

    private mec() {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    static {
        o = new mec();
    }

    public boolean b(char c) {
        switch (c) {
            case wi.n /*9*/:
            case wi.dr /*10*/:
            case wi.dB /*11*/:
            case wi.dM /*12*/:
            case wi.dD /*13*/:
            case ' ':
            case '\u0085':
            case '\u1680':
            case '\u2028':
            case '\u2029':
            case '\u205f':
            case '\u3000':
                return true;
            case '\u2007':
                return false;
            default:
                if (c < '\u2000' || c > '\u200a') {
                    return false;
                }
                return true;
        }
    }

    public String toString() {
        return "CharMatcher.breakingWhitespace()";
    }
}
