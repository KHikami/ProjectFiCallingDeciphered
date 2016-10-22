import android.support.v7.widget.RecyclerView;

public class agd {
    final /* synthetic */ RecyclerView a;

    public void a(aer aer, aed aed, aed aed2) {
        this.a.c.b(aer);
        RecyclerView recyclerView = this.a;
        recyclerView.a(aer);
        aer.a(false);
        if (recyclerView.v.a(aer, aed, aed2)) {
            recyclerView.p();
        }
    }

    public void b(aer aer, aed aed, aed aed2) {
        RecyclerView recyclerView = this.a;
        aer.a(false);
        if (recyclerView.v.b(aer, aed, aed2)) {
            recyclerView.p();
        }
    }

    public void c(aer aer, aed aed, aed aed2) {
        aer.a(false);
        if (this.a.u) {
            if (this.a.v.a(aer, aer, aed, aed2)) {
                this.a.p();
            }
        } else if (this.a.v.c(aer, aed, aed2)) {
            this.a.p();
        }
    }

    public void a(aer aer) {
        this.a.k.a(aer.a, this.a.c);
    }

    public agd(RecyclerView recyclerView) {
        this.a = recyclerView;
    }
}
