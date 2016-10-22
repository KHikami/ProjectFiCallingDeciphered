package com.android.incallui.widget.multiwaveview;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

/* compiled from: PG */
public class TargetDrawable {
    private static final boolean DEBUG = false;
    public static final int[] STATE_ACTIVE;
    public static final int[] STATE_FOCUSED;
    public static final int[] STATE_INACTIVE;
    private static final String TAG = "TargetDrawable";
    private float mAlpha;
    private Rect mBounds;
    private Drawable mDrawable;
    private boolean mEnabled;
    private int mNumDrawables;
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

    public TargetDrawable(Resources resources, int i, int i2) {
        this.mTranslationX = 0.0f;
        this.mTranslationY = 0.0f;
        this.mPositionX = 0.0f;
        this.mPositionY = 0.0f;
        this.mScaleX = 1.0f;
        this.mScaleY = 1.0f;
        this.mAlpha = 1.0f;
        this.mEnabled = true;
        this.mNumDrawables = 1;
        this.mResourceId = i;
        setDrawable(resources, i);
        this.mNumDrawables = i2;
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
        this.mNumDrawables = 1;
        this.mResourceId = targetDrawable.mResourceId;
        this.mDrawable = targetDrawable.mDrawable != null ? targetDrawable.mDrawable.mutate() : null;
        resizeDrawables();
        setState(STATE_INACTIVE);
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

    public void setState(int[] iArr) {
        if (this.mDrawable instanceof StateListDrawable) {
            ((StateListDrawable) this.mDrawable).setState(iArr);
        }
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

    public void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    private void resizeDrawables() {
        if (this.mDrawable instanceof StateListDrawable) {
            int i;
            StateListDrawable stateListDrawable = (StateListDrawable) this.mDrawable;
            int i2 = 0;
            int i3 = 0;
            for (i = 0; i < this.mNumDrawables; i++) {
                stateListDrawable.selectDrawable(i);
                Drawable current = stateListDrawable.getCurrent();
                i3 = Math.max(i3, current.getIntrinsicWidth());
                i2 = Math.max(i2, current.getIntrinsicHeight());
            }
            stateListDrawable.setBounds(0, 0, i3, i2);
            for (i = 0; i < this.mNumDrawables; i++) {
                stateListDrawable.selectDrawable(i);
                stateListDrawable.getCurrent().setBounds(0, 0, i3, i2);
            }
        } else if (this.mDrawable != null) {
            this.mDrawable.setBounds(0, 0, this.mDrawable.getIntrinsicWidth(), this.mDrawable.getIntrinsicHeight());
        }
    }

    public float getX() {
        return this.mTranslationX;
    }

    public void setX(float f) {
        this.mTranslationX = f;
    }

    public float getY() {
        return this.mTranslationY;
    }

    public void setY(float f) {
        this.mTranslationY = f;
    }

    public float getScaleX() {
        return this.mScaleX;
    }

    public void setScaleX(float f) {
        this.mScaleX = f;
    }

    public float getScaleY() {
        return this.mScaleY;
    }

    public void setScaleY(float f) {
        this.mScaleY = f;
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public void setAlpha(float f) {
        this.mAlpha = f;
    }

    public float getPositionX() {
        return this.mPositionX;
    }

    public void setPositionX(float f) {
        this.mPositionX = f;
    }

    public float getPositionY() {
        return this.mPositionY;
    }

    public void setPositionY(float f) {
        this.mPositionY = f;
    }

    public int getWidth() {
        return this.mDrawable != null ? this.mDrawable.getIntrinsicWidth() : 0;
    }

    public int getHeight() {
        return this.mDrawable != null ? this.mDrawable.getIntrinsicHeight() : 0;
    }

    public Rect getBounds() {
        if (this.mBounds == null) {
            this.mBounds = new Rect();
        }
        this.mBounds.set((int) (((double) (this.mTranslationX + this.mPositionX)) - (((double) getWidth()) * 0.5d)), (int) (((double) (this.mTranslationY + this.mPositionY)) - (((double) getHeight()) * 0.5d)), (int) (((double) (this.mTranslationX + this.mPositionX)) + (((double) getWidth()) * 0.5d)), (int) (((double) (this.mTranslationY + this.mPositionY)) + (((double) getHeight()) * 0.5d)));
        return this.mBounds;
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

    public int getResourceId() {
        return this.mResourceId;
    }
}
