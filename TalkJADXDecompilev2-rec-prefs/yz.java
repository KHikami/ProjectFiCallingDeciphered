package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;

public class yz extends Drawable {
    final ActionBarContainer f35877a;

    public yz(ActionBarContainer actionBarContainer) {
        this.f35877a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        if (!this.f35877a.d) {
            if (this.f35877a.a != null) {
                this.f35877a.a.draw(canvas);
            }
            if (this.f35877a.b != null && this.f35877a.e) {
                this.f35877a.b.draw(canvas);
            }
        } else if (this.f35877a.c != null) {
            this.f35877a.c.draw(canvas);
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
