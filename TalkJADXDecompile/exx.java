import java.util.ArrayList;

public final class exx extends evz {
    private static final long serialVersionUID = 1;
    private final ArrayList<fbk> g;

    exx(oht oht) {
        this.g = new ArrayList();
        for (ohr ohr : oht.a) {
            int a;
            String str = ohr.a;
            boolean b = gwb.b(ohr.b);
            boolean b2 = gwb.b(ohr.c);
            boolean b3 = gwb.b(ohr.d);
            if (ohr.e != null) {
                a = gwb.a(ohr.e.b);
            } else {
                a = 0;
            }
            this.g.add(new fbk(str, b, b2, b3, a, ohr.f != null ? ohr.f.a : null));
        }
    }
}
