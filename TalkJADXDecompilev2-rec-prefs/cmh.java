package p000;

import android.os.Bundle;

public class cmh extends cmy implements cdf {
    public void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.binder.m25444a(cmg.class, new cmi(this));
    }

    public boolean mo495a() {
        ((cgr) this.binder.m25443a(cgr.class)).mo956m();
        if (((cdg) this.binder.m25443a(cdg.class)).mo864e()) {
            return true;
        }
        ((bxq) this.binder.m25443a(bxq.class)).mo895a(bxo.STICKER);
        return false;
    }

    public boolean mo988b() {
        return false;
    }
}
