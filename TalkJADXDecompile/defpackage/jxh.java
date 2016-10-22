package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: jxh */
public class jxh implements kaw, kcq {
    public uq b;
    public jwp c;

    public jxh(uq uqVar, kbu kbu) {
        this(uqVar, null, kbu);
    }

    private jxh(uq uqVar, jwp jwp, kbu kbu) {
        this.b = uqVar;
        this.c = null;
        kbu.a((kcq) this);
    }

    public void b_(Bundle bundle) {
        if (bundle == null) {
            dr a = a();
            if (a == null) {
                throw new IllegalStateException("A PreferenceFragment must be provided!");
            }
            Bundle a2 = a(this.b.getIntent());
            if (a2 != null) {
                a.setArguments(a2);
            }
            this.b.J_().a().a(co.d, a).a();
        }
    }

    public jwp a() {
        return this.c;
    }

    public Bundle a(Intent intent) {
        return null;
    }
}
