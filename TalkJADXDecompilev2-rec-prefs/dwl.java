package p000;

import android.os.Bundle;
import android.text.TextUtils;

public final class dwl extends jzn implements jmx {
    fnc f10676a;
    jcf f10677b;
    jmo f10678c;
    int f10679d = -1;

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f10676a = (fnc) this.binder.m25443a(fnc.class);
        this.f10677b = (jcf) this.binder.m25443a(jcf.class);
        this.f10678c = (jmo) this.binder.m25443a(jmo.class);
    }

    public void mo1736a(int i) {
        this.f10679d = i;
        jch a = this.f10677b.mo3456a(i);
        fnc fnc = (fnc) jyn.m25426a(this.context, fnc.class);
        fne dwm = new dwm(this);
        fnc.mo2046a(dwm);
        fde.m15021f(i);
        if (!TextUtils.isEmpty(fde.m15023g(i))) {
            fnc.mo2049b(dwm);
            this.f10678c.mo3566a(a.mo3440b("account_name"), a.mo3440b("effective_gaia_id"));
        }
    }
}
