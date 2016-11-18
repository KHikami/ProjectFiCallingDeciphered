package p000;

import android.content.Intent;
import android.os.Bundle;

public class jxh implements kaw, kcq {
    public uq f13960b;
    public jwp f13961c;

    public jxh(uq uqVar, kbu kbu) {
        this(uqVar, null, kbu);
    }

    private jxh(uq uqVar, jwp jwp, kbu kbu) {
        this.f13960b = uqVar;
        this.f13961c = null;
        kbu.m25514a((kcq) this);
    }

    public void b_(Bundle bundle) {
        if (bundle == null) {
            dr a = mo2089a();
            if (a == null) {
                throw new IllegalStateException("A PreferenceFragment must be provided!");
            }
            Bundle a2 = mo3582a(this.f13960b.getIntent());
            if (a2 != null) {
                a.setArguments(a2);
            }
            this.f13960b.J_().mo1845a().mo1525a(co.f5745d, a).mo1522a();
        }
    }

    public jwp mo2089a() {
        return this.f13961c;
    }

    public Bundle mo3582a(Intent intent) {
        return null;
    }
}
