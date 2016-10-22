import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: PG */
public final class vp {
    private final ImageView a;
    private final vi b;

    public vp(ImageView imageView, vi viVar) {
        this.a = imageView;
        this.b = viVar;
    }

    public final void a(AttributeSet attributeSet, int i) {
        aah aah = null;
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null) {
                aah = aah.a(this.a.getContext(), attributeSet, rk.N, i, 0);
                int g = aah.g(rk.O, -1);
                if (g != -1) {
                    drawable = this.b.a(this.a.getContext(), g, false);
                    if (drawable != null) {
                        this.a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                xi.a(drawable);
            }
            if (aah != null) {
                aah.a.recycle();
            }
        } catch (Throwable th) {
            if (null != null) {
                null.a.recycle();
            }
        }
    }

    public final void a(int i) {
        if (i != 0) {
            Drawable a;
            if (this.b != null) {
                a = this.b.a(this.a.getContext(), i, false);
            } else {
                a = gd.a(this.a.getContext(), i);
            }
            if (a != null) {
                xi.a(a);
            }
            this.a.setImageDrawable(a);
            return;
        }
        this.a.setImageDrawable(null);
    }

    final boolean a() {
        Drawable background = this.a.getBackground();
        if (VERSION.SDK_INT < 21 || !(background instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }
}
