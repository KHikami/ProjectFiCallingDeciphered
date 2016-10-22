import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class aeg extends MarginLayoutParams {
    public aer c;
    public final Rect d;
    public boolean e;
    boolean f;

    public aeg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public aeg(int i, int i2) {
        super(i, i2);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public aeg(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public aeg(LayoutParams layoutParams) {
        super(layoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public aeg(aeg aeg) {
        super(aeg);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public boolean c() {
        return this.c.k();
    }

    public boolean d() {
        return this.c.n();
    }

    public boolean e() {
        return this.c.u();
    }

    public int f() {
        return this.c.d();
    }
}
