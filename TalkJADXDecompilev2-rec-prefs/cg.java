package p000;

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
    int f5217a;
    cf f5218b;
    ColorStateList f5219c;
    Mode f5220d;
    boolean f5221e;
    Bitmap f5222f;
    ColorStateList f5223g;
    Mode f5224h;
    int f5225i;
    boolean f5226j;
    boolean f5227k;
    Paint f5228l;

    public cg(cg cgVar) {
        this.f5219c = null;
        this.f5220d = ca.f4883a;
        if (cgVar != null) {
            this.f5217a = cgVar.f5217a;
            this.f5218b = new cf(cgVar.f5218b);
            if (cgVar.f5218b.f5146b != null) {
                this.f5218b.f5146b = new Paint(cgVar.f5218b.f5146b);
            }
            if (cgVar.f5218b.f5145a != null) {
                this.f5218b.f5145a = new Paint(cgVar.f5218b.f5145a);
            }
            this.f5219c = cgVar.f5219c;
            this.f5220d = cgVar.f5220d;
            this.f5221e = cgVar.f5221e;
        }
    }

    public void m7503a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
        canvas.drawBitmap(this.f5222f, null, rect, m7499a(colorFilter));
    }

    private boolean m7500c() {
        return this.f5218b.m7479a() < 255;
    }

    private Paint m7499a(ColorFilter colorFilter) {
        if (!m7500c() && colorFilter == null) {
            return null;
        }
        if (this.f5228l == null) {
            this.f5228l = new Paint();
            this.f5228l.setFilterBitmap(true);
        }
        this.f5228l.setAlpha(this.f5218b.m7479a());
        this.f5228l.setColorFilter(colorFilter);
        return this.f5228l;
    }

    public void m7502a(int i, int i2) {
        this.f5222f.eraseColor(0);
        this.f5218b.m7482a(new Canvas(this.f5222f), i, i2, null);
    }

    public void m7506b(int i, int i2) {
        if (this.f5222f == null || !m7501c(i, i2)) {
            this.f5222f = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
            this.f5227k = true;
        }
    }

    private boolean m7501c(int i, int i2) {
        if (i == this.f5222f.getWidth() && i2 == this.f5222f.getHeight()) {
            return true;
        }
        return false;
    }

    public boolean m7504a() {
        if (!this.f5227k && this.f5223g == this.f5219c && this.f5224h == this.f5220d && this.f5226j == this.f5221e && this.f5225i == this.f5218b.m7479a()) {
            return true;
        }
        return false;
    }

    public void m7505b() {
        this.f5223g = this.f5219c;
        this.f5224h = this.f5220d;
        this.f5225i = this.f5218b.m7479a();
        this.f5226j = this.f5221e;
        this.f5227k = false;
    }

    public cg() {
        this.f5219c = null;
        this.f5220d = ca.f4883a;
        this.f5218b = new cf();
    }

    public Drawable newDrawable() {
        return new ca(this);
    }

    public Drawable newDrawable(Resources resources) {
        return new ca(this);
    }

    public int getChangingConfigurations() {
        return this.f5217a;
    }
}
