package defpackage;

import java.util.Comparator;

/* renamed from: mld */
final class mld extends mkc {
    private static final long serialVersionUID = 0;
    private final Comparator<Object> a;

    mld(mkz<?, ?> mkz___) {
        super(mkz___);
        this.a = mkz___.comparator();
    }

    Object readResolve() {
        return a(new mlc(this.a));
    }
}
