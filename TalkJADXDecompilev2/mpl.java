package defpackage;

import java.util.Locale;

public final class mpl extends mon {
    private static final mon a = new mpl(mop.INLINE);
    private static final mon b = new mpl(mop.REWRITE);
    private static final mon c = new mpl(mop.THROW);

    public static mon a(mop mop) {
        switch (mpm.a[mop.ordinal()]) {
            case 1:
                return a;
            case 2:
                return b;
            case 3:
                return c;
            default:
                throw new AssertionError();
        }
    }

    private mpl(mop mop) {
        super(mop);
    }

    protected String a(String str, Object obj) {
        return String.format(Locale.US, str, new Object[]{obj});
    }
}
