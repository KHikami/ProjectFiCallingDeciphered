package p000;

import android.os.Bundle;

final class kbd implements kbz {
    final /* synthetic */ Bundle f21359a;
    final /* synthetic */ kbc f21360b;

    kbd(kbc kbc, Bundle bundle) {
        this.f21360b = kbc;
        this.f21359a = bundle;
    }

    public void mo1841a(kcq kcq) {
        if (kcq instanceof kaw) {
            ((kaw) kcq).b_(this.f21360b.m25512a(kcq, this.f21359a));
        }
    }
}
