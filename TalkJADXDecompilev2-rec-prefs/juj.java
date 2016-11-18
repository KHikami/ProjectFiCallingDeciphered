package p000;

import android.content.Context;
import android.util.Log;
import java.util.List;

public final class juj implements jum {
    private final Context f21068a;
    private jux[] f21069b;

    public juj(Context context) {
        this.f21068a = context;
    }

    public void mo3608a(juo juo) {
        String str;
        if (this.f21069b == null) {
            m25227a();
        }
        for (jux jux : this.f21069b) {
            Context context = juo.f5760g;
            juo = jux.m25271a();
        }
        juo.f5763j = juo.f5761h.m25297f();
        if (Log.isLoggable("HttpOperation", 3)) {
            str = "Starting op: ";
            String valueOf = String.valueOf(juo.mo1037k());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (juo.f5761h.m25296e()) {
            juo.f5767n = 2;
        }
        if (juo.f5763j != null) {
            juo.f5763j.m25257a(juo.mo1036j(), juo.m8074l());
        }
        juo.m8077o();
        juo.m8078p();
        if (juo.f5763j != null) {
            juo.f5763j.m25258a(juo.f5769p);
            juo.f5769p.m25286i();
            juo.f5763j.m25261d();
            juo.m8080r();
            if (juo.f5761h.m25297f() == null) {
                juo.f5763j.m25256a("HttpOperation", "");
            }
        }
        if (juo.m8076n() && Log.isLoggable("HttpOperation", 4)) {
            str = String.valueOf(juo.mo1036j());
            int i = juo.f5764k;
            String valueOf2 = String.valueOf(juo.f5766m);
            new StringBuilder((String.valueOf(str).length() + 36) + String.valueOf(valueOf2).length()).append("[").append(str).append("] failed due to error: ").append(i).append(" ").append(valueOf2);
        }
    }

    private synchronized void m25227a() {
        List c = jyn.m25438c(this.f21068a, jux.class);
        this.f21069b = (jux[]) c.toArray(new jux[c.size()]);
    }
}
