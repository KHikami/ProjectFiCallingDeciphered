package defpackage;

import java.util.Locale;

/* renamed from: mpl */
public final class mpl extends mon {
    private static final mon a;
    private static final mon b;
    private static final mon c;

    static {
        a = new mpl(mop.INLINE);
        b = new mpl(mop.REWRITE);
        c = new mpl(mop.THROW);
    }

    public static mon a(mop mop) {
        switch (mpm.a[mop.ordinal()]) {
            case wi.j /*1*/:
                return a;
            case wi.l /*2*/:
                return b;
            case wi.z /*3*/:
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
