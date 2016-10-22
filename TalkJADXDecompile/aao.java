import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class aao {
    private final ImageView a;

    public aao(ImageView imageView) {
        this.a = imageView;
    }

    public void a(AttributeSet attributeSet, int i) {
        afp afp = null;
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null) {
                afp = afp.a(this.a.getContext(), attributeSet, wi.P, i, 0);
                int g = afp.g(wi.Q, -1);
                if (g != -1) {
                    drawable = wk.b(this.a.getContext(), g);
                    if (drawable != null) {
                        this.a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                aci.b(drawable);
            }
            if (afp != null) {
                afp.a();
            }
        } catch (Throwable th) {
            if (afp != null) {
                afp.a();
            }
        }
    }

    public void a(int i) {
        if (i != 0) {
            Drawable b = wk.b(this.a.getContext(), i);
            if (b != null) {
                aci.b(b);
            }
            this.a.setImageDrawable(b);
            return;
        }
        this.a.setImageDrawable(null);
    }

    boolean a() {
        Drawable background = this.a.getBackground();
        if (VERSION.SDK_INT < 21 || !(background instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }
}
