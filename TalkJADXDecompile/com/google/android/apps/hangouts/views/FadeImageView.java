package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import bbl;
import goh;

public class FadeImageView extends ImageView {
    public Animation a;
    public Animation b;
    public BitmapDrawable c;
    private AnimationListener d;
    private int e;
    private int f;
    private float g;

    public FadeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, bbl.G, 0, 0);
        try {
            this.e = obtainStyledAttributes.getInt(bbl.I, 0);
            this.f = obtainStyledAttributes.getInt(bbl.H, 250);
            this.g = obtainStyledAttributes.getFloat(bbl.J, 0.25f);
            this.a = new AlphaAnimation(this.g, 1.0f);
            this.a.setDuration((long) this.f);
            this.b = new AlphaAnimation(1.0f, this.g);
            this.b.setDuration((long) this.e);
            this.d = new goh(this);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void a(boolean z, Bitmap bitmap) {
        this.b.setAnimationListener(null);
        clearAnimation();
        this.c = new BitmapDrawable(getResources(), bitmap);
        if (!z) {
            setBackgroundDrawable(this.c);
        } else if (this.e > 0) {
            this.b.setAnimationListener(this.d);
            startAnimation(this.b);
        } else {
            setBackgroundDrawable(this.c);
            startAnimation(this.a);
        }
    }
}
