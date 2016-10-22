package defpackage;

/* renamed from: ewy */
public final class ewy extends evz {
    private static final long serialVersionUID = 1;

    ewy(lqz lqz) {
        super(lqz, lqz.responseHeader, -1);
        if (evz.a) {
            String valueOf = String.valueOf(lqz);
            new StringBuilder(String.valueOf(valueOf).length() + 37).append("FinishPhoneVerificationResponse from:").append(valueOf);
        }
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        fde.b(true);
        eps eps = (eps) jyn.b(gwb.H(), eps.class);
        if (eps != null) {
            eps.a(104, false);
        }
    }
}
