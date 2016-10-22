package defpackage;

import java.util.List;

/* renamed from: ceq */
final class ceq implements chy {
    final /* synthetic */ cdr a;

    ceq(cdr cdr) {
        this.a = cdr;
    }

    public void a() {
        boolean z = true;
        cdr cdr = this.a;
        if (cdr.as) {
            cdr.ax.a(cdr.av.g()).b().c(3317);
            cdr.as = false;
        }
        if (cdr.bm.a(cdr.getChildFragmentManager())) {
            Object obj;
            cdr.b.b("sendMessageUiLatency");
            if (cdr.aV.j() && cdr.i.l().size() > 0) {
                gwb.a(cdr.av, 2324);
            }
            cdr.aV.k();
            List l = cdr.i.l();
            mjq mjq = (mjq) l;
            int size = mjq.size();
            int i = 0;
            while (i < size) {
                obj = mjq.get(i);
                i++;
                ba.a(cdr.av.g(), glj.b(), 11, ba.c().b(((bxn) obj).e).a(3));
            }
            boolean z2 = cdr.i.a() != null;
            mjq = (mjq) l;
            int size2 = mjq.size();
            size = 0;
            while (size < size2) {
                obj = mjq.get(size);
                size++;
                bxn bxn = (bxn) obj;
                if (!z2) {
                    if (ba.i(bxn.a)) {
                    }
                }
                new cio(cdr.context, l, cdr).execute(new Void[0]);
                break;
            }
            z = z2;
            if (z) {
                cdr.ad();
            } else if (cdr.b(l)) {
                cdr.ad();
            }
            cdr.i.m();
        }
    }
}
