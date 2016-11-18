package defpackage;

import android.os.Bundle;

final class kby implements kbz {
    final /* synthetic */ Bundle a;
    final /* synthetic */ kbu b;

    kby(kbu kbu, Bundle bundle) {
        this.b = kbu;
        this.a = bundle;
    }

    public void a(kcq kcq) {
        if (kcq instanceof kcn) {
            Bundle bundle = new Bundle();
            ((kcn) kcq).b(bundle);
            kbu kbu = this.b;
            this.a.putBundle((String) ba.a(kbu.b(kcq)), bundle);
        }
    }
}
