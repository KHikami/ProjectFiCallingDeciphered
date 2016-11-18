package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class ddx implements OnGlobalLayoutListener {
    final /* synthetic */ ddv a;
    private int b;
    private boolean c;
    private boolean d = true;

    ddx(ddv ddv) {
        this.a = ddv;
    }

    public void onGlobalLayout() {
        iil.b("Expected non-null", this.a.f.findViewById(ba.dD));
        if (!this.c) {
            this.b = this.a.f.getMeasuredHeight();
            this.c = true;
        }
        if (this.a.b().getMeasuredHeight() > this.b) {
            if (!this.d) {
                this.d = true;
                this.a.f.findViewById(ba.dD).setVisibility(8);
            }
        } else if (this.d) {
            this.d = false;
            this.a.f.findViewById(ba.dD).setVisibility(0);
        }
    }
}
