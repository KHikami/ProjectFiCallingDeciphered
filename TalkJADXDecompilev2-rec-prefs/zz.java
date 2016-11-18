package p000;

import android.support.v7.widget.RecyclerView;

public class zz {
    final /* synthetic */ RecyclerView f35953a;

    public aer m41623a(int i) {
        aer a = this.f35953a.a(i, true);
        if (a == null || this.f35953a.e.c(a.a)) {
            return null;
        }
        return a;
    }

    public void m41624a(int i, int i2) {
        this.f35953a.a(i, i2, true);
        this.f35953a.y = true;
        aep aep = this.f35953a.x;
        aep.e += i2;
    }

    public void m41627b(int i, int i2) {
        this.f35953a.a(i, i2, false);
        this.f35953a.y = true;
    }

    public void m41625a(int i, int i2, Object obj) {
        this.f35953a.a(i, i2, obj);
        this.f35953a.z = true;
    }

    public void m41626a(aaa aaa) {
        m41630c(aaa);
    }

    public void m41628b(aaa aaa) {
        m41630c(aaa);
    }

    public void m41629c(int i, int i2) {
        this.f35953a.g(i, i2);
        this.f35953a.y = true;
    }

    public void m41631d(int i, int i2) {
        this.f35953a.f(i, i2);
        this.f35953a.y = true;
    }

    public zz(RecyclerView recyclerView) {
        this.f35953a = recyclerView;
    }

    void m41630c(aaa aaa) {
        switch (aaa.a) {
            case 1:
                this.f35953a.k.a();
                return;
            case 2:
                this.f35953a.k.c();
                return;
            case 4:
                this.f35953a.k.a(this.f35953a, aaa.b, aaa.d);
                return;
            case 8:
                this.f35953a.k.d();
                return;
            default:
                return;
        }
    }
}
