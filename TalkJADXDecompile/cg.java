import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class cg extends ConstantState {
    int a;
    cf b;
    ColorStateList c;
    Mode d;
    boolean e;
    Bitmap f;
    ColorStateList g;
    Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;

    public cg(cg cgVar) {
        this.c = null;
        this.d = ca.a;
        if (cgVar != null) {
            this.a = cgVar.a;
            this.b = new cf(cgVar.b);
            if (cgVar.b.b != null) {
                this.b.b = new Paint(cgVar.b.b);
            }
            if (cgVar.b.a != null) {
                this.b.a = new Paint(cgVar.b.a);
            }
            this.c = cgVar.c;
            this.d = cgVar.d;
            this.e = cgVar.e;
        }
    }

    public void a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
        canvas.drawBitmap(this.f, null, rect, a(colorFilter));
    }

    private boolean c() {
        return this.b.a() < 255;
    }

    private Paint a(ColorFilter colorFilter) {
        if (!c() && colorFilter == null) {
            return null;
        }
        if (this.l == null) {
            this.l = new Paint();
            this.l.setFilterBitmap(true);
        }
        this.l.setAlpha(this.b.a());
        this.l.setColorFilter(colorFilter);
        return this.l;
    }

    public void a(int i, int i2) {
        this.f.eraseColor(0);
        this.b.a(new Canvas(this.f), i, i2, null);
    }

    public void b(int i, int i2) {
        if (this.f == null || !c(i, i2)) {
            this.f = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
            this.k = true;
        }
    }

    private boolean c(int i, int i2) {
        if (i == this.f.getWidth() && i2 == this.f.getHeight()) {
            return true;
        }
        return false;
    }

    public boolean a() {
        if (!this.k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.b.a()) {
            return true;
        }
        return false;
    }

    public void b() {
        this.g = this.c;
        this.h = this.d;
        this.i = this.b.a();
        this.j = this.e;
        this.k = false;
    }

    public cg() {
        this.c = null;
        this.d = ca.a;
        this.b = new cf();
    }

    public Drawable newDrawable() {
        return new ca(this);
    }

    public Drawable newDrawable(Resources resources) {
        return new ca(this);
    }

    public int getChangingConfigurations() {
        return this.a;
    }
}
