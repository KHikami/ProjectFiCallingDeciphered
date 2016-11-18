package defpackage;

import android.app.Dialog;

final class hef extends hft {
    final /* synthetic */ Dialog a;
    final /* synthetic */ hee b;

    hef(hee hee, Dialog dialog) {
        this.b = hee;
        this.a = dialog;
    }

    public void a() {
        this.b.a.d();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
