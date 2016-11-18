package p000;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class ddx implements OnGlobalLayoutListener {
    final /* synthetic */ ddv f9542a;
    private int f9543b;
    private boolean f9544c;
    private boolean f9545d = true;

    ddx(ddv ddv) {
        this.f9542a = ddv;
    }

    public void onGlobalLayout() {
        iil.m21875b("Expected non-null", this.f9542a.f.findViewById(ba.dD));
        if (!this.f9544c) {
            this.f9543b = this.f9542a.f.getMeasuredHeight();
            this.f9544c = true;
        }
        if (this.f9542a.m11280b().getMeasuredHeight() > this.f9543b) {
            if (!this.f9545d) {
                this.f9545d = true;
                this.f9542a.f.findViewById(ba.dD).setVisibility(8);
            }
        } else if (this.f9545d) {
            this.f9545d = false;
            this.f9542a.f.findViewById(ba.dD).setVisibility(0);
        }
    }
}
