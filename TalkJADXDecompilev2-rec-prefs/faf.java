package p000;

public final class faf extends evz {
    private static final long serialVersionUID = 1;

    private faf(lvx lvx) {
        super(lvx, lvx.responseHeader, gwb.m1523a(lvx.f26627a));
        if (evz.f5798a) {
            String valueOf = String.valueOf(lvx);
            new StringBuilder(String.valueOf(valueOf).length() + 23).append("SetTypingResponse from:").append(valueOf);
        }
    }

    public static evz m14842a(lvx lvx) {
        if (evz.m8120a(lvx.responseHeader)) {
            return new ewv((nzf) lvx, lvx.responseHeader);
        }
        return new faf(lvx);
    }
}
