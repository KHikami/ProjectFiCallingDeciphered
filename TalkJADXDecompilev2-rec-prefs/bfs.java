package p000;

import android.content.IntentFilter;
import android.graphics.PorterDuff.Mode;
import android.view.View;
import android.view.View.OnClickListener;

final class bfs implements OnClickListener {
    final /* synthetic */ bfr f3232a;

    bfs(bfr bfr) {
        this.f3232a = bfr;
    }

    public void onClick(View view) {
        bfr bfr = this.f3232a;
        bfr.f3231i.m5185a(2247);
        bfr.f3227e.getIndeterminateDrawable().setColorFilter(ia.m10680c(bfr.getContext(), gwb.iT), Mode.SRC_IN);
        bfr.f3227e.bringToFront();
        bfr.f3227e.setVisibility(0);
        bfr.f3230h = new bft(bfr);
        ik.m22097a(bfr.context).m22100a(bfr.f3230h, new IntentFilter("set_callerid_outcome"));
        ((bem) bfr.binder.m25454b(bem.class)).mo506a(bfr.f3225c, true, bfr.f3226d);
    }
}
