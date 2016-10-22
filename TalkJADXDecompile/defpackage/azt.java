package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: azt */
public abstract class azt<Z> extends azy<ImageView, Z> implements ayo {
    private Animatable b;

    public abstract void a(Z z);

    public azt(ImageView imageView) {
        super(imageView);
    }

    public void a(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    public void b(Drawable drawable) {
        super.b(drawable);
        b(null);
        a(drawable);
    }

    public void c(Drawable drawable) {
        super.c(drawable);
        b(null);
        a(drawable);
    }

    public void d(Drawable drawable) {
        super.d(drawable);
        b(null);
        a(drawable);
    }

    public void a(Z z, bac<? super Z> bac__super_Z) {
        b((Object) z);
    }

    public void d() {
        if (this.b != null) {
            this.b.start();
        }
    }

    public void h_() {
        if (this.b != null) {
            this.b.stop();
        }
    }

    private void b(Z z) {
        if (z instanceof Animatable) {
            this.b = (Animatable) z;
            this.b.start();
        } else {
            this.b = null;
        }
        a((Object) z);
    }
}
