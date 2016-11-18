package p000;

import android.content.Context;

final class hhl implements hhq {
    hhl() {
    }

    public hhs mo2544a(Context context, String str, hhr hhr) {
        hhs hhs = new hhs();
        hhs.f16979a = hhr.mo2542a(context, str);
        hhs.f16980b = hhr.mo2543a(context, str, true);
        if (hhs.f16979a == 0 && hhs.f16980b == 0) {
            hhs.f16981c = 0;
        } else if (hhs.f16979a >= hhs.f16980b) {
            hhs.f16981c = -1;
        } else {
            hhs.f16981c = 1;
        }
        return hhs;
    }
}
