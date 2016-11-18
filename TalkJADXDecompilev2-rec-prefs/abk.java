package p000;

import android.graphics.drawable.Drawable;
import android.view.View;

class abk {
    Drawable f164a;
    final /* synthetic */ abi f165b;

    public void m213a(Drawable drawable) {
        this.f164a = drawable;
        this.f165b.setBackgroundDrawable(drawable);
    }

    public Drawable m210a() {
        return this.f164a;
    }

    public boolean m214b() {
        return this.f165b.m195a();
    }

    public boolean m215c() {
        return this.f165b.m196b();
    }

    public void m212a(int i, int i2, int i3, int i4) {
        this.f165b.f160d.set(i, i2, i3, i4);
        super.setPadding(this.f165b.f159c.left + i, this.f165b.f159c.top + i2, this.f165b.f159c.right + i3, this.f165b.f159c.bottom + i4);
    }

    public void m211a(int i, int i2) {
        if (i > this.f165b.f157a) {
            super.setMinimumWidth(i);
        }
        if (i2 > this.f165b.f158b) {
            super.setMinimumHeight(i2);
        }
    }

    public View m216d() {
        return this.f165b;
    }

    abk(abi abi) {
        this.f165b = abi;
    }
}
