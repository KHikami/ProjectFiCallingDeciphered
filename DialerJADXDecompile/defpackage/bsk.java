package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: bsk */
final class bsk extends bso {
    private final ArrayList a;
    private /* synthetic */ bsf b;

    public bsk(bsf bsf, ArrayList arrayList) {
        this.b = bsf;
        super(bsf);
        this.a = arrayList;
    }

    public final void a() {
        Set emptySet;
        bsq bsq = this.b.a.m;
        bsf bsf = this.b;
        if (bsf.k == null) {
            emptySet = Collections.emptySet();
        } else {
            Set hashSet = new HashSet(bsf.k.b);
            Map map = bsf.k.d;
            for (bqy bqy : map.keySet()) {
                if (!bsf.a.g.containsKey(bqy.b())) {
                    map.get(bqy);
                    hashSet.addAll(null);
                }
            }
            emptySet = hashSet;
        }
        bsq.d = emptySet;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bra) it.next()).a(this.b.h, this.b.a.m.d);
        }
    }
}
