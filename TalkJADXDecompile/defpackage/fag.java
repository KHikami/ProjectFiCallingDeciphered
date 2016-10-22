package defpackage;

/* renamed from: fag */
public final class fag extends evz {
    private static final long serialVersionUID = 1;
    private final boolean g;

    fag(lwc lwc) {
        super(lwc, lwc.responseHeader, -1);
        this.g = gwb.b(lwc.b);
        if (evz.a) {
            String valueOf = String.valueOf(lwc);
            new StringBuilder(String.valueOf(valueOf).length() + 36).append("StartPhoneVerificationResponse from:").append(valueOf);
        }
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        if (this.g) {
            glk.a("Babel", "Rate limit exceeded for phone verification", new Object[0]);
            eps eps = (eps) jyn.b(gwb.H(), eps.class);
            if (eps != null) {
                eps.a(105, true);
            }
        }
    }
}
