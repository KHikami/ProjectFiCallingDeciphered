import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.view.View;

/* compiled from: PG */
public class wk {
    Drawable a;
    final /* synthetic */ CardView b;

    public void a(Drawable drawable) {
        this.a = drawable;
        this.b.setBackgroundDrawable(drawable);
    }

    public Drawable a() {
        return this.a;
    }

    public boolean b() {
        return this.b.a;
    }

    public boolean c() {
        return this.b.b;
    }

    public void a(int i, int i2, int i3, int i4) {
        this.b.f.set(i, i2, i3, i4);
        super.setPadding(this.b.e.left + i, this.b.e.top + i2, this.b.e.right + i3, this.b.e.bottom + i4);
    }

    public void a(int i, int i2) {
        if (i > this.b.c) {
            super.setMinimumWidth(i);
        }
        if (i2 > this.b.d) {
            super.setMinimumHeight(i2);
        }
    }

    public View d() {
        return this.b;
    }

    public wk(CardView cardView) {
        this.b = cardView;
    }
}
