package defpackage;

import android.content.Context;
import android.view.View;

public abstract class ccv<H> extends ccw<H> {
    public boolean a;
    public Context b;
    private final gai e;
    private gag f;

    public abstract gag b();

    public ccv(View view, H h, gai gai) {
        super(h, null);
        this.b = view.getContext();
        this.e = gai;
    }

    public void a(boolean z) {
        if (z && !this.a) {
            d();
            this.a = true;
            this.f = b();
            this.e.a(this.f);
        } else if (!z && this.a) {
            this.e.b(this.f);
            this.a = false;
        }
    }

    protected void c() {
    }

    protected void d() {
    }

    public gah e() {
        return new gah(this.b);
    }
}
