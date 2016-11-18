package p000;

public final class eyn extends evz {
    private static final long serialVersionUID = 1;

    eyn(lvk lvk) {
        super(lvk, lvk.responseHeader, gwb.m1523a(lvk.f26595a));
        if (evz.f5798a) {
            String valueOf = String.valueOf(lvk);
            new StringBuilder(String.valueOf(valueOf).length() + 31).append("NotificationLevelResponse from:").append(valueOf);
        }
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        boolean z = blf.f3692a;
        if (this.c.f12529b != 1) {
            glk.m17981d("Babel", "Failed to set conversation preference with code " + this.c.f12529b, new Object[0]);
        }
    }
}
