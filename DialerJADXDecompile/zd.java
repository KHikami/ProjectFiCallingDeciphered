import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
public final class zd extends yu {
    private /* synthetic */ RecyclerView a;

    public zd(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a() {
        this.a.a(null);
        RecyclerView recyclerView;
        int b;
        int i;
        zk b2;
        zc zcVar;
        zk zkVar;
        if (this.a.j.b) {
            this.a.A.f = true;
            recyclerView = this.a;
            if (!recyclerView.t) {
                recyclerView.t = true;
                b = recyclerView.e.b();
                for (i = 0; i < b; i++) {
                    b2 = RecyclerView.b(recyclerView.e.c(i));
                    if (!(b2 == null || b2.b())) {
                        b2.b(512);
                    }
                }
                zcVar = recyclerView.c;
                b = zcVar.c.size();
                for (i = 0; i < b; i++) {
                    zkVar = (zk) zcVar.c.get(i);
                    if (zkVar != null) {
                        zkVar.b(512);
                    }
                }
            }
        } else {
            this.a.A.f = true;
            recyclerView = this.a;
            if (!recyclerView.t) {
                recyclerView.t = true;
                b = recyclerView.e.b();
                for (i = 0; i < b; i++) {
                    b2 = RecyclerView.b(recyclerView.e.c(i));
                    if (!(b2 == null || b2.b())) {
                        b2.b(512);
                    }
                }
                zcVar = recyclerView.c;
                b = zcVar.c.size();
                for (i = 0; i < b; i++) {
                    zkVar = (zk) zcVar.c.get(i);
                    if (zkVar != null) {
                        zkVar.b(512);
                    }
                }
            }
        }
        if (!this.a.d.d()) {
            this.a.requestLayout();
        }
    }

    public final void a(int i, int i2, Object obj) {
        this.a.a(null);
        if (this.a.d.a(i, i2, obj)) {
            b();
        }
    }

    public final void a(int i, int i2) {
        this.a.a(null);
        if (this.a.d.c(i, i2)) {
            b();
        }
    }

    private void b() {
        if (this.a.s && this.a.n && this.a.m) {
            kn.a(this.a, this.a.g);
            return;
        }
        this.a.r = true;
        this.a.requestLayout();
    }
}
