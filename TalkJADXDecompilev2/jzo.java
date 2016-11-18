package defpackage;

import android.os.Bundle;

final class jzo implements kbz {
    final /* synthetic */ Bundle a;
    final /* synthetic */ jzn b;

    jzo(jzn jzn, Bundle bundle) {
        this.b = jzn;
        this.a = bundle;
    }

    public void a(kcq kcq) {
        if (kcq instanceof jza) {
            ((jza) kcq).a(this.b.context, this.b.binder, this.b.lifecycle.a(kcq, this.a));
        }
    }
}
