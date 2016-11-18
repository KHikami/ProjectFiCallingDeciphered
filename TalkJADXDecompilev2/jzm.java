package defpackage;

import android.os.Bundle;

final class jzm implements kbz {
    final /* synthetic */ Bundle a;
    final /* synthetic */ jzl b;

    jzm(jzl jzl, Bundle bundle) {
        this.b = jzl;
        this.a = bundle;
    }

    public void a(kcq kcq) {
        if (kcq instanceof jza) {
            ((jza) kcq).a(this.b.am, this.b.an, this.b.ao.a(kcq, this.a));
        }
    }
}
