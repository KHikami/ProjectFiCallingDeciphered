package p000;

import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class fux extends jzn implements jwg {
    static final lo<Integer, Integer> f14055a;
    jca f14056b;
    iih f14057c;
    private PreferenceCategory f14058d;

    public fux() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    static {
        lo loVar = new lo();
        f14055a = loVar;
        loVar.put(Integer.valueOf(10), Integer.valueOf(3390));
        f14055a.put(Integer.valueOf(25), Integer.valueOf(3389));
        f14055a.put(Integer.valueOf(30), Integer.valueOf(3388));
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f14056b = (jca) this.binder.m25443a(jca.class);
        this.f14057c = (iih) this.binder.m25443a(iih.class);
    }

    public void mo495a() {
        String str;
        boolean z;
        boolean z2 = true;
        int a = this.f14056b.mo2317a();
        int f = ((fuz) jyn.m25426a(this.context, fuz.class)).m16298f(a);
        switch (f) {
            case 10:
                str = "NONE";
                break;
            case wi.dz /*25*/:
                str = "IMPORTANT_ONLY";
                break;
            default:
                str = "ALL";
                break;
        }
        jwo jwo = new jwo(this.context);
        PreferenceScreen b = ((jxg) jyn.m25426a(this.context, jxg.class)).mo3625b();
        this.f14058d = jwo.m25342a(getString(bc.cS));
        b.m10483c(this.f14058d);
        jwi jwb = new jwb(this.context);
        jwi a2 = fvh.m16307a(this.context, bc.ac, "chat_notification_sound_key", 2, this.f14056b);
        jwi a3 = fvh.m16308a(this.context, this.f14056b.mo2317a(), bc.kv, "chat_notification_vibrate_bool_key", this.f14056b.mo2320c().mo3439a("chat_notification_vibrate_bool_key", true));
        jwb.m16378b(gwb.dr);
        jwb.m16381c(gwb.ds);
        jwb.m5121a(new fuy(this, a, a2, a3, jwb));
        jwb.m5148g(bc.kt);
        jwb.m16360a(bc.kt);
        jwb.m16373a(str);
        jwb.mo2102b(jwb.m16387i());
        boolean z3 = f == 10;
        if (z3) {
            z = false;
        } else {
            z = true;
        }
        a2.m5137d(z);
        if (z3) {
            z2 = false;
        }
        a3.m5137d(z2);
        this.f14058d.m10483c(jwb);
        this.f14058d.m10483c(a2);
        this.f14058d.m10483c(a2);
        this.f14058d.m10483c(a3);
    }
}
