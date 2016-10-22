package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: bfw */
final class bfw implements bep {
    private final Context a;

    bfw(Context context) {
        this.a = context;
    }

    public ery a() {
        return bfr.a(true, glq.f(this.a));
    }

    public boolean a(Context context) {
        int a = ((jca) jyn.a(context, jca.class)).a();
        if (a == -1) {
            return false;
        }
        if (gwb.e(context, a) || !gwb.a(a, glq.f(context))) {
            return false;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && !gwb.d(context) && gwb.g(context, a);
    }

    public int b() {
        return gwb.iU;
    }
}
