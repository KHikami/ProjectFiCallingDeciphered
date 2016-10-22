package com.google.android.apps.hangouts.fragments.dialpad;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import den;
import deo;
import dep;
import gwb;
import iil;
import qi;
import wi;

public class DialpadKeyButton extends FrameLayout {
    private static final int d;
    private static final Handler e;
    public AccessibilityManager a;
    public int b;
    public CharSequence c;
    private RectF f;
    private boolean g;
    private boolean h;
    private CharSequence i;
    private boolean j;
    private boolean k;
    private Runnable l;
    private dep m;

    static {
        d = ViewConfiguration.getLongPressTimeout() << 1;
        e = new Handler();
    }

    public void a(dep dep) {
        this.m = dep;
    }

    public DialpadKeyButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new RectF();
        a(context);
    }

    public DialpadKeyButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new RectF();
        a(context);
    }

    private void a(Context context) {
        this.a = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public void a(CharSequence charSequence) {
        setLongClickable(true);
        this.c = charSequence;
        if (this.h) {
            super.setContentDescription(this.c);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 66) {
            if (keyEvent.getRepeatCount() != 0) {
                return true;
            }
            keyEvent.startTracking();
            a(true);
            this.g = false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 66 && !this.g) {
            a(false);
        }
        return super.onKeyUp(i, keyEvent);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (i == 66) {
            a(false);
            if (isLongClickable()) {
                a();
            }
            this.g = true;
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(MeasureSpec.getSize(i) / 3, getResources().getDimensionPixelSize(gwb.eD));
    }

    public void setContentDescription(CharSequence charSequence) {
        this.i = charSequence;
        super.setContentDescription(charSequence);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case wi.w /*0*/:
                if (!isPressed()) {
                    setPressed(true);
                    a(true);
                    e.postDelayed(new den(this, this.b), (long) ViewConfiguration.getLongPressTimeout());
                    break;
                }
                break;
            case wi.j /*1*/:
                if (isPressed()) {
                    setPressed(false);
                    a(false);
                    this.b++;
                    performClick();
                    break;
                }
                break;
        }
        return true;
    }

    public void a(boolean z) {
        if (this.m != null) {
            this.m.a(this, z);
        }
    }

    public void a() {
        if (this.m != null) {
            this.m.a(this);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i - getPaddingRight()), (float) (i2 - getPaddingBottom()));
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i == 16) {
            b();
            a(true);
            a(false);
            return true;
        }
        if (i == 32) {
            if (!isPressed()) {
                setPressed(true);
                sendAccessibilityEvent(2);
                setPressed(false);
            }
            a(true);
            a(false);
            a();
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (this.a.isEnabled() && qi.a(this.a)) {
            switch (motionEvent.getActionMasked()) {
                case wi.n /*9*/:
                    super.setContentDescription(this.i);
                    this.j = isClickable();
                    this.k = isLongClickable();
                    if (this.k && this.c != null) {
                        if (this.l == null) {
                            this.l = new deo(this);
                        }
                        postDelayed(this.l, (long) d);
                    }
                    setClickable(false);
                    setLongClickable(false);
                    break;
                case wi.dr /*10*/:
                    if (this.f.contains(motionEvent.getX(), motionEvent.getY())) {
                        if (this.h) {
                            performLongClick();
                        } else {
                            b();
                        }
                        if (!isPressed()) {
                            setPressed(true);
                            a(true);
                        }
                        iil.a("Expected condition to be true", isPressed());
                        setPressed(false);
                        a(false);
                        if (this.h) {
                            a();
                        } else {
                            performClick();
                        }
                    }
                    this.b++;
                    if (this.l != null) {
                        removeCallbacks(this.l);
                    }
                    b(false);
                    setClickable(this.j);
                    setLongClickable(this.k);
                    break;
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    private void b() {
        if (!isPressed()) {
            setPressed(true);
            sendAccessibilityEvent(1);
            setPressed(false);
        }
    }

    public void b(boolean z) {
        if (this.h != z) {
            this.h = z;
        }
    }
}
