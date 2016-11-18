package p000;

import android.content.Context;
import android.view.View;

public abstract class ccv<H> extends ccw<H> {
    public boolean f4993a;
    public Context f4994b;
    private final gai f4995e;
    private gag f4996f;

    public abstract gag mo810b();

    public ccv(View view, H h, gai gai) {
        super(h, null);
        this.f4994b = view.getContext();
        this.f4995e = gai;
    }

    public void mo806a(boolean z) {
        if (z && !this.f4993a) {
            mo808d();
            this.f4993a = true;
            this.f4996f = mo810b();
            this.f4995e.m7655a(this.f4996f);
        } else if (!z && this.f4993a) {
            this.f4995e.m7661b(this.f4996f);
            this.f4993a = false;
        }
    }

    protected void mo807c() {
    }

    protected void mo808d() {
    }

    public gah m7186e() {
        return new gah(this.f4994b);
    }
}
