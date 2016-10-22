package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: dlv */
final class dlv implements OnClickListener {
    final /* synthetic */ dhu a;
    final /* synthetic */ itl b;
    final /* synthetic */ dlu c;

    dlv(dlu dlu, dhu dhu, itl itl) {
        this.c = dlu;
        this.a = dhu;
        this.b = itl;
    }

    public void onClick(View view) {
        gwb.f(671);
        dhu dhu = this.a;
        String a = this.b.a();
        dim dim = new dim();
        Bundle bundle = new Bundle();
        bundle.putString("key_participant_id", a);
        dim.setArguments(bundle);
        dim.a(dhu.e(), null);
    }
}
