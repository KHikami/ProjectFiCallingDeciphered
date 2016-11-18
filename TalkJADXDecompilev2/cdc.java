package defpackage;

import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

final class cdc implements Runnable {
    final /* synthetic */ ccz a;

    cdc(ccz ccz) {
        this.a = ccz;
    }

    public void run() {
        ccz ccz = this.a;
        if (ccz.getView() != null) {
            ccz.c.b();
            FrameLayout frameLayout = (FrameLayout) ccz.getView().findViewById(gwb.lp);
            LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.height = ccz.d;
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.setVisibility(0);
            ccz.c(ccz.b);
            ccz.d().setStripEnabled(true);
        }
    }
}
