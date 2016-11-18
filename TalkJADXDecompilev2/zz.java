package defpackage;

import android.support.v7.widget.RecyclerView;

public class zz {
    final /* synthetic */ RecyclerView a;

    public aer a(int i) {
        aer a = this.a.a(i, true);
        if (a == null || this.a.e.c(a.a)) {
            return null;
        }
        return a;
    }

    public void a(int i, int i2) {
        this.a.a(i, i2, true);
        this.a.y = true;
        aep aep = this.a.x;
        aep.e += i2;
    }

    public void b(int i, int i2) {
        this.a.a(i, i2, false);
        this.a.y = true;
    }

    public void a(int i, int i2, Object obj) {
        this.a.a(i, i2, obj);
        this.a.z = true;
    }

    public void a(aaa aaa) {
        c(aaa);
    }

    public void b(aaa aaa) {
        c(aaa);
    }

    public void c(int i, int i2) {
        this.a.g(i, i2);
        this.a.y = true;
    }

    public void d(int i, int i2) {
        this.a.f(i, i2);
        this.a.y = true;
    }

    public zz(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    void c(aaa aaa) {
        switch (aaa.a) {
            case 1:
                this.a.k.a();
                return;
            case 2:
                this.a.k.c();
                return;
            case 4:
                this.a.k.a(this.a, aaa.b, aaa.d);
                return;
            case 8:
                this.a.k.d();
                return;
            default:
                return;
        }
    }
}
