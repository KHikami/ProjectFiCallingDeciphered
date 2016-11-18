package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;

final class ehn implements eew {
    final /* synthetic */ ehm a;

    ehn(ehm ehm) {
        this.a = ehm;
    }

    public int B() {
        return gwb.tc;
    }

    public int C() {
        return bc.vq;
    }

    public void a(Context context) {
        gwb.a(ehm.a(context), 2500);
        Intent a = gwb.a(ehm.a(context), null, Collections.emptyList(), bcj.CREATE_NEW_HANGOUT, bxt.VIDEO_CALL);
        a.putExtra("opened_from_impression", 2148);
        context.startActivity(a);
    }
}
