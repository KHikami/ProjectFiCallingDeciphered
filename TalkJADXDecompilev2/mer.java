package defpackage;

final class mer extends men {
    static final int o = Integer.numberOfLeadingZeros(31);
    static final mer p = new mer();

    mer() {
        super("CharMatcher.whitespace()");
    }

    public boolean b(char c) {
        return " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((1682554634 * c) >>> o) == c;
    }
}
