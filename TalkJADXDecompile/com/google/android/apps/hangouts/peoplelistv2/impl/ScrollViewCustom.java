package com.google.android.apps.hangouts.peoplelistv2.impl;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ScrollView;
import com.google.android.apps.common.proguard.UsedByReflection;
import ehw;
import ehx;
import ehy;

public class ScrollViewCustom extends ScrollView {
    public int a;
    public Handler b;
    public boolean c;
    public final Runnable d;
    private int e;
    private ObjectAnimator f;

    public ScrollViewCustom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Integer.MAX_VALUE;
        this.b = new Handler();
        this.d = new ehy(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ehw.ae);
        try {
            this.a = obtainStyledAttributes.getDimensionPixelSize(ehw.af, this.a);
            this.e = obtainStyledAttributes.getDimensionPixelSize(ehw.ag, this.e);
            if (this.f == null) {
                this.f = ObjectAnimator.ofInt(this, "height", new int[]{0, 0});
                this.f.addListener(new ehx(this));
                this.f.setDuration(200);
                this.f.setTarget(this);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void a(int i) {
        this.a = i;
        requestLayout();
    }

    @UsedByReflection
    public void setHeight(int i) {
        LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i;
        setLayoutParams(layoutParams);
        requestLayout();
    }

    protected void onMeasure(int i, int i2) {
        int min = Math.min(this.a, Math.max(this.e, getChildAt(0).getMeasuredHeight()));
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(Math.min(this.a, MeasureSpec.getSize(i2)), MeasureSpec.getMode(i2)));
        if (min != getMeasuredHeight() && !this.c) {
            this.c = true;
            this.f.setIntValues(new int[]{getMeasuredHeight(), min});
            this.f.start();
        }
    }
}
