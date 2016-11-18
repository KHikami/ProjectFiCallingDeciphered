package p000;

import java.util.Locale;

public final class mpl extends mon {
    private static final mon f28048a = new mpl(mop.INLINE);
    private static final mon f28049b = new mpl(mop.REWRITE);
    private static final mon f28050c = new mpl(mop.THROW);

    public static mon m32660a(mop mop) {
        switch (mpm.f28051a[mop.ordinal()]) {
            case 1:
                return f28048a;
            case 2:
                return f28049b;
            case 3:
                return f28050c;
            default:
                throw new AssertionError();
        }
    }

    private mpl(mop mop) {
        super(mop);
    }

    protected String mo3909a(String str, Object obj) {
        return String.format(Locale.US, str, new Object[]{obj});
    }
}
