package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

final class lju implements ljt {
    private static final UUID f25110d = UUID.randomUUID();
    final Executor f25111a;
    final onc<Set<ljs>> f25112b;
    final ConcurrentMap<UUID, List<ogu>> f25113c = new ConcurrentHashMap(2, 0.75f, 1);
    private final lgy f25114e;
    private final jhx f25115f;

    lju(lgy lgy, jhx jhx, Executor executor, onc<Set<ljs>> onc_java_util_Set_ljs) {
        this.f25114e = lgy;
        this.f25115f = jhx;
        this.f25111a = executor;
        this.f25112b = onc_java_util_Set_ljs;
    }

    public void mo3719a(String str, ljm ljm) {
        ljo a = lkb.m29204a();
        if (a != null) {
            lkb.m29213d(a);
        }
        UUID randomUUID = UUID.randomUUID();
        nwk a2 = ogu.o().a(lkb.f25135b.getAndIncrement()).c(0).b(randomUUID.getLeastSignificantBits()).a((double) this.f25115f.mo3524a()).a(str);
        a = new ljh(randomUUID, this, this.f25115f, a2, ljm);
        Object arrayList = new ArrayList();
        arrayList.add((ogu) a2.f());
        this.f25113c.put(randomUUID, Collections.synchronizedList(arrayList));
        lkb.m29211b(a);
        mti a3 = this.f25114e.m29060a(a);
        a3.mo3706a(new ljv(this, randomUUID, arrayList, a3), this.f25111a);
    }

    public void mo3720a(UUID uuid, ogu ogu) {
        if (!f25110d.equals(uuid)) {
            bm.m6150b(((List) this.f25113c.get(uuid)).add(ogu));
        }
    }
}
