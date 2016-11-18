package p000;

import android.content.Context;

final class hhk implements hhq {
    hhk() {
    }

    public hhs mo2544a(Context context, String str, hhr hhr) {
        hhs hhs = new hhs();
        hhs.f16979a = hhr.mo2542a(context, str);
        if (hhs.f16979a != 0) {
            hhs.f16981c = -1;
        } else {
            hhs.f16980b = hhr.mo2543a(context, str, true);
            if (hhs.f16980b != 0) {
                hhs.f16981c = 1;
            }
        }
        return hhs;
    }
}
