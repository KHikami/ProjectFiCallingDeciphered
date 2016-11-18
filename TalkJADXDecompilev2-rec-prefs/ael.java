package p000;

import android.support.v7.widget.RecyclerView;

public final class ael extends aea {
    final /* synthetic */ RecyclerView f399a;

    public ael(RecyclerView recyclerView) {
        this.f399a = recyclerView;
    }

    public void mo104a(int i, int i2, Object obj) {
        this.f399a.m3060a(null);
        if (this.f399a.f1442d.m673a(i, i2, obj)) {
            m825a();
        }
    }

    public void mo102a(int i, int i2) {
        this.f399a.m3060a(null);
        if (this.f399a.f1442d.m681c(i, i2)) {
            m825a();
        }
    }

    public void mo105b(int i, int i2) {
        this.f399a.m3060a(null);
        if (this.f399a.f1442d.m685d(i, i2)) {
            m825a();
        }
    }

    public void mo103a(int i, int i2, int i3) {
        this.f399a.m3060a(null);
        if (this.f399a.f1442d.m672a(i, i2, 1)) {
            m825a();
        }
    }

    private void m825a() {
        if (this.f399a.f1457s && this.f399a.f1452n && this.f399a.f1451m) {
            oa.a(this.f399a, this.f399a.f1445g);
            return;
        }
        this.f399a.f1456r = true;
        this.f399a.requestLayout();
    }
}
