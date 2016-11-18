package p000;

import android.view.View;
import android.widget.ImageView;

final class ego extends eex {
    final /* synthetic */ egj f11451p;
    private final ImageView f11452q;

    public ego(egj egj, View view) {
        this.f11451p = egj;
        super(view);
        this.f11452q = (ImageView) view.findViewById(bm.f3809K);
    }

    public void m13893w() {
        int i;
        if (this.f11451p.f11420b) {
            i = bc.vi;
        } else {
            i = bc.vj;
        }
        this.f11452q.setImageResource(i);
    }
}
