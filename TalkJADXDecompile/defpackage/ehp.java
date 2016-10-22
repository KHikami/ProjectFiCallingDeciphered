package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;

/* renamed from: ehp */
final class ehp implements eet {
    final /* synthetic */ ehm a;

    ehp(ehm ehm) {
        this.a = ehm;
    }

    public int B() {
        return gwb.sY;
    }

    public int C() {
        return bc.vg;
    }

    public void a(Context context) {
        gwb.a(ehm.a(context), 2502);
        Intent a = gwb.a(ehm.a(context), null, Collections.emptyList(), bcj.CREATE_NEW_ONE_ON_ONE, bxt.HANGOUTS_MESSAGE);
        a.putExtra("opened_from_impression", 2148);
        context.startActivity(a);
    }
}
