package p000;

import android.graphics.Rect;
import android.view.View;

public abstract class ads {
    public final aef f357a;
    final Rect f358b;
    private int f359c;

    public abstract int mo88a(View view);

    public abstract void mo89a(int i);

    public abstract int mo90b(View view);

    public abstract int mo91c();

    public abstract int mo92c(View view);

    public abstract int mo93d();

    public abstract int mo94d(View view);

    public abstract int mo95e();

    public abstract int mo96e(View view);

    public abstract int mo97f();

    public abstract int mo98f(View view);

    public abstract int mo99g();

    public abstract int mo100h();

    public abstract int mo101i();

    private ads(aef aef) {
        this.f359c = nzf.UNSET_ENUM_VALUE;
        this.f358b = new Rect();
        this.f357a = aef;
    }

    public void m692a() {
        this.f359c = mo97f();
    }

    public int m694b() {
        return nzf.UNSET_ENUM_VALUE == this.f359c ? 0 : mo97f() - this.f359c;
    }
}
