import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
final class yo extends ym {
    yo(yz yzVar) {
        super((byte) 0);
    }

    public final int c() {
        return this.a.m - this.a.l();
    }

    public final int d() {
        return this.a.m;
    }

    public final void a(int i) {
        yz yzVar = this.a;
        if (yzVar.e != null) {
            RecyclerView recyclerView = yzVar.e;
            int a = recyclerView.e.a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.e.b(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final int b() {
        return this.a.j();
    }

    public final int e(View view) {
        za zaVar = (za) view.getLayoutParams();
        return zaVar.bottomMargin + (yz.c(view) + zaVar.topMargin);
    }

    public final int f(View view) {
        za zaVar = (za) view.getLayoutParams();
        return zaVar.rightMargin + (yz.b(view) + zaVar.leftMargin);
    }

    public final int b(View view) {
        za zaVar = (za) view.getLayoutParams();
        return zaVar.bottomMargin + this.a.g(view);
    }

    public final int a(View view) {
        return this.a.e(view) - ((za) view.getLayoutParams()).topMargin;
    }

    public final int c(View view) {
        this.a.a(view, true, this.c);
        return this.c.bottom;
    }

    public final int d(View view) {
        this.a.a(view, true, this.c);
        return this.c.top;
    }

    public final int e() {
        return (this.a.m - this.a.j()) - this.a.l();
    }

    public final int f() {
        return this.a.l();
    }

    public final int g() {
        return this.a.k;
    }
}
