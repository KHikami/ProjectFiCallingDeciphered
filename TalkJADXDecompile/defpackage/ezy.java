package defpackage;

/* renamed from: ezy */
public final class ezy extends evz {
    private static final long serialVersionUID = 1;

    private ezy(lvo lvo) {
        super(lvo, lvo.responseHeader, gwb.a(lvo.a));
    }

    public static evz a(lvo lvo) {
        if (evz.a(lvo.responseHeader)) {
            return new ewv((nzf) lvo, lvo.responseHeader);
        }
        return new ezy(lvo);
    }
}
