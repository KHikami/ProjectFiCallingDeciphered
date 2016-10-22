package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: PG */
/* renamed from: aew */
public final class aew extends LinearLayout {
    public int a;
    public float b;
    private final Paint c;
    private int d;

    public aew(Context context) {
        this(context, null);
    }

    private aew(Context context, AttributeSet attributeSet) {
        super(context, null);
        Resources resources = context.getResources();
        this.d = resources.getDimensionPixelSize(buf.cZ);
        int color = resources.getColor(buf.cJ);
        int color2 = resources.getColor(buf.cB);
        this.c = new Paint();
        this.c.setColor(color);
        setBackgroundColor(color2);
        setWillNotDraw(false);
    }

    protected final void onDraw(Canvas canvas) {
        int i = 0;
        int i2 = 1;
        if (getChildCount() > 0) {
            View childAt = getChildAt(this.a);
            if (childAt != null) {
                int i3;
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (getLayoutDirection() == 1) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (i3 != 0) {
                    if (this.a > 0) {
                        i = 1;
                    }
                } else if (this.a < getChildCount() - 1) {
                    i = 1;
                }
                if (this.b <= 0.0f || r0 == 0) {
                    i = right;
                    i2 = left;
                } else {
                    i = this.a;
                    if (i3 != 0) {
                        i2 = -1;
                    }
                    View childAt2 = getChildAt(i + i2);
                    i2 = childAt2.getLeft();
                    i2 = (int) ((((float) i2) * this.b) + (((float) left) * (1.0f - this.b)));
                    i = (int) ((((float) childAt2.getRight()) * this.b) + (((float) right) * (1.0f - this.b)));
                }
                i3 = getHeight();
                canvas.drawRect((float) i2, (float) (i3 - this.d), (float) i, (float) i3, this.c);
            }
        }
    }
}
