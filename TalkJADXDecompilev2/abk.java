package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

class abk {
    Drawable a;
    final /* synthetic */ abi b;

    public void a(Drawable drawable) {
        this.a = drawable;
        this.b.setBackgroundDrawable(drawable);
    }

    public Drawable a() {
        return this.a;
    }

    public boolean b() {
        return this.b.a();
    }

    public boolean c() {
        return this.b.b();
    }

    public void a(int i, int i2, int i3, int i4) {
        this.b.d.set(i, i2, i3, i4);
        super.setPadding(this.b.c.left + i, this.b.c.top + i2, this.b.c.right + i3, this.b.c.bottom + i4);
    }

    public void a(int i, int i2) {
        if (i > this.b.a) {
            super.setMinimumWidth(i);
        }
        if (i2 > this.b.b) {
            super.setMinimumHeight(i2);
        }
    }

    public View d() {
        return this.b;
    }

    abk(abi abi) {
        this.b = abi;
    }
}
