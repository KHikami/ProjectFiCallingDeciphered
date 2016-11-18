package defpackage;

import android.os.Bundle;

public class cmh extends cmy implements cdf {
    public void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.binder.a(cmg.class, new cmi(this));
    }

    public boolean a() {
        ((cgr) this.binder.a(cgr.class)).m();
        if (((cdg) this.binder.a(cdg.class)).e()) {
            return true;
        }
        ((bxq) this.binder.a(bxq.class)).a(bxo.STICKER);
        return false;
    }

    public boolean b() {
        return false;
    }
}
