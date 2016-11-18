package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class fry implements bjm {
    private frq f13864a;
    private final Context f13865b;

    fry(frq frq, Context context) {
        this.f13864a = frq;
        this.f13865b = context;
    }

    public bjg mo1752a(String str) {
        hwk c = this.f13864a.m16070c(str);
        if (c != null) {
            return new frz(c, this.f13865b);
        }
        return null;
    }

    public Iterable<bjg> mo1754b(String str) {
        return m16076a(this.f13864a.m16068b(str));
    }

    public Iterable<bjg> mo1756c(String str) {
        return m16076a(this.f13864a.m16064a(str));
    }

    private Iterable<bjg> m16076a(List<hwk> list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        List arrayList = new ArrayList(list.size());
        for (hwk frz : list) {
            arrayList.add(new frz(frz, this.f13865b));
        }
        return arrayList;
    }

    public boolean mo1755b() {
        return this.f13864a.m16073e();
    }

    public void mo1753a() {
        this.f13864a.m16069b();
        this.f13864a = null;
    }
}
