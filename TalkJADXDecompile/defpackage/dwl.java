package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: dwl */
public final class dwl extends jzn implements jmx {
    fnc a;
    jcf b;
    jmo c;
    int d;

    public dwl() {
        this.d = -1;
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.a = (fnc) this.binder.a(fnc.class);
        this.b = (jcf) this.binder.a(jcf.class);
        this.c = (jmo) this.binder.a(jmo.class);
    }

    public void a(int i) {
        this.d = i;
        jch a = this.b.a(i);
        fnc fnc = (fnc) jyn.a(this.context, fnc.class);
        fne dwm = new dwm(this);
        fnc.a(dwm);
        fde.f(i);
        if (!TextUtils.isEmpty(fde.g(i))) {
            fnc.b(dwm);
            this.c.a(a.b("account_name"), a.b("effective_gaia_id"));
        }
    }
}
