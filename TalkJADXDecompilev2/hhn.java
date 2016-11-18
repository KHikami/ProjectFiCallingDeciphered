package defpackage;

import android.content.Context;

final class hhn implements hhq {
    hhn() {
    }

    public hhs a(Context context, String str, hhr hhr) {
        hhs hhs = new hhs();
        hhs.a = hhr.a(context, str);
        if (hhs.a != 0) {
            hhs.b = hhr.a(context, str, false);
        } else {
            hhs.b = hhr.a(context, str, true);
        }
        if (hhs.a == 0 && hhs.b == 0) {
            hhs.c = 0;
        } else if (hhs.b >= hhs.a) {
            hhs.c = 1;
        } else {
            hhs.c = -1;
        }
        return hhs;
    }
}
