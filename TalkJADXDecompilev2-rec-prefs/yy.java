package p000;

import android.view.View;

public final class yy implements py {
    int f35874a;
    final /* synthetic */ yx f35875b;
    private boolean f35876c = false;

    protected yy(yx yxVar) {
        this.f35875b = yxVar;
    }

    public yy m41559a(pn pnVar, int i) {
        this.f35875b.f35871f = pnVar;
        this.f35874a = i;
        return this;
    }

    public void m41560a(View view) {
        super.setVisibility(0);
        this.f35876c = false;
    }

    public void m41561b(View view) {
        if (!this.f35876c) {
            this.f35875b.f35871f = null;
            super.setVisibility(this.f35874a);
        }
    }

    public void m41562c(View view) {
        this.f35876c = true;
    }
}
