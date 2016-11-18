package p000;

import java.util.Comparator;

final class mld extends mkc {
    private static final long serialVersionUID = 0;
    private final Comparator<Object> f27878a;

    mld(mkz<?, ?> mkz___) {
        super(mkz___);
        this.f27878a = mkz___.comparator();
    }

    Object readResolve() {
        return m32348a(new mlc(this.f27878a));
    }
}
