package com.google.android.apps.hangouts.floatingactionbutton.impl;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import cyg;
import cyh;

public class QuickButtonContainer extends FrameLayout {
    public boolean a;
    public boolean b;
    public Animator c;
    public int d;
    public AnimatorListener e;
    private AnimatorUpdateListener f;

    public QuickButtonContainer(Context context) {
        super(context);
        this.f = new cyg(this);
        this.e = new cyh(this);
    }

    public QuickButtonContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new cyg(this);
        this.e = new cyh(this);
    }

    public QuickButtonContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new cyg(this);
        this.e = new cyh(this);
    }

    public QuickButtonContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f = new cyg(this);
        this.e = new cyh(this);
    }

    public AnimatorUpdateListener a() {
        return this.f;
    }

    public AnimatorListener b() {
        return this.e;
    }

    public boolean isClickable() {
        return getVisibility() != 8;
    }
}
