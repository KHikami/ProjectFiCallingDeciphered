package defpackage;

import android.app.Activity;

final class kbo implements kbz {
    final /* synthetic */ Activity a;
    final /* synthetic */ kbn b;

    kbo(kbn kbn, Activity activity) {
        this.b = kbn;
        this.a = activity;
    }

    public void a(kcq kcq) {
        if (kcq instanceof kbi) {
            ((kbi) kcq).a(this.a);
        }
    }
}
