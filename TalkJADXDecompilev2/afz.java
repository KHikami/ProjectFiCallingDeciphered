package defpackage;

import android.view.View;

final class afz extends pz {
    final /* synthetic */ int a;
    final /* synthetic */ afx b;
    private boolean c = false;

    afz(afx afx, int i) {
        this.b = afx;
        this.a = i;
    }

    public void a(View view) {
        this.b.a.setVisibility(0);
    }

    public void b(View view) {
        if (!this.c) {
            this.b.a.setVisibility(this.a);
        }
    }

    public void c(View view) {
        this.c = true;
    }
}
