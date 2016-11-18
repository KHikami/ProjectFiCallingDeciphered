package defpackage;

import android.os.Bundle;

final class kbd implements kbz {
    final /* synthetic */ Bundle a;
    final /* synthetic */ kbc b;

    kbd(kbc kbc, Bundle bundle) {
        this.b = kbc;
        this.a = bundle;
    }

    public void a(kcq kcq) {
        if (kcq instanceof kaw) {
            ((kaw) kcq).b_(this.b.a(kcq, this.a));
        }
    }
}
