package p000;

import android.os.Bundle;

final class kby implements kbz {
    final /* synthetic */ Bundle f21385a;
    final /* synthetic */ kbu f21386b;

    kby(kbu kbu, Bundle bundle) {
        this.f21386b = kbu;
        this.f21385a = bundle;
    }

    public void mo1841a(kcq kcq) {
        if (kcq instanceof kcn) {
            Bundle bundle = new Bundle();
            ((kcn) kcq).mo645b(bundle);
            kbu kbu = this.f21386b;
            this.f21385a.putBundle((String) ba.m4536a(kbu.m25511b(kcq)), bundle);
        }
    }
}
