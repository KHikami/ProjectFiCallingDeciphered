package p000;

import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.design.widget.Snackbar;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public final class al implements Callback {
    public boolean handleMessage(Message message) {
        Snackbar snackbar;
        switch (message.what) {
            case 0:
                snackbar = (Snackbar) message.obj;
                if (snackbar.f1502c.getParent() == null) {
                    LayoutParams layoutParams = snackbar.f1502c.getLayoutParams();
                    if (layoutParams instanceof ae) {
                        ae aeVar = (ae) layoutParams;
                        gwb arVar = new ar(snackbar);
                        arVar.m3807a(0.1f);
                        arVar.m3811b(0.6f);
                        arVar.m3808a(0);
                        arVar.m3809a(new aw(snackbar));
                        aeVar.m761a(arVar);
                        aeVar.f370g = 80;
                    }
                    snackbar.f1501b.addView(snackbar.f1502c);
                }
                snackbar.f1502c.m3144a(new jrh(snackbar));
                if (!oa.q(snackbar.f1502c)) {
                    snackbar.f1502c.m3145a(new ljl(snackbar));
                } else if (snackbar.m3152d()) {
                    snackbar.m3150b();
                } else {
                    snackbar.m3151c();
                }
                return true;
            case 1:
                snackbar = (Snackbar) message.obj;
                int i = message.arg1;
                if (!snackbar.m3152d() || snackbar.f1502c.getVisibility() != 0) {
                    snackbar.m3148a(i);
                } else if (VERSION.SDK_INT >= 14) {
                    oa.m(snackbar.f1502c).c((float) snackbar.f1502c.getHeight()).a(r.b).a(250).a(new aq(snackbar, i)).c();
                } else {
                    Animation loadAnimation = AnimationUtils.loadAnimation(snackbar.f1502c.getContext(), eid.f11584e);
                    loadAnimation.setInterpolator(r.b);
                    loadAnimation.setDuration(250);
                    loadAnimation.setAnimationListener(new am(snackbar, i));
                    snackbar.f1502c.startAnimation(loadAnimation);
                }
                return true;
            default:
                return false;
        }
    }
}
