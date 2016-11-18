package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;

public final class cmc extends LinearLayout {
    private final int f5619a;
    private final int f5620b;
    private final Paint f5621c;
    private final int f5622d;
    private final Paint f5623e;
    private int f5624f;
    private float f5625g;

    public cmc(Context context, int i) {
        this(context, null, i);
    }

    private cmc(Context context, AttributeSet attributeSet, int i) {
        super(context, null);
        setWillNotDraw(false);
        this.f5619a = i;
        float f = getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842800, typedValue, true);
        int i2 = typedValue.data;
        this.f5620b = (int) (0.0f * f);
        this.f5621c = new Paint();
        this.f5621c.setColor(Color.argb(38, Color.red(i2), Color.green(i2), Color.blue(i2)));
        this.f5622d = (int) (f * 3.0f);
        this.f5623e = new Paint();
        this.f5623e.setColor(getResources().getColor(gwb.nj));
    }

    void m7905a(int i, float f) {
        this.f5624f = i;
        this.f5625g = f;
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        int height = getHeight();
        if (getChildCount() > 0) {
            View childAt = getChildAt(this.f5624f);
            int left = childAt.getLeft();
            int right = childAt.getRight();
            if (this.f5625g > 0.0f && this.f5624f < getChildCount() - 1) {
                View childAt2 = getChildAt(this.f5624f + 1);
                left = (int) ((((float) left) * (1.0f - this.f5625g)) + (this.f5625g * ((float) childAt2.getLeft())));
                right = (int) ((((float) right) * (1.0f - this.f5625g)) + (((float) childAt2.getRight()) * this.f5625g));
            }
            canvas.drawRect((float) left, (float) (height - this.f5622d), (float) right, (float) height, this.f5623e);
        }
        if (this.f5619a == 0) {
            canvas.drawRect(0.0f, (float) (height - this.f5620b), (float) getWidth(), (float) height, this.f5621c);
        } else if (this.f5619a == 1) {
            canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) this.f5620b, this.f5621c);
        }
    }
}
