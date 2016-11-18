package p000;

import android.os.Bundle;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class fvl extends jzn implements jwg {
    jca f14098a;
    fvv f14099b;
    bko f14100c;
    czg f14101d;
    jxk f14102e;
    jxk f14103f;
    private fvo f14104g;

    public fvl() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f14098a = (jca) this.binder.m25443a(jca.class);
        this.f14099b = (fvv) this.binder.m25443a(fvv.class);
    }

    public void onStart() {
        super.onStart();
        this.f14104g = new fvo(this);
        RealTimeChatService.m9040a(this.f14104g);
    }

    public void onStop() {
        super.onStop();
        RealTimeChatService.m9077b(this.f14104g);
        this.f14104g = null;
    }

    public void mo495a() {
        this.f14100c = fde.m15018e(this.f14098a.mo2317a());
        PreferenceScreen b = ((jxg) jyn.m25426a(this.context, jxg.class)).mo3625b();
        int a = this.f14098a.mo2317a();
        this.f14102e = new jxk(this.context);
        this.f14102e.m5148g(bc.fK);
        this.f14102e.m5150h(bc.fJ);
        this.f14102e.mo534a(this.f14099b.m16339b(a));
        b.m10483c(this.f14102e);
        this.f14103f = new jxk(this.context);
        this.f14103f.m5148g(bc.jT);
        this.f14103f.m5150h(bc.jU);
        this.f14103f.mo534a(this.f14099b.m16340c(a));
        b.m10483c(this.f14103f);
        jwm fvm = new fvm(this);
        this.f14102e.m5121a(fvm);
        this.f14103f.m5121a(fvm);
    }
}
