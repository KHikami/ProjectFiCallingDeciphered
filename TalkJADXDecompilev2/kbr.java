package defpackage;

import android.os.Bundle;

final class kbr implements kbz {
    final /* synthetic */ Bundle a;
    final /* synthetic */ kbn b;

    kbr(kbn kbn, Bundle bundle) {
        this.b = kbn;
        this.a = bundle;
    }

    public void a(kcq kcq) {
        if (kcq instanceof kbk) {
            this.b.a(kcq, this.a);
            ((kbk) kcq).a();
        }
    }
}
