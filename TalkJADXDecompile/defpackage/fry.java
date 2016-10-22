package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: fry */
public final class fry implements bjm {
    private frq a;
    private final Context b;

    fry(frq frq, Context context) {
        this.a = frq;
        this.b = context;
    }

    public bjg a(String str) {
        hwk c = this.a.c(str);
        if (c != null) {
            return new frz(c, this.b);
        }
        return null;
    }

    public Iterable<bjg> b(String str) {
        return a(this.a.b(str));
    }

    public Iterable<bjg> c(String str) {
        return a(this.a.a(str));
    }

    private Iterable<bjg> a(List<hwk> list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        List arrayList = new ArrayList(list.size());
        for (hwk frz : list) {
            arrayList.add(new frz(frz, this.b));
        }
        return arrayList;
    }

    public boolean b() {
        return this.a.e();
    }

    public void a() {
        this.a.b();
        this.a = null;
    }
}
