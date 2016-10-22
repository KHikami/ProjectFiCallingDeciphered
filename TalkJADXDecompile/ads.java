import android.graphics.Rect;
import android.view.View;

public abstract class ads {
    public final aef a;
    final Rect b;
    private int c;

    public abstract int a(View view);

    public abstract void a(int i);

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

    public abstract int h();

    public abstract int i();

    private ads(aef aef) {
        this.c = nzf.UNSET_ENUM_VALUE;
        this.b = new Rect();
        this.a = aef;
    }

    public void a() {
        this.c = f();
    }

    public int b() {
        return nzf.UNSET_ENUM_VALUE == this.c ? 0 : f() - this.c;
    }
}
