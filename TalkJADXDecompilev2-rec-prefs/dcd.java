package p000;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dcd {
    static int f9505c = 16;
    static final Object f9506d = new Object();
    final Context f9507a;
    final CopyOnWriteArrayList<Integer> f9508b = new CopyOnWriteArrayList();
    dcg f9509e;

    public dcd(Context context) {
        this.f9507a = context;
        new dcf(this).m4950b(new Void[0]);
    }

    private void m11440b() {
        iiq.m4948a(new dce(this));
    }

    public void m11443a(dcg dcg) {
        this.f9509e = dcg;
    }

    public void m11442a(int i) {
        do {
        } while (this.f9508b.remove(Integer.valueOf(i)));
        this.f9508b.add(0, Integer.valueOf(i));
        if (this.f9509e != null) {
            this.f9509e.x_();
        }
        m11440b();
    }

    public CopyOnWriteArrayList<Integer> m11441a() {
        return this.f9508b;
    }
}
