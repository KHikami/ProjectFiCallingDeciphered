package p000;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;

final class ehq implements eeu {
    final /* synthetic */ ehm f11510a;

    ehq(ehm ehm) {
        this.f11510a = ehm;
    }

    public int mo1878B() {
        return gwb.ta;
    }

    public int mo1879C() {
        return bc.vm;
    }

    public void mo1880a(Context context) {
        gwb.m1823a(ehm.m13928a(context), 2503);
        Intent a = gwb.m1545a(ehm.m13928a(context), null, Collections.emptyList(), bcj.CREATE_NEW_GROUP_CONVERSATION, bxt.HANGOUTS_MESSAGE);
        a.putExtra("opened_from_impression", 2148);
        context.startActivity(a);
    }
}
