import android.graphics.Bitmap;

public final class fv extends gl {
    Bitmap a;
    Bitmap b;
    boolean c;

    public fv(fx fxVar) {
        a(fxVar);
    }

    public fv a(CharSequence charSequence) {
        this.f = fx.d(charSequence);
        this.g = true;
        return this;
    }

    public fv a(Bitmap bitmap) {
        this.a = bitmap;
        return this;
    }
}
