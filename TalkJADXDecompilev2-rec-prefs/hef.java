package p000;

import android.app.Dialog;

final class hef extends hft {
    final /* synthetic */ Dialog f16731a;
    final /* synthetic */ hee f16732b;

    hef(hee hee, Dialog dialog) {
        this.f16732b = hee;
        this.f16731a = dialog;
    }

    public void mo2478a() {
        this.f16732b.f16730a.m19462d();
        if (this.f16731a.isShowing()) {
            this.f16731a.dismiss();
        }
    }
}
