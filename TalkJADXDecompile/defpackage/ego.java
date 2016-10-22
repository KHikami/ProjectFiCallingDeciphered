package defpackage;

import android.view.View;
import android.widget.ImageView;

/* renamed from: ego */
final class ego extends eex {
    final /* synthetic */ egj p;
    private final ImageView q;

    public ego(egj egj, View view) {
        this.p = egj;
        super(view);
        this.q = (ImageView) view.findViewById(bm.K);
    }

    public void w() {
        int i;
        if (this.p.b) {
            i = bc.vi;
        } else {
            i = bc.vj;
        }
        this.q.setImageResource(i);
    }
}
