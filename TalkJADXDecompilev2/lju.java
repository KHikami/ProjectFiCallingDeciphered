package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

final class lju implements ljt {
    private static final UUID d = UUID.randomUUID();
    final Executor a;
    final onc<Set<ljs>> b;
    final ConcurrentMap<UUID, List<ogu>> c = new ConcurrentHashMap(2, 0.75f, 1);
    private final lgy e;
    private final jhx f;

    lju(lgy lgy, jhx jhx, Executor executor, onc<Set<ljs>> onc_java_util_Set_ljs) {
        this.e = lgy;
        this.f = jhx;
        this.a = executor;
        this.b = onc_java_util_Set_ljs;
    }

    public void a(String str, ljm ljm) {
        ljo a = lkb.a();
        if (a != null) {
            lkb.d(a);
        }
        UUID randomUUID = UUID.randomUUID();
        nwk a2 = ogu.o().a(lkb.b.getAndIncrement()).c(0).b(randomUUID.getLeastSignificantBits()).a((double) this.f.a()).a(str);
        a = new ljh(randomUUID, this, this.f, a2, ljm);
        Object arrayList = new ArrayList();
        arrayList.add((ogu) a2.f());
        this.c.put(randomUUID, Collections.synchronizedList(arrayList));
        lkb.b(a);
        mti a3 = this.e.a(a);
        a3.a(new ljv(this, randomUUID, arrayList, a3), this.a);
    }

    public void a(UUID uuid, ogu ogu) {
        if (!d.equals(uuid)) {
            bm.b(((List) this.c.get(uuid)).add(ogu));
        }
    }
}
