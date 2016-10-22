import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
public abstract class zg {
    int a;
    RecyclerView b;
    yz c;
    boolean d;
    public boolean e;
    View f;
    final zh g;

    protected abstract void a(int i, int i2, zh zhVar);

    protected abstract void a(View view, zh zhVar);

    protected abstract void b();

    public final void a() {
        if (this.e) {
            b();
            this.b.A.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            this.e = false;
            yz yzVar = this.c;
            if (yzVar.f == this) {
                yzVar.f = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
