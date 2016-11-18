package defpackage;

import android.view.View;

public final class yy implements py {
    int a;
    final /* synthetic */ yx b;
    private boolean c = false;

    protected yy(yx yxVar) {
        this.b = yxVar;
    }

    public yy a(pn pnVar, int i) {
        this.b.f = pnVar;
        this.a = i;
        return this;
    }

    public void a(View view) {
        super.setVisibility(0);
        this.c = false;
    }

    public void b(View view) {
        if (!this.c) {
            this.b.f = null;
            super.setVisibility(this.a);
        }
    }

    public void c(View view) {
        this.c = true;
    }
}
