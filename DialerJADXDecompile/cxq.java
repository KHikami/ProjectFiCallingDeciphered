/* compiled from: PG */
final class cxq extends cxn {
    static final cxn a;

    private cxq() {
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return super.a((Character) obj);
    }

    static {
        a = new cxq();
    }

    public final boolean b(char c) {
        switch (c) {
            case rl.l /*9*/:
            case rl.m /*10*/:
            case rl.n /*11*/:
            case rl.k /*12*/:
            case rk.i /*13*/:
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

    public final String toString() {
        return "CharMatcher.breakingWhitespace()";
    }
}
