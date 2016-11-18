package defpackage;

import android.content.IntentFilter;
import android.graphics.PorterDuff.Mode;
import android.view.View;
import android.view.View.OnClickListener;

final class bfs implements OnClickListener {
    final /* synthetic */ bfr a;

    bfs(bfr bfr) {
        this.a = bfr;
    }

    public void onClick(View view) {
        bfr bfr = this.a;
        bfr.i.a(2247);
        bfr.e.getIndeterminateDrawable().setColorFilter(ia.c(bfr.getContext(), gwb.iT), Mode.SRC_IN);
        bfr.e.bringToFront();
        bfr.e.setVisibility(0);
        bfr.h = new bft(bfr);
        ik.a(bfr.context).a(bfr.h, new IntentFilter("set_callerid_outcome"));
        ((bem) bfr.binder.b(bem.class)).a(bfr.c, true, bfr.d);
    }
}
