package defpackage;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.google.android.apps.hangouts.views.RichStatusView;

/* renamed from: gqu */
final class gqu implements AnimationListener {
    final /* synthetic */ gqt a;
    private final boolean b;

    gqu(gqt gqt, boolean z) {
        this.a = gqt;
        this.b = z;
    }

    public void onAnimationEnd(Animation animation) {
        if (!this.b) {
            int i;
            this.a.b.setVisibility(8);
            RichStatusView richStatusView = this.a.e;
            for (i = 0; i < 3; i++) {
                if (richStatusView.a[i].b.getVisibility() == 0) {
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
