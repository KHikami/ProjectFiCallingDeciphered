package com.google.android.apps.hangouts.floatingactionbutton.impl;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Interpolator;
import bbx;
import bcb;
import cxq;
import cxr;
import cxs;
import cxt;
import cxu;
import gwb;

public class FloatingActionButton extends View {
    public cxt a;
    public int b;
    public Bitmap c;
    public int d;
    public Bitmap e;
    public float f;
    public int g;
    private ValueAnimator h;
    private Interpolator i;
    private AnimatorUpdateListener j;
    private AnimatorListener k;
    private OnClickListener l;

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 0;
        this.d = -1;
        this.j = new cxq(this);
        this.k = new cxr(this);
        this.l = new cxs(this);
        if (VERSION.SDK_INT >= 21) {
            a(context);
        }
        setOnClickListener(this.l);
        this.i = new bbx(bcb.a);
        this.h = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.h.setInterpolator(this.i);
        this.h.setDuration((long) getResources().getInteger(gwb.pL));
        this.h.setStartDelay(0);
        this.h.addUpdateListener(this.j);
        this.h.addListener(this.k);
    }

    public void a(Context context) {
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, gwb.pu));
    }

    public Animator a(int i, int i2, int i3) {
        setContentDescription(getResources().getText(i2));
        this.g = i3;
        if (i != this.b) {
            if (this.h.isRunning()) {
                this.h.cancel();
            }
            this.f = 0.0f;
            if (i3 == cxu.a) {
                this.d = i;
                this.e = ((BitmapDrawable) getResources().getDrawable(i)).getBitmap();
                this.h.start();
            } else {
                this.d = this.b;
                this.e = this.c;
                this.b = i;
                this.c = ((BitmapDrawable) getResources().getDrawable(i)).getBitmap();
                this.h.reverse();
            }
        }
        return this.h;
    }

    public void a(int i, int i2) {
        setContentDescription(getResources().getText(i2));
        a(i);
    }

    private void a(int i) {
        if (this.h.isRunning()) {
            this.h.cancel();
        }
        this.f = 0.0f;
        this.d = -1;
        this.e = null;
        this.b = i;
        this.c = ((BitmapDrawable) getResources().getDrawable(i)).getBitmap();
        invalidate();
    }

    public void a(int i, int i2, int i3, int i4, float f) {
        Resources resources = getResources();
        if (f >= 0.5f) {
            i2 = i4;
        }
        setContentDescription(resources.getText(i2));
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("fraction argument to transitionPartlyBetween should be between 0.0 and 1.0");
        }
        if (this.h.isRunning()) {
            this.h.cancel();
        }
        if (f < 0.001f) {
            a(i);
        } else if (1.0f - f < 0.001f) {
            a(i3);
        } else {
            this.f = this.i.getInterpolation(f);
            this.b = i;
            this.c = ((BitmapDrawable) getResources().getDrawable(i)).getBitmap();
            this.d = i3;
            this.e = ((BitmapDrawable) getResources().getDrawable(i3)).getBitmap();
            this.g = cxu.a;
            invalidate();
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c != null) {
            a(canvas, this.c, this.f, 135);
        }
        if (this.e != null) {
            a(canvas, this.e, 1.0f - this.f, -135);
        }
    }

    private void a(Canvas canvas, Bitmap bitmap, float f, int i) {
        Shader bitmapShader = new BitmapShader(bitmap, TileMode.CLAMP, TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        Matrix matrix = new Matrix();
        matrix.preRotate(((float) i) * f, ((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
        paint.setAlpha((int) ((1.0f - f) * 255.0f));
        matrix.postTranslate(((float) (getWidth() - bitmap.getWidth())) / 2.0f, ((float) (getHeight() - bitmap.getHeight())) / 2.0f);
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    public void a(cxt cxt) {
        this.a = cxt;
    }

    public void a(AnimatorUpdateListener animatorUpdateListener) {
        this.h.addUpdateListener(animatorUpdateListener);
    }

    public void a(AnimatorListener animatorListener) {
        this.h.addListener(animatorListener);
    }
}
