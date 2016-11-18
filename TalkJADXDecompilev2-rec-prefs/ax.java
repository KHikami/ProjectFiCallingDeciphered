package p000;

import android.view.View;

final class ax implements Runnable {
    final /* synthetic */ au f2462a;
    private final View f2463b;
    private final boolean f2464c;

    ax(au auVar, View view, boolean z) {
        this.f2462a = auVar;
        this.f2463b = view;
        this.f2464c = z;
    }

    public void run() {
        if (this.f2462a.f2195b != null && this.f2462a.f2195b.a(true)) {
            oa.a(this.f2463b, this);
        } else if (this.f2464c && this.f2462a.f2196c != null) {
            this.f2462a.f2196c.m4158a(this.f2463b);
        }
    }
}
