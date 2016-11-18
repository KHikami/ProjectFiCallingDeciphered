package p000;

import android.view.View;

final class afz extends pz {
    final /* synthetic */ int f578a;
    final /* synthetic */ afx f579b;
    private boolean f580c = false;

    afz(afx afx, int i) {
        this.f579b = afx;
        this.f578a = i;
    }

    public void m996a(View view) {
        this.f579b.f559a.setVisibility(0);
    }

    public void m997b(View view) {
        if (!this.f580c) {
            this.f579b.f559a.setVisibility(this.f578a);
        }
    }

    public void m998c(View view) {
        this.f580c = true;
    }
}
