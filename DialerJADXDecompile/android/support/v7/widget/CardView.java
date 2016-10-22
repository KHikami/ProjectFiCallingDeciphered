package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import buf;
import oe;
import rl;
import wj;
import wk;
import wl;
import wn;
import wo;

/* compiled from: PG */
public class CardView extends FrameLayout {
    private static final int[] g;
    private static final wn h;
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public final Rect e;
    public final Rect f;
    private final wk i;

    static {
        g = new int[]{16842801};
        if (VERSION.SDK_INT >= 21) {
            h = new wj();
        } else if (VERSION.SDK_INT >= 17) {
            h = new wo();
        } else {
            h = new wl();
        }
        h.a();
    }

    public CardView(Context context) {
        super(context);
        this.e = new Rect();
        this.f = new Rect();
        this.i = new wk(this);
        a(context, null, 0);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new Rect();
        this.f = new Rect();
        this.i = new wk(this);
        a(context, attributeSet, 0);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new Rect();
        this.f = new Rect();
        this.i = new wk(this);
        a(context, attributeSet, i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    protected void onMeasure(int i, int i2) {
        if (h instanceof wj) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        switch (mode) {
            case oe.INVALID_ID /*-2147483648*/:
            case 1073741824:
                i = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) h.a(this.i)), MeasureSpec.getSize(i)), mode);
                break;
        }
        mode = MeasureSpec.getMode(i2);
        switch (mode) {
            case oe.INVALID_ID /*-2147483648*/:
            case 1073741824:
                i2 = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) h.b(this.i)), MeasureSpec.getSize(i2)), mode);
                break;
        }
        super.onMeasure(i, i2);
    }

    private final void a(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        int color;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rl.a, i, buf.cm);
        if (obtainStyledAttributes.hasValue(rl.d)) {
            colorStateList = obtainStyledAttributes.getColorStateList(rl.d);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(g);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(buf.ci);
            } else {
                color = getResources().getColor(buf.ch);
            }
            colorStateList = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(rl.e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(rl.f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(rl.g, 0.0f);
        this.a = obtainStyledAttributes.getBoolean(rl.i, false);
        this.b = obtainStyledAttributes.getBoolean(rl.h, true);
        color = obtainStyledAttributes.getDimensionPixelSize(rl.j, 0);
        this.e.left = obtainStyledAttributes.getDimensionPixelSize(rl.l, color);
        this.e.top = obtainStyledAttributes.getDimensionPixelSize(rl.n, color);
        this.e.right = obtainStyledAttributes.getDimensionPixelSize(rl.m, color);
        this.e.bottom = obtainStyledAttributes.getDimensionPixelSize(rl.k, color);
        if (dimension2 > dimension3) {
            dimension3 = dimension2;
        }
        this.c = obtainStyledAttributes.getDimensionPixelSize(rl.c, 0);
        this.d = obtainStyledAttributes.getDimensionPixelSize(rl.b, 0);
        obtainStyledAttributes.recycle();
        h.a(this.i, context, colorStateList, dimension, dimension2, dimension3);
    }

    public void setMinimumWidth(int i) {
        this.c = i;
        super.setMinimumWidth(i);
    }

    public void setMinimumHeight(int i) {
        this.d = i;
        super.setMinimumHeight(i);
    }
}
