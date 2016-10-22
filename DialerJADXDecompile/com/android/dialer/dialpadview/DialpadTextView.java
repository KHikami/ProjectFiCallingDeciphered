package com.android.dialer.dialpadview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: PG */
public class DialpadTextView extends TextView {
    private Rect a;
    private String b;

    public DialpadTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
    }

    public void draw(Canvas canvas) {
        Paint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        canvas.drawText(this.b, (float) (-this.a.left), (float) (-this.a.top), paint);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.b = getText().toString();
        getPaint().getTextBounds(this.b, 0, this.b.length(), this.a);
        setMeasuredDimension(resolveSize(this.a.width(), i), resolveSize(this.a.height(), i2));
    }
}
