package p000;

import java.util.ArrayList;
import java.util.List;

public class jtf {
    public final /* synthetic */ int f21023a;
    public final /* synthetic */ eih f21024b;

    public void m25189a(jth jth) {
        List arrayList = new ArrayList();
        for (jtg jtg : jth.m25190a()) {
            arrayList.add(new eic(jtg.f21025a, jtg.f21026b));
        }
        this.f21024b.m13967a(((eie) this.f21024b.f11599c.get(this.f21023a)).f11593a, arrayList, false, false);
        this.f21024b.m13972a(this.f21023a, arrayList);
    }

    public jtf(eih eih, int i) {
        this.f21024b = eih;
        this.f21023a = i;
    }
}
