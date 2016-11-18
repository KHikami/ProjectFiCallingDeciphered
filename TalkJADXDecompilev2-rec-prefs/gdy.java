package p000;

import android.content.Context;
import android.os.Build.VERSION;

final class gdy implements bbn {
    private Context f14807a;

    public gdy(Context context) {
        this.f14807a = context;
    }

    public boolean mo2199a(String str) {
        if (VERSION.SDK_INT < 22) {
            return false;
        }
        int b = ((jcf) jyn.m25426a(this.f14807a, jcf.class)).mo3461b(str);
        if (b == -1) {
            return false;
        }
        if (((bbm) jyn.m25426a(this.f14807a, bbm.class)).mo446f(b)) {
            return gdy.m17095a(b, glq.m18025f(this.f14807a));
        }
        return false;
    }

    public int mo2198a() {
        bbm bbm = (bbm) jyn.m25426a(this.f14807a, bbm.class);
        String f = glq.m18025f(this.f14807a);
        if (f == null) {
            return -1;
        }
        for (int i : fde.m15020e()) {
            if (bbm.mo446f(i) && gdy.m17095a(i, f)) {
                return i;
            }
        }
        return -1;
    }

    public boolean mo2200b() {
        return mo2198a() != -1;
    }

    private static boolean m17095a(int i, String str) {
        String u = fde.m15018e(i).m5652u();
        u = u != null ? gwb.m2250i(gwb.m1400H(), u) : null;
        return u != null && u.equals(str);
    }
}
