package p000;

import android.content.Context;

public abstract class euc extends esw {
    private static final long serialVersionUID = 1;

    protected fom mo1949j() {
        return fom.MESI_API;
    }

    public static off m14534a(boolean z) {
        int i;
        off off = new off();
        if (z) {
            i = 408;
        } else {
            i = 407;
        }
        off.f28728b = Integer.valueOf(i);
        off.f28729c = Integer.valueOf(2);
        if (gwb.az(gwb.m1400H())) {
            i = 3;
        } else {
            i = 2;
        }
        off.f28727a = Integer.valueOf(i);
        return off;
    }

    protected String mo1953c(Context context) {
        return gwb.m1998b(context, "babel_room_server_apiary_trace_token", fls.f13429f);
    }
}
