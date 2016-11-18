package defpackage;

import android.os.Bundle;
import android.view.View;

final class kbs implements kbz {
    final /* synthetic */ Bundle a;
    final /* synthetic */ View b;
    final /* synthetic */ kbn c;

    kbs(kbn kbn, Bundle bundle, View view) {
        this.c = kbn;
        this.a = bundle;
        this.b = view;
    }

    public void a(kcq kcq) {
        if (kcq instanceof kbm) {
            ((kbm) kcq).a(this.b, this.c.a(kcq, this.a));
        }
    }
}
