package p000;

import android.os.Bundle;
import android.view.View;

final class kbs implements kbz {
    final /* synthetic */ Bundle f21378a;
    final /* synthetic */ View f21379b;
    final /* synthetic */ kbn f21380c;

    kbs(kbn kbn, Bundle bundle, View view) {
        this.f21380c = kbn;
        this.f21378a = bundle;
        this.f21379b = view;
    }

    public void mo1841a(kcq kcq) {
        if (kcq instanceof kbm) {
            ((kbm) kcq).mo917a(this.f21379b, this.f21380c.m25512a(kcq, this.f21378a));
        }
    }
}
