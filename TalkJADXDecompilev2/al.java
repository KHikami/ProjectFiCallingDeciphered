package defpackage;

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
                if (snackbar.c.getParent() == null) {
                    LayoutParams layoutParams = snackbar.c.getLayoutParams();
                    if (layoutParams instanceof ae) {
                        ae aeVar = (ae) layoutParams;
                        gwb arVar = new ar(snackbar);
                        arVar.a(0.1f);
                        arVar.b(0.6f);
                        arVar.a(0);
                        arVar.a(new aw(snackbar));
                        aeVar.a(arVar);
                        aeVar.g = 80;
                    }
                    snackbar.b.addView(snackbar.c);
                }
                snackbar.c.a(new jrh(snackbar));
                if (!oa.q(snackbar.c)) {
                    snackbar.c.a(new ljl(snackbar));
                } else if (snackbar.d()) {
                    snackbar.b();
                } else {
                    snackbar.c();
                }
                return true;
            case 1:
                snackbar = (Snackbar) message.obj;
                int i = message.arg1;
                if (!snackbar.d() || snackbar.c.getVisibility() != 0) {
                    snackbar.a(i);
                } else if (VERSION.SDK_INT >= 14) {
                    oa.m(snackbar.c).c((float) snackbar.c.getHeight()).a(r.b).a(250).a(new aq(snackbar, i)).c();
                } else {
                    Animation loadAnimation = AnimationUtils.loadAnimation(snackbar.c.getContext(), eid.e);
                    loadAnimation.setInterpolator(r.b);
                    loadAnimation.setDuration(250);
                    loadAnimation.setAnimationListener(new am(snackbar, i));
                    snackbar.c.startAnimation(loadAnimation);
                }
                return true;
            default:
                return false;
        }
    }
}
