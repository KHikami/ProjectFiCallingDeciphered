package defpackage;

import android.content.Context;
import android.os.Build.VERSION;

final class gdy implements bbn {
    private Context a;

    public gdy(Context context) {
        this.a = context;
    }

    public boolean a(String str) {
        if (VERSION.SDK_INT < 22) {
            return false;
        }
        int b = ((jcf) jyn.a(this.a, jcf.class)).b(str);
        if (b == -1) {
            return false;
        }
        if (((bbm) jyn.a(this.a, bbm.class)).f(b)) {
            return gdy.a(b, glq.f(this.a));
        }
        return false;
    }

    public int a() {
        bbm bbm = (bbm) jyn.a(this.a, bbm.class);
        String f = glq.f(this.a);
        if (f == null) {
            return -1;
        }
        for (int i : fde.e()) {
            if (bbm.f(i) && gdy.a(i, f)) {
                return i;
            }
        }
        return -1;
    }

    public boolean b() {
        return a() != -1;
    }

    private static boolean a(int i, String str) {
        String u = fde.e(i).u();
        u = u != null ? gwb.i(gwb.H(), u) : null;
        return u != null && u.equals(str);
    }
}
