package defpackage;

import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.design.widget.Snackbar;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/* compiled from: PG */
/* renamed from: v */
public final class v implements Callback {
    public final boolean handleMessage(Message message) {
        Snackbar snackbar;
        switch (message.what) {
            case rl.c /*0*/:
                snackbar = (Snackbar) message.obj;
                if (snackbar.c.getParent() == null) {
                    LayoutParams layoutParams = snackbar.c.getLayoutParams();
                    if (layoutParams instanceof p) {
                        buf acVar = new ac(snackbar);
                        acVar.e = aj.a(0.0f, 0.1f, 1.0f);
                        acVar.f = aj.a(0.0f, 0.6f, 1.0f);
                        acVar.c = 0;
                        acVar.b = new al(snackbar);
                        ((p) layoutParams).a(acVar);
                    }
                    snackbar.b.addView(snackbar.c);
                }
                snackbar.c.d = new ad(snackbar);
                if (!kn.p(snackbar.c)) {
                    snackbar.c.c = new ae(snackbar);
                } else if (snackbar.d()) {
                    snackbar.b();
                } else {
                    snackbar.c();
                }
                return true;
            case rq.b /*1*/:
                snackbar = (Snackbar) message.obj;
                int i = message.arg1;
                if (!snackbar.d() || snackbar.c.getVisibility() != 0) {
                    snackbar.c(i);
                } else if (VERSION.SDK_INT >= 14) {
                    kn.l(snackbar.c).c((float) snackbar.c.getHeight()).a(c.a).a(250).a(new ab(snackbar, i)).b();
                } else {
                    Animation loadAnimation = AnimationUtils.loadAnimation(snackbar.c.getContext(), 2131034133);
                    loadAnimation.setInterpolator(c.a);
                    loadAnimation.setDuration(250);
                    loadAnimation.setAnimationListener(new w(snackbar, i));
                    snackbar.c.startAnimation(loadAnimation);
                }
                return true;
            default:
                return false;
        }
    }
}
