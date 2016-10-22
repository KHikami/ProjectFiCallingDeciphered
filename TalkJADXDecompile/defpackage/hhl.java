package defpackage;

import android.content.Context;

/* renamed from: hhl */
final class hhl implements hhq {
    hhl() {
    }

    public hhs a(Context context, String str, hhr hhr) {
        hhs hhs = new hhs();
        hhs.a = hhr.a(context, str);
        hhs.b = hhr.a(context, str, true);
        if (hhs.a == 0 && hhs.b == 0) {
            hhs.c = 0;
        } else if (hhs.a >= hhs.b) {
            hhs.c = -1;
        } else {
            hhs.c = 1;
        }
        return hhs;
    }
}
