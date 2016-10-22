import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
final class yn extends ym {
    yn(yz yzVar) {
        super((byte) 0);
    }

    public final int c() {
        return this.a.l - this.a.k();
    }

    public final int d() {
        return this.a.l;
    }

    public final void a(int i) {
        yz yzVar = this.a;
        if (yzVar.e != null) {
            RecyclerView recyclerView = yzVar.e;
            int a = recyclerView.e.a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.e.b(i2).offsetLeftAndRight(i);
            }
        }
    }

    public final int b() {
        return this.a.i();
    }

    public final int e(View view) {
        za zaVar = (za) view.getLayoutParams();
        return zaVar.rightMargin + (yz.b(view) + zaVar.leftMargin);
    }

    public final int f(View view) {
        za zaVar = (za) view.getLayoutParams();
        return zaVar.bottomMargin + (yz.c(view) + zaVar.topMargin);
    }

    public final int b(View view) {
        za zaVar = (za) view.getLayoutParams();
        return zaVar.rightMargin + this.a.f(view);
    }

    public final int a(View view) {
        return this.a.d(view) - ((za) view.getLayoutParams()).leftMargin;
    }

    public final int c(View view) {
        this.a.a(view, true, this.c);
        return this.c.right;
    }

    public final int d(View view) {
        this.a.a(view, true, this.c);
        return this.c.left;
    }

    public final int e() {
        return (this.a.l - this.a.i()) - this.a.k();
    }

    public final int f() {
        return this.a.k();
    }

    public final int g() {
        return this.a.j;
    }
}
