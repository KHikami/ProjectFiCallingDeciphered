package p000;

public final class fag extends evz {
    private static final long serialVersionUID = 1;
    private final boolean f12575g;

    fag(lwc lwc) {
        super(lwc, lwc.responseHeader, -1);
        this.f12575g = gwb.m2061b(lwc.f26636b);
        if (evz.f5798a) {
            String valueOf = String.valueOf(lwc);
            new StringBuilder(String.valueOf(valueOf).length() + 36).append("StartPhoneVerificationResponse from:").append(valueOf);
        }
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        if (this.f12575g) {
            glk.m17970a("Babel", "Rate limit exceeded for phone verification", new Object[0]);
            eps eps = (eps) jyn.m25433b(gwb.m1400H(), eps.class);
            if (eps != null) {
                eps.m14228a(105, true);
            }
        }
    }
}
