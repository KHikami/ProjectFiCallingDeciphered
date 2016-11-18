package p000;

import android.content.Context;

public final class ezo extends evz {
    private static final long serialVersionUID = 1;
    public final boolean f12558g;

    ezo(lvd lvd) {
        super(lvd, lvd.responseHeader, -1);
        if (lvd.f26578a == null || gwb.m1507a(lvd.f26578a) != 1) {
            this.f12558g = false;
        } else {
            this.f12558g = true;
        }
    }

    public void mo1958a(Context context, bko bko) {
        if (this.f12558g) {
            glk.m17981d("Babel", "Client is invalid. Retry registration", new Object[0]);
            ((fnc) jyn.m25426a(context, fnc.class)).mo2044a(bko.m5638g());
        } else if (evz.f5798a) {
            String str = "SetActiveClientPeriodicTask successful: ";
            String valueOf = String.valueOf(bko.m5629a());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
    }
}
