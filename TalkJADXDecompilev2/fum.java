package defpackage;

import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class fum extends jzn implements jwg {
    bko a;
    private jca b;

    public fum() {
        jwf jwf = new jwf(this, this.lifecycle);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.b = (jca) this.binder.a(jca.class);
        this.a = fde.e(this.b.a());
    }

    public void a() {
        PreferenceCategory a = new jwo(this.context).a(bc.fu);
        jwi jvv = new jvv(this.context, this.b.a(), "improve_hangouts_key");
        jvv.g(bc.fw);
        jvv.h(bc.fv);
        jvv.b((Object) Boolean.valueOf(((ful) this.binder.a(ful.class)).a(this.b.a())));
        jvv.a(new fun(this));
        a.c(jvv);
    }
}
