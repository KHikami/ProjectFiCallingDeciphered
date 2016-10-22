package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import gwb;

public class EmojiCategoryPageIndicatorView extends LinearLayout {
    private final Paint a;
    private final float b;
    private int c;
    private int d;
    private float e;

    public EmojiCategoryPageIndicatorView(Context context) {
        this(context, null);
    }

    public EmojiCategoryPageIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint();
        this.c = 0;
        this.d = 0;
        this.e = 0.0f;
        Resources resources = context.getResources();
        this.a.setColor(resources.getColor(gwb.dM));
        this.b = resources.getDimension(gwb.fn);
    }

    public void a(int i, int i2, float f) {
        this.c = i;
        this.d = i2;
        this.e = f;
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        if (this.c > 1) {
            float width = ((float) getWidth()) / ((float) this.c);
            float f = (((float) this.d) * width) + (this.e * width);
            canvas.drawRect(f, 0.0f, f + width, this.b, this.a);
        }
    }
}
