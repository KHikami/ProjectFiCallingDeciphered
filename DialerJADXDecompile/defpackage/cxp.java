package defpackage;

/* compiled from: PG */
/* renamed from: cxp */
public final class cxp extends cyb {
    public static final cxp a;

    static {
        a = new cxp();
    }

    cxp() {
        super("CharMatcher.ascii()");
    }

    public final boolean b(char c) {
        return c <= '\u007f';
    }
}
