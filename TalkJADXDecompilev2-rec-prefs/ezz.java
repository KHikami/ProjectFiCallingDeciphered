package p000;

public final class ezz extends evz {
    private static final long serialVersionUID = 1;

    private ezz(lvs lvs) {
        super(lvs, lvs.responseHeader, 0);
        if (evz.f5798a) {
            String valueOf = String.valueOf(lvs);
            new StringBuilder(String.valueOf(valueOf).length() + 31).append("SetInCallPresenceResponse from:").append(valueOf);
        }
    }

    public static evz m14831a(lvs lvs) {
        if (evz.m8120a(lvs.responseHeader)) {
            return new ewv((nzf) lvs, lvs.responseHeader);
        }
        return new ezz(lvs);
    }
}
