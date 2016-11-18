package p000;

import android.view.View;

final class acc extends ach {
    final /* synthetic */ aer f206a;
    final /* synthetic */ int f207b;
    final /* synthetic */ int f208c;
    final /* synthetic */ pn f209d;
    final /* synthetic */ abw f210e;

    acc(abw abw, aer aer, int i, int i2, pn pnVar) {
        this.f210e = abw;
        this.f206a = aer;
        this.f207b = i;
        this.f208c = i2;
        this.f209d = pnVar;
    }

    public void mo37a(View view) {
    }

    public void mo39c(View view) {
        if (this.f207b != 0) {
            oa.a(view, 0.0f);
        }
        if (this.f208c != 0) {
            oa.b(view, 0.0f);
        }
    }

    public void mo38b(View view) {
        this.f209d.a(null);
        this.f210e.m327f(this.f206a);
        this.f210e.f187e.remove(this.f206a);
        this.f210e.m354c();
    }
}
