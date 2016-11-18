package defpackage;

import android.os.Build.VERSION;
import android.view.LayoutInflater;

public final class mq {
    public static final mr a;

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            a = new mt();
        } else if (i >= 11) {
            a = new ms();
        } else {
            a = new mr();
        }
    }

    public static void a(LayoutInflater layoutInflater, mw mwVar) {
        a.a(layoutInflater, mwVar);
    }
}
