package p000;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.google.android.apps.hangouts.views.RichStatusView;

final class gqu implements AnimationListener {
    final /* synthetic */ gqt f15934a;
    private final boolean f15935b;

    gqu(gqt gqt, boolean z) {
        this.f15934a = gqt;
        this.f15935b = z;
    }

    public void onAnimationEnd(Animation animation) {
        if (!this.f15935b) {
            int i;
            this.f15934a.f15930b.setVisibility(8);
            RichStatusView richStatusView = this.f15934a.f15933e;
            for (i = 0; i < 3; i++) {
                if (richStatusView.f7184a[i].f15930b.getVisibility() == 0) {
                    i = 1;
                    break;
                }
            }
            i = 0;
            if (i != 0) {
                richStatusView.setVisibility(0);
            } else {
                richStatusView.setVisibility(8);
            }
        }
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
