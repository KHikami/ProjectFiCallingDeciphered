package p000;

import android.os.Build.VERSION;
import android.view.LayoutInflater;

public final class mq {
    public static final mr f28100a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f28100a = new mt();
        } else if (i >= 11) {
            f28100a = new ms();
        } else {
            f28100a = new mr();
        }
    }

    public static void m32683a(LayoutInflater layoutInflater, mw mwVar) {
        f28100a.mo3931a(layoutInflater, mwVar);
    }
}
