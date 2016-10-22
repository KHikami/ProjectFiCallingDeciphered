package defpackage;

import java.util.List;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: dkn */
public final class dkn extends dgk {
    private /* synthetic */ dfj b;

    public dkn(dfj dfj, dfh dfh) {
        this.b = dfj;
        super(dfh);
    }

    public final void a(dfi dfi, dgr dgr) {
        Object obj = this.b.a;
        cob.i(obj);
        for (Entry entry : obj.b.entrySet()) {
            for (int i = 0; i < ((List) entry.getValue()).size(); i++) {
                dgr.a((String) entry.getKey(), new dhb((dhb) ((List) entry.getValue()).get(i)));
            }
        }
        super.a(dfi, dgr);
    }
}
