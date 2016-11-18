package p000;

import android.util.Log;
import java.util.Map;

final class jkr extends ld<jtw, jkj> {
    final /* synthetic */ jkp f20378a;

    jkr(jkp jkp, int i) {
        this.f20378a = jkp;
        super(i);
    }

    protected /* bridge */ /* synthetic */ void mo189a(boolean z, Object obj, Object obj2, Object obj3) {
        m24611a(z, (jtw) obj, (jkj) obj2);
    }

    protected /* synthetic */ int mo3556b(Object obj, Object obj2) {
        return ((jkj) obj2).m24272j();
    }

    private void m24611a(boolean z, jtw jtw, jkj jkj) {
        if (z) {
            if (jkj.m24250p()) {
                String valueOf = String.valueOf(jtw);
                new StringBuilder(String.valueOf(valueOf).length() + 26).append("Evicted image from cache: ").append(valueOf);
                if (Log.isLoggable("ImageResourceManager", 2)) {
                    Map g = m1212g();
                    for (jtw jtw2 : g.keySet()) {
                        String valueOf2 = String.valueOf(jtw2);
                        new StringBuilder(String.valueOf(valueOf2).length() + 26).append("   id: ").append(valueOf2).append("; size: ").append(((jkj) g.get(jtw2)).m24272j());
                    }
                }
            }
            jkj.mo3520i();
        }
    }
}
