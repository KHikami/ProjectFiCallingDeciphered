import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
public abstract class ym {
    public final yz a;
    int b;
    final Rect c;

    public abstract int a(View view);

    public abstract void a(int i);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int e(View view);

    public abstract int f();

    public abstract int f(View view);

    public abstract int g();

    private ym(yz yzVar) {
        this.b = oe.INVALID_ID;
        this.c = new Rect();
        this.a = yzVar;
    }

    public final int a() {
        return oe.INVALID_ID == this.b ? 0 : e() - this.b;
    }
}
