package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;

/* renamed from: ehq */
final class ehq implements eeu {
    final /* synthetic */ ehm a;

    ehq(ehm ehm) {
        this.a = ehm;
    }

    public int B() {
        return gwb.ta;
    }

    public int C() {
        return bc.vm;
    }

    public void a(Context context) {
        gwb.a(ehm.a(context), 2503);
        Intent a = gwb.a(ehm.a(context), null, Collections.emptyList(), bcj.CREATE_NEW_GROUP_CONVERSATION, bxt.HANGOUTS_MESSAGE);
        a.putExtra("opened_from_impression", 2148);
        context.startActivity(a);
    }
}
