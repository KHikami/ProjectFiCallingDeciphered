/* compiled from: PG */
final class cxw extends cyb {
    static final cxw a;

    static {
        a = new cxw();
    }

    private cxw() {
        super("CharMatcher.javaIsoControl()");
    }

    public final boolean b(char c) {
        return c <= '\u001f' || (c >= '\u007f' && c <= '\u009f');
    }
}
