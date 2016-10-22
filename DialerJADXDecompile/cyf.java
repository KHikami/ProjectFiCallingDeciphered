/* compiled from: PG */
final class cyf extends cyb {
    static final cyf a;
    private static int b;

    static {
        b = Integer.numberOfLeadingZeros(31);
        a = new cyf();
    }

    cyf() {
        super("CharMatcher.whitespace()");
    }

    public final boolean b(char c) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001\u202f\u00a0\f\u2009\u3000\u2004\u3000\u3000\u2028\n\u2007\u3000".charAt((1682554634 * c) >>> b) == c;
    }
}
