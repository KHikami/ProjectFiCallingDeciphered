package p000;

import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class fum extends jzn implements jwg {
    bko f14038a;
    private jca f14039b;

    public fum() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f14039b = (jca) this.binder.m25443a(jca.class);
        this.f14038a = fde.m15018e(this.f14039b.mo2317a());
    }

    public void mo495a() {
        PreferenceCategory a = new jwo(this.context).m25341a(bc.fu);
        jwi jvv = new jvv(this.context, this.f14039b.mo2317a(), "improve_hangouts_key");
        jvv.m5148g(bc.fw);
        jvv.m5150h(bc.fv);
        jvv.m5128b((Object) Boolean.valueOf(((ful) this.binder.m25443a(ful.class)).m16264a(this.f14039b.mo2317a())));
        jvv.m5121a(new fun(this));
        a.m10483c(jvv);
    }
}
