package p000;

import android.view.ViewGroup;

public abstract class ccw<H> {
    public H f4991c;
    public ViewGroup f4992d;

    public abstract boolean mo809a();

    public abstract void mo807c();

    public abstract void mo808d();

    public ccw(H h, ViewGroup viewGroup) {
        this.f4991c = h;
        this.f4992d = viewGroup;
        mo807c();
    }

    public void mo806a(boolean z) {
        if (z) {
            mo808d();
        }
        int i = z ? 0 : 8;
        if (this.f4992d != null) {
            this.f4992d.setVisibility(i);
        }
    }
}
