package p000;

import android.view.View;

final class aa implements Runnable {
    final /* synthetic */ y f0a;
    private final View f1b;
    private final int f2c;

    aa(y yVar, View view, int i) {
        this.f0a = yVar;
        this.f1b = view;
        this.f2c = i;
    }

    public void run() {
        if (this.f0a.e == null || !this.f0a.e.a(true)) {
            this.f0a.a(this.f2c);
        } else {
            oa.a(this.f1b, this);
        }
    }
}
