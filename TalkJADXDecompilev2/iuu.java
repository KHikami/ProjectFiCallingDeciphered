package defpackage;

import java.util.Iterator;

final class iuu extends iuk {
    final /* synthetic */ ius a;

    iuu(ius ius) {
        this.a = ius;
    }

    public void a(long j) {
        ius ius = this.a;
        long j2 = j / 1000000;
        ius.e = false;
        if (ius.d == -1) {
            ius.d = j2;
        }
        double d = ((double) (j2 - ius.d)) / 1000.0d;
        ius.d = j2;
        if (ius.c != 0) {
            if (d > 0.064d) {
                d = 0.064d;
            }
            Iterator it = ius.a.iterator();
            while (it.hasNext()) {
                iuq iuq = (iuq) it.next();
                Boolean bool = (Boolean) ius.b.get(iuq);
                if (!(bool == null || !bool.booleanValue() || iuq.c(r2))) {
                    ius.b.put(iuq, Boolean.valueOf(false));
                    ius.c--;
                }
            }
            ius.c();
        }
    }
}
