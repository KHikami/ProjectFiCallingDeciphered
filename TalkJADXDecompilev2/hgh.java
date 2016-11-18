package defpackage;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class hgh {
    private final Set<hge<?>> a = Collections.newSetFromMap(new WeakHashMap());

    public <L> hge<L> a(L l, Looper looper) {
        gwb.f((Object) l, (Object) "Listener must not be null");
        gwb.f((Object) looper, (Object) "Looper must not be null");
        hge<L> hge = new hge(looper, l);
        this.a.add(hge);
        return hge;
    }

    public void a() {
        for (hge a : this.a) {
            a.a();
        }
        this.a.clear();
    }
}
