package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: jtf */
public class jtf {
    public final /* synthetic */ int a;
    public final /* synthetic */ eih b;

    public void a(jth jth) {
        List arrayList = new ArrayList();
        for (jtg jtg : jth.a()) {
            arrayList.add(new eic(jtg.a, jtg.b));
        }
        this.b.a(((eie) this.b.c.get(this.a)).a, arrayList, false, false);
        this.b.a(this.a, arrayList);
    }

    public jtf(eih eih, int i) {
        this.b = eih;
        this.a = i;
    }
}
