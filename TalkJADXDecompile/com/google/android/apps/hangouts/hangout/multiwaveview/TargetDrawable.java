package com.google.android.apps.hangouts.hangout.multiwaveview;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

public class TargetDrawable {
    private static final boolean DEBUG = false;
    public static final int[] STATE_ACTIVE;
    public static final int[] STATE_FOCUSED;
    public static final int[] STATE_INACTIVE;
    private static final String TAG = "Babel_TargetDrawable";
    private float mAlpha;
    private Drawable mDrawable;
    private boolean mEnabled;
    private float mPositionX;
    private float mPositionY;
    private final int mResourceId;
    private float mScaleX;
    private float mScaleY;
    private float mTranslationX;
    private float mTranslationY;

    static {
        STATE_ACTIVE = new int[]{16842910, 16842914};
        STATE_INACTIVE = new int[]{16842910, -16842914};
        STATE_FOCUSED = new int[]{16842910, -16842914, 16842908};
    }

    public TargetDrawable(Resources resources, int i) {
        this.mTranslationX = 0.0f;
        this.mTranslationY = 0.0f;
        this.mPositionX = 0.0f;
        this.mPositionY = 0.0f;
        this.mScaleX = 1.0f;
        this.mScaleY = 1.0f;
        this.mAlpha = 1.0f;
        this.mEnabled = true;
        this.mResourceId = i;
        setDrawable(resources, i);
    }

    public void setDrawable(Resources resources, int i) {
        Drawable drawable = null;
        Drawable drawable2 = i == 0 ? null : resources.getDrawable(i);
        if (drawable2 != null) {
            drawable = drawable2.mutate();
        }
        this.mDrawable = drawable;
        resizeDrawables();
        setState(STATE_INACTIVE);
    }

    public TargetDrawable(TargetDrawable targetDrawable) {
        this.mTranslationX = 0.0f;
        this.mTranslationY = 0.0f;
        this.mPositionX = 0.0f;
        this.mPositionY = 0.0f;
        this.mScaleX = 1.0f;
        this.mScaleY = 1.0f;
        this.mAlpha = 1.0f;
        this.mEnabled = true;
        this.mResourceId = targetDrawable.mResourceId;
        this.mDrawable = targetDrawable.mDrawable != null ? targetDrawable.mDrawable.mutate() : null;
        resizeDrawables();
        setState(STATE_INACTIVE);
    }

    public void setState(int[] iArr) {
        if (this.mDrawable instanceof StateListDrawable) {
            ((StateListDrawable) this.mDrawable).setState(iArr);
        }
    }

    public boolean hasState(int[] iArr) {
        if (this.mDrawable instanceof StateListDrawable) {
            return true;
        }
        return DEBUG;
    }

    public boolean isActive() {
        if (!(this.mDrawable instanceof StateListDrawable)) {
            return DEBUG;
        }
        int[] state = ((StateListDrawable) this.mDrawable).getState();
        for (int i : state) {
            if (i == 16842908) {
                return true;
            }
        }
        return DEBUG;
    }

    public boolean isEnabled() {
        return (this.mDrawable == null || !this.mEnabled) ? DEBUG : true;
    }

    private void resizeDrawables() {
        if (this.mDrawable != null) {
            this.mDrawable.setBounds(0, 0, this.mDrawable.getIntrinsicWidth(), this.mDrawable.getIntrinsicHeight());
        }
    }

    public void setX(float f) {
        this.mTranslationX = f;
    }

    public void setY(float f) {
        this.mTranslationY = f;
    }

    public void setScaleX(float f) {
        this.mScaleX = f;
    }

    public void setScaleY(float f) {
        this.mScaleY = f;
    }

    public void setAlpha(float f) {
        this.mAlpha = f;
    }

    public float getX() {
        return this.mTranslationX;
    }

    public float getY() {
        return this.mTranslationY;
    }

    public float getScaleX() {
        return this.mScaleX;
    }

    public float getScaleY() {
        return this.mScaleY;
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public void setPositionX(float f) {
        this.mPositionX = f;
    }

    public void setPositionY(float f) {
        this.mPositionY = f;
    }

    public float getPositionX() {
        return this.mPositionX;
    }

    public float getPositionY() {
        return this.mPositionY;
    }

    public int getWidth() {
        return this.mDrawable != null ? this.mDrawable.getIntrinsicWidth() : 0;
    }

    public int getHeight() {
        return this.mDrawable != null ? this.mDrawable.getIntrinsicHeight() : 0;
    }

    public void draw(Canvas canvas) {
        if (this.mDrawable != null && this.mEnabled) {
            canvas.save(1);
            canvas.scale(this.mScaleX, this.mScaleY, this.mPositionX, this.mPositionY);
            canvas.translate(this.mTranslationX + this.mPositionX, this.mTranslationY + this.mPositionY);
            canvas.translate(((float) getWidth()) * -0.5f, ((float) getHeight()) * -0.5f);
            this.mDrawable.setAlpha(Math.round(this.mAlpha * 255.0f));
            this.mDrawable.draw(canvas);
            canvas.restore();
        }
    }

    public void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    public int getResourceId() {
        return this.mResourceId;
    }
}
