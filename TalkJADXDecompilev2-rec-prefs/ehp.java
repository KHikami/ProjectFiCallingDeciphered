package p000;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;

final class ehp implements eet {
    final /* synthetic */ ehm f11509a;

    ehp(ehm ehm) {
        this.f11509a = ehm;
    }

    public int mo1878B() {
        return gwb.sY;
    }

    public int mo1879C() {
        return bc.vg;
    }

    public void mo1880a(Context context) {
        gwb.m1823a(ehm.m13928a(context), 2502);
        Intent a = gwb.m1545a(ehm.m13928a(context), null, Collections.emptyList(), bcj.CREATE_NEW_ONE_ON_ONE, bxt.HANGOUTS_MESSAGE);
        a.putExtra("opened_from_impression", 2148);
        context.startActivity(a);
    }
}
