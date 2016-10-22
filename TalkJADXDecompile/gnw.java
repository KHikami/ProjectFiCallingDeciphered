import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.android.apps.hangouts.views.EasterEggView;

public final class gnw implements AnimationListener, bnq {
    ImageView a;
    Animation b;
    final /* synthetic */ EasterEggView c;
    private bnn d;
    private gol e;
    private dex f;
    private final azx<Drawable> g;

    public gnw(EasterEggView easterEggView, gkc gkc, int i) {
        this.c = easterEggView;
        this.g = new gnx(this);
        this.a = null;
        this.b = AnimationUtils.loadAnimation(easterEggView.getContext(), i);
        this.b.setAnimationListener(this);
        this.f = (dex) jyn.a(easterEggView.getContext(), dex.class);
        if (this.f.c()) {
            this.f.b(gkc.l(), this.g, new azl(), null);
            return;
        }
        this.d = new bnn(gkc, this, true, null);
        ((fsi) jyn.a(easterEggView.getContext(), fsi.class)).c(this.d);
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        if (bnn.equals(this.d)) {
            this.d = null;
            if (z) {
                iil.b("Expected non-null", (Object) gjo);
                this.a = new ImageView(this.c.getContext());
                this.a.setScaleType(ScaleType.FIT_CENTER);
                this.e = new gol(gjo);
                this.a.setImageDrawable(this.e);
                this.e.a();
                this.a.startAnimation(this.b);
                this.c.addView(this.a);
                return;
            }
            glk.a("Babel", "Failed to download easter egg image.", new Object[0]);
            this.c.h.remove(this);
        }
    }

    public void a() {
        if (this.d != null) {
            this.d.b();
            this.d = null;
        }
        if (this.b != null) {
            this.b.cancel();
            this.b = null;
        }
        if (this.a != null) {
            this.c.removeView(this.a);
            this.a.clearAnimation();
            this.a.setImageDrawable(null);
            this.a.setImageBitmap(null);
            this.a = null;
        }
        if (this.e != null) {
            this.e.c();
            this.e = null;
        }
    }

    public void onAnimationEnd(Animation animation) {
        if (this.a != null) {
            this.a.setVisibility(8);
        }
        this.c.post(new gny(this, this));
    }

    public void onAnimationStart(Animation animation) {
    }

    public void onAnimationRepeat(Animation animation) {
    }
}
