package p000;

import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

final class cdc implements Runnable {
    final /* synthetic */ ccz f5053a;

    cdc(ccz ccz) {
        this.f5053a = ccz;
    }

    public void run() {
        ccz ccz = this.f5053a;
        if (ccz.getView() != null) {
            ccz.f5031c.mo896b();
            FrameLayout frameLayout = (FrameLayout) ccz.getView().findViewById(gwb.lp);
            LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.height = ccz.f5032d;
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.setVisibility(0);
            ccz.m7246c(ccz.f5030b);
            ccz.m7247d().setStripEnabled(true);
        }
    }
}
