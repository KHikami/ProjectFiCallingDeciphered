package defpackage;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dcd {
    static int c = 16;
    static final Object d = new Object();
    final Context a;
    final CopyOnWriteArrayList<Integer> b = new CopyOnWriteArrayList();
    dcg e;

    public dcd(Context context) {
        this.a = context;
        new dcf(this).b(new Void[0]);
    }

    private void b() {
        iiq.a(new dce(this));
    }

    public void a(dcg dcg) {
        this.e = dcg;
    }

    public void a(int i) {
        do {
        } while (this.b.remove(Integer.valueOf(i)));
        this.b.add(0, Integer.valueOf(i));
        if (this.e != null) {
            this.e.x_();
        }
        b();
    }

    public CopyOnWriteArrayList<Integer> a() {
        return this.b;
    }
}
