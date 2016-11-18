package p000;

final class mer extends men {
    static final int f27584o = Integer.numberOfLeadingZeros(31);
    static final mer f27585p = new mer();

    mer() {
        super("CharMatcher.whitespace()");
    }

    public boolean mo3738b(char c) {
        return " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((1682554634 * c) >>> f27584o) == c;
    }
}
