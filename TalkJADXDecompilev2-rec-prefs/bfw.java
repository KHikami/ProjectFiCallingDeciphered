package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

final class bfw implements bep {
    private final Context f3236a;

    bfw(Context context) {
        this.f3236a = context;
    }

    public ery mo497a() {
        return bfr.m5078a(true, glq.m18025f(this.f3236a));
    }

    public boolean mo498a(Context context) {
        int a = ((jca) jyn.m25426a(context, jca.class)).mo2317a();
        if (a == -1) {
            return false;
        }
        if (gwb.m2183e(context, a) || !gwb.m1891a(a, glq.m18025f(context))) {
            return false;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && !gwb.m2151d(context) && gwb.m2222g(context, a);
    }

    public int mo499b() {
        return gwb.iU;
    }
}
