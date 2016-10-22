import android.view.View;

/* compiled from: PG */
final class xs {
    int a;
    int b;
    boolean c;
    boolean d;
    final /* synthetic */ xr e;

    xs(xr xrVar) {
        this.e = xrVar;
        a();
    }

    final void a() {
        this.a = -1;
        this.b = oe.INVALID_ID;
        this.c = false;
        this.d = false;
    }

    final void b() {
        int c;
        if (this.c) {
            c = this.e.b.c();
        } else {
            c = this.e.b.b();
        }
        this.b = c;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mCoordinate=" + this.b + ", mLayoutFromEnd=" + this.c + ", mValid=" + this.d + '}';
    }

    public final void a(View view) {
        if (this.c) {
            this.b = this.e.b.b(view) + this.e.b.a();
        } else {
            this.b = this.e.b.a(view);
        }
        this.a = yz.a(view);
    }
}
