package defpackage;

/* renamed from: meb */
public final class meb extends men {
    public static final meb o;

    static {
        o = new meb();
    }

    meb() {
        super("CharMatcher.ascii()");
    }

    public boolean b(char c) {
        return c <= '\u007f';
    }
}
