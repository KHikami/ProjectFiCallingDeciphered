package p000;

import android.view.View;
import android.view.View.OnClickListener;

final class dtw implements OnClickListener {
    final /* synthetic */ String f10518a;
    final /* synthetic */ dtv f10519b;

    dtw(dtv dtv, String str) {
        this.f10519b = dtv;
        this.f10518a = str;
    }

    public void onClick(View view) {
        this.f10519b.getContext().startActivity(gwb.m1375C(this.f10518a));
    }
}
