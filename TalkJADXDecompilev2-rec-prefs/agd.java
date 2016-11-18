package p000;

import android.support.v7.widget.RecyclerView;

public class agd {
    final /* synthetic */ RecyclerView f589a;

    public void m1020a(aer aer, aed aed, aed aed2) {
        this.f589a.f1441c.m815b(aer);
        RecyclerView recyclerView = this.f589a;
        recyclerView.m3057a(aer);
        aer.m859a(false);
        if (recyclerView.f1460v.mo23a(aer, aed, aed2)) {
            recyclerView.m3102p();
        }
    }

    public void m1021b(aer aer, aed aed, aed aed2) {
        RecyclerView recyclerView = this.f589a;
        aer.m859a(false);
        if (recyclerView.f1460v.mo25b(aer, aed, aed2)) {
            recyclerView.m3102p();
        }
    }

    public void m1022c(aer aer, aed aed, aed aed2) {
        aer.m859a(false);
        if (this.f589a.f1459u) {
            if (this.f589a.f1460v.mo24a(aer, aer, aed, aed2)) {
                this.f589a.m3102p();
            }
        } else if (this.f589a.f1460v.mo26c(aer, aed, aed2)) {
            this.f589a.m3102p();
        }
    }

    public void m1019a(aer aer) {
        this.f589a.f1449k.m431a(aer.f438a, this.f589a.f1441c);
    }

    public agd(RecyclerView recyclerView) {
        this.f589a = recyclerView;
    }
}
