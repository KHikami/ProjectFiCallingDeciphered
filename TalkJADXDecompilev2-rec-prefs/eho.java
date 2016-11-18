package p000;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;

final class eho implements eev {
    final /* synthetic */ ehm f11508a;

    eho(ehm ehm) {
        this.f11508a = ehm;
    }

    public int mo1878B() {
        return gwb.tb;
    }

    public int mo1879C() {
        return bc.vp;
    }

    public void mo1880a(Context context) {
        gwb.m1823a(ehm.m13928a(context), 2501);
        Intent a = gwb.m1545a(ehm.m13928a(context), null, Collections.emptyList(), bcj.CREATE_NEW_GROUP_CONVERSATION, bxt.SMS_MESSAGE);
        a.putExtra("opened_from_impression", 2148);
        context.startActivity(a);
    }
}
