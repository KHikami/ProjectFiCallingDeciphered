package p000;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

final class dlv implements OnClickListener {
    final /* synthetic */ dhu f10093a;
    final /* synthetic */ itl f10094b;
    final /* synthetic */ dlu f10095c;

    dlv(dlu dlu, dhu dhu, itl itl) {
        this.f10095c = dlu;
        this.f10093a = dhu;
        this.f10094b = itl;
    }

    public void onClick(View view) {
        gwb.m2198f(671);
        dhu dhu = this.f10093a;
        String a = this.f10094b.m23229a();
        dim dim = new dim();
        Bundle bundle = new Bundle();
        bundle.putString("key_participant_id", a);
        dim.setArguments(bundle);
        dim.mo2341a(dhu.m11855e(), null);
    }
}
