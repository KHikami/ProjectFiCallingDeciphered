import android.content.Context;

public final class ezo extends evz {
    private static final long serialVersionUID = 1;
    public final boolean g;

    ezo(lvd lvd) {
        super(lvd, lvd.responseHeader, -1);
        if (lvd.a == null || gwb.a(lvd.a) != 1) {
            this.g = false;
        } else {
            this.g = true;
        }
    }

    public void a(Context context, bko bko) {
        if (this.g) {
            glk.d("Babel", "Client is invalid. Retry registration", new Object[0]);
            ((fnc) jyn.a(context, fnc.class)).a(bko.g());
        } else if (evz.a) {
            String str = "SetActiveClientPeriodicTask successful: ";
            String valueOf = String.valueOf(bko.a());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
    }
}
