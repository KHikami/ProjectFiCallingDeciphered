package defpackage;

/* renamed from: eyn */
public final class eyn extends evz {
    private static final long serialVersionUID = 1;

    eyn(lvk lvk) {
        super(lvk, lvk.responseHeader, gwb.a(lvk.a));
        if (evz.a) {
            String valueOf = String.valueOf(lvk);
            new StringBuilder(String.valueOf(valueOf).length() + 31).append("NotificationLevelResponse from:").append(valueOf);
        }
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        boolean z = blf.a;
        if (this.c.b != 1) {
            glk.d("Babel", "Failed to set conversation preference with code " + this.c.b, new Object[0]);
        }
    }
}
