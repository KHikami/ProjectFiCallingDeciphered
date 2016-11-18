package p000;

import java.util.ArrayList;

public final class exx extends evz {
    private static final long serialVersionUID = 1;
    private final ArrayList<fbk> f12449g = new ArrayList();

    exx(oht oht) {
        for (ohr ohr : oht.a) {
            int a;
            String str = ohr.a;
            boolean b = gwb.m2061b(ohr.b);
            boolean b2 = gwb.m2061b(ohr.c);
            boolean b3 = gwb.m2061b(ohr.d);
            if (ohr.e != null) {
                a = gwb.m1507a(ohr.e.b);
            } else {
                a = 0;
            }
            this.f12449g.add(new fbk(str, b, b2, b3, a, ohr.f != null ? ohr.f.a : null));
        }
    }
}
