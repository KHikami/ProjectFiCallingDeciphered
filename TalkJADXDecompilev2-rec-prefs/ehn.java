package p000;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;

final class ehn implements eew {
    final /* synthetic */ ehm f11507a;

    ehn(ehm ehm) {
        this.f11507a = ehm;
    }

    public int mo1878B() {
        return gwb.tc;
    }

    public int mo1879C() {
        return bc.vq;
    }

    public void mo1880a(Context context) {
        gwb.m1823a(ehm.m13928a(context), 2500);
        Intent a = gwb.m1545a(ehm.m13928a(context), null, Collections.emptyList(), bcj.CREATE_NEW_HANGOUT, bxt.VIDEO_CALL);
        a.putExtra("opened_from_impression", 2148);
        context.startActivity(a);
    }
}
