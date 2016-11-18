package p000;

import java.util.Iterator;

final class iuu extends iuk {
    final /* synthetic */ ius f19078a;

    iuu(ius ius) {
        this.f19078a = ius;
    }

    public void mo3399a(long j) {
        ius ius = this.f19078a;
        long j2 = j / 1000000;
        ius.f19072e = false;
        if (ius.f19071d == -1) {
            ius.f19071d = j2;
        }
        double d = ((double) (j2 - ius.f19071d)) / 1000.0d;
        ius.f19071d = j2;
        if (ius.f19070c != 0) {
            if (d > 0.064d) {
                d = 0.064d;
            }
            Iterator it = ius.f19068a.iterator();
            while (it.hasNext()) {
                iuq iuq = (iuq) it.next();
                Boolean bool = (Boolean) ius.f19069b.get(iuq);
                if (!(bool == null || !bool.booleanValue() || iuq.m23324c(r2))) {
                    ius.f19069b.put(iuq, Boolean.valueOf(false));
                    ius.f19070c--;
                }
            }
            ius.m23329c();
        }
    }
}
