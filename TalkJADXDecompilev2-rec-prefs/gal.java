package p000;

import android.view.View;
import android.view.View.OnClickListener;

final class gal implements OnClickListener {
    boolean f14547a = false;
    final /* synthetic */ gag f14548b;
    final /* synthetic */ gan f14549c;
    final /* synthetic */ gai f14550d;

    gal(gai gai, gag gag, gan gan) {
        this.f14550d = gai;
        this.f14548b = gag;
        this.f14549c = gan;
    }

    public void onClick(View view) {
        if (!this.f14547a) {
            this.f14550d.m7661b(this.f14548b);
            this.f14549c.onClick(view);
            this.f14547a = true;
        }
    }
}
