package defpackage;

import android.os.Bundle;

final class kbv implements kbz {
    final /* synthetic */ Bundle a;
    final /* synthetic */ kbu b;

    kbv(kbu kbu, Bundle bundle) {
        this.b = kbu;
        this.a = bundle;
    }

    public void a(kcq kcq) {
        if (kcq instanceof kcd) {
            ((kcd) kcq).a(this.b.a(kcq, this.a));
        }
    }
}
