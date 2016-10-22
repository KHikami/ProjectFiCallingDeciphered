import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

/* compiled from: PG */
final class bt extends ConstantState {
    int a;
    bs b;
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

    public bt(bt btVar) {
        this.c = null;
        this.d = bn.a;
        if (btVar != null) {
            this.a = btVar.a;
            this.b = new bs(btVar.b);
            if (btVar.b.b != null) {
                this.b.b = new Paint(btVar.b.b);
            }
            if (btVar.b.a != null) {
                this.b.a = new Paint(btVar.b.a);
            }
            this.c = btVar.c;
            this.d = btVar.d;
            this.e = btVar.e;
        }
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        this.b.a(new Canvas(this.f), i, i2, null);
    }

    public bt() {
        this.c = null;
        this.d = bn.a;
        this.b = new bs();
    }

    public final Drawable newDrawable() {
        return new bn(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return new bn(this);
    }

    public final int getChangingConfigurations() {
        return this.a;
    }
}
