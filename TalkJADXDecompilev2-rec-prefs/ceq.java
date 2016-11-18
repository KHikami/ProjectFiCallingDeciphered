package p000;

import java.util.List;

final class ceq implements chy {
    final /* synthetic */ cdr f5134a;

    ceq(cdr cdr) {
        this.f5134a = cdr;
    }

    public void mo898a() {
        boolean z = true;
        cdr cdr = this.f5134a;
        if (cdr.as) {
            cdr.ax.mo1979a(cdr.av.m5638g()).mo1693b().mo1714c(3317);
            cdr.as = false;
        }
        if (cdr.bm.m7689a(cdr.getChildFragmentManager())) {
            Object obj;
            cdr.f5099b.m18078b("sendMessageUiLatency");
            if (cdr.aV.m7271j() && cdr.f5106i.mo955l().size() > 0) {
                gwb.m1823a(cdr.av, 2324);
            }
            cdr.aV.m7272k();
            List l = cdr.f5106i.mo955l();
            mjq mjq = (mjq) l;
            int size = mjq.size();
            int i = 0;
            while (i < size) {
                obj = mjq.get(i);
                i++;
                ba.m4548a(cdr.av.m5638g(), glj.m17963b(), 11, ba.m4618c().m12794b(((bxn) obj).f4743e).m12786a(3));
            }
            boolean z2 = cdr.f5106i.mo931a() != null;
            mjq = (mjq) l;
            int size2 = mjq.size();
            size = 0;
            while (size < size2) {
                obj = mjq.get(size);
                size++;
                bxn bxn = (bxn) obj;
                if (!z2) {
                    if (ba.m4646i(bxn.f4739a)) {
                    }
                }
                new cio(cdr.context, l, cdr).execute(new Void[0]);
                break;
            }
            z = z2;
            if (z) {
                cdr.ad();
            } else if (cdr.m7403b(l)) {
                cdr.ad();
            }
            cdr.f5106i.mo956m();
        }
    }
}
