package p000;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public abstract class azt<Z> extends azy<ImageView, Z> implements ayo {
    private Animatable f2648b;

    public abstract void mo434a(Z z);

    public azt(ImageView imageView) {
        super(imageView);
    }

    public void m4498a(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    public void mo432b(Drawable drawable) {
        super.mo432b(drawable);
        m4497b(null);
        m4498a(drawable);
    }

    public void mo433c(Drawable drawable) {
        super.mo433c(drawable);
        m4497b(null);
        m4498a(drawable);
    }

    public void mo267d(Drawable drawable) {
        super.mo267d(drawable);
        m4497b(null);
        m4498a(drawable);
    }

    public void mo264a(Z z, bac<? super Z> bac__super_Z) {
        m4497b((Object) z);
    }

    public void mo260d() {
        if (this.f2648b != null) {
            this.f2648b.start();
        }
    }

    public void h_() {
        if (this.f2648b != null) {
            this.f2648b.stop();
        }
    }

    private void m4497b(Z z) {
        if (z instanceof Animatable) {
            this.f2648b = (Animatable) z;
            this.f2648b.start();
        } else {
            this.f2648b = null;
        }
        mo434a((Object) z);
    }
}
