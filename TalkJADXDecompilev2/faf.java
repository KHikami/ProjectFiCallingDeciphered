package defpackage;

public final class faf extends evz {
    private static final long serialVersionUID = 1;

    private faf(lvx lvx) {
        super(lvx, lvx.responseHeader, gwb.a(lvx.a));
        if (evz.a) {
            String valueOf = String.valueOf(lvx);
            new StringBuilder(String.valueOf(valueOf).length() + 23).append("SetTypingResponse from:").append(valueOf);
        }
    }

    public static evz a(lvx lvx) {
        if (evz.a(lvx.responseHeader)) {
            return new ewv((nzf) lvx, lvx.responseHeader);
        }
        return new faf(lvx);
    }
}
