package p000;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class hgh {
    private final Set<hge<?>> f16903a = Collections.newSetFromMap(new WeakHashMap());

    public <L> hge<L> m19733a(L l, Looper looper) {
        gwb.m2195f((Object) l, (Object) "Listener must not be null");
        gwb.m2195f((Object) looper, (Object) "Looper must not be null");
        hge<L> hge = new hge(looper, l);
        this.f16903a.add(hge);
        return hge;
    }

    public void m19734a() {
        for (hge a : this.f16903a) {
            a.m19728a();
        }
        this.f16903a.clear();
    }
}
