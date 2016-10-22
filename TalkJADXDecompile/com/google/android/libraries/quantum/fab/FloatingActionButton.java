package com.google.android.libraries.quantum.fab;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import gwb;
import jbv;
import wi;

public class FloatingActionButton extends ImageView {
    private int a;
    private int b;
    private int c;

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jbv.aa, i, gwb.yi);
        int color = obtainStyledAttributes.getColor(jbv.ac, 0);
        int color2 = obtainStyledAttributes.getColor(jbv.ad, 0);
        int i2 = obtainStyledAttributes.getInt(jbv.ae, 0);
        if (VERSION.SDK_INT >= 21) {
            setElevation(obtainStyledAttributes.getDimension(jbv.ab, 0.0f));
        }
        a(color, color2);
        a(i2);
        obtainStyledAttributes.recycle();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        setStateListAnimator(gwb.B((View) this));
    }

    public void a(int i) {
        int dimensionPixelSize;
        Resources resources = getResources();
        switch (i) {
            case wi.j /*1*/:
                this.a = resources.getDimensionPixelSize(gwb.yf);
                dimensionPixelSize = resources.getDimensionPixelSize(gwb.yh);
                break;
            default:
                this.a = resources.getDimensionPixelSize(gwb.ye);
                dimensionPixelSize = resources.getDimensionPixelSize(gwb.yg);
                break;
        }
        setScaleType(ScaleType.CENTER_INSIDE);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        requestLayout();
    }

    public LayoutParams getLayoutParams() {
        LayoutParams layoutParams = super.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.a;
            layoutParams.width = this.a;
        }
        return layoutParams;
    }

    public void b(int i) {
        a(i, this.c);
    }

    public void a(int i, int i2) {
        if (this.b != i || this.c != i2) {
            this.b = i;
            this.c = i2;
            Drawable b = b(i, i2);
            int paddingTop = getPaddingTop();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            setBackgroundDrawable(b);
            setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }

    private static Drawable b(int i, int i2) {
        GradientDrawable c = c(i);
        try {
            return (Drawable) Class.forName("android.graphics.drawable.RippleDrawable").getConstructor(new Class[]{ColorStateList.class, Drawable.class, Drawable.class}).newInstance(new Object[]{ColorStateList.valueOf(i2), c, null});
        } catch (Exception e) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, c(i2));
            stateListDrawable.addState(new int[0], c(17170445));
            return new LayerDrawable(new Drawable[]{c, stateListDrawable});
        }
    }

    private static GradientDrawable c(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }
}
