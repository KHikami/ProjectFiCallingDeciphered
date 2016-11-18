package p000;

import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.android.apps.hangouts.views.EasterEggView;

public final class gnw implements AnimationListener, bnq {
    ImageView f15749a = null;
    Animation f15750b;
    final /* synthetic */ EasterEggView f15751c;
    private bnn f15752d;
    private gol f15753e;
    private dex f15754f;
    private final azx<Drawable> f15755g = new gnx(this);

    public gnw(EasterEggView easterEggView, gkc gkc, int i) {
        this.f15751c = easterEggView;
        this.f15750b = AnimationUtils.loadAnimation(easterEggView.getContext(), i);
        this.f15750b.setAnimationListener(this);
        this.f15754f = (dex) jyn.m25426a(easterEggView.getContext(), dex.class);
        if (this.f15754f.mo1511c()) {
            this.f15754f.mo1510b(gkc.m5539l(), this.f15755g, new azl(), null);
            return;
        }
        this.f15752d = new bnn(gkc, this, true, null);
        ((fsi) jyn.m25426a(easterEggView.getContext(), fsi.class)).m12718c(this.f15752d);
    }

    public void mo604a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        if (bnn.equals(this.f15752d)) {
            this.f15752d = null;
            if (z) {
                iil.m21875b("Expected non-null", (Object) gjo);
                this.f15749a = new ImageView(this.f15751c.getContext());
                this.f15749a.setScaleType(ScaleType.FIT_CENTER);
                this.f15753e = new gol(gjo);
                this.f15749a.setImageDrawable(this.f15753e);
                this.f15753e.m18218a();
                this.f15749a.startAnimation(this.f15750b);
                this.f15751c.addView(this.f15749a);
                return;
            }
            glk.m17970a("Babel", "Failed to download easter egg image.", new Object[0]);
            this.f15751c.f6966h.remove(this);
        }
    }

    public void m18190a() {
        if (this.f15752d != null) {
            this.f15752d.mo607b();
            this.f15752d = null;
        }
        if (this.f15750b != null) {
            this.f15750b.cancel();
            this.f15750b = null;
        }
        if (this.f15749a != null) {
            this.f15751c.removeView(this.f15749a);
            this.f15749a.clearAnimation();
            this.f15749a.setImageDrawable(null);
            this.f15749a.setImageBitmap(null);
            this.f15749a = null;
        }
        if (this.f15753e != null) {
            this.f15753e.m18224c();
            this.f15753e = null;
        }
    }

    public void onAnimationEnd(Animation animation) {
        if (this.f15749a != null) {
            this.f15749a.setVisibility(8);
        }
        this.f15751c.post(new gny(this, this));
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
