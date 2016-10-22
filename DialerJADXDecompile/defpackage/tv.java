package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;

/* compiled from: PG */
/* renamed from: tv */
public class tv extends Drawable {
    final ActionBarContainer a;

    public tv(ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        if (!this.a.f) {
            if (this.a.c != null) {
                this.a.c.draw(canvas);
            }
            if (this.a.d != null && this.a.g) {
                this.a.d.draw(canvas);
            }
        } else if (this.a.e != null) {
            this.a.e.draw(canvas);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int getOpacity() {
        return 0;
    }
}
