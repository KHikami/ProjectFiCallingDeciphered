package com.android.dialer.dialpadview;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import awi;
import awj;
import rl;

/* compiled from: PG */
public class DialpadKeyButton extends FrameLayout {
    private static final int c;
    public CharSequence a;
    public awj b;
    private AccessibilityManager d;
    private RectF e;
    private boolean f;
    private CharSequence g;
    private boolean h;
    private boolean i;
    private Runnable j;

    static {
        c = ViewConfiguration.getLongPressTimeout() << 1;
    }

    public DialpadKeyButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new RectF();
        a(context);
    }

    public DialpadKeyButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new RectF();
        a(context);
    }

    private final void a(Context context) {
        this.d = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public final void a(CharSequence charSequence) {
        this.a = charSequence;
        if (this.f) {
            super.setContentDescription(this.a);
        }
    }

    public void setContentDescription(CharSequence charSequence) {
        if (this.f) {
            this.g = charSequence;
        } else {
            super.setContentDescription(charSequence);
        }
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        if (this.b != null) {
            this.b.a(this, z);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.e.left = (float) getPaddingLeft();
        this.e.right = (float) (i - getPaddingRight());
        this.e.top = (float) getPaddingTop();
        this.e.bottom = (float) (i2 - getPaddingBottom());
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i != 16) {
            return super.performAccessibilityAction(i, bundle);
        }
        a();
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (this.d.isEnabled() && this.d.isTouchExplorationEnabled()) {
            switch (motionEvent.getActionMasked()) {
                case rl.l /*9*/:
                    this.h = isClickable();
                    this.i = isLongClickable();
                    if (this.i && this.a != null) {
                        if (this.j == null) {
                            this.j = new awi(this);
                        }
                        postDelayed(this.j, (long) c);
                    }
                    setClickable(false);
                    setLongClickable(false);
                    break;
                case rl.m /*10*/:
                    if (this.e.contains(motionEvent.getX(), motionEvent.getY())) {
                        if (this.f) {
                            performLongClick();
                        } else {
                            a();
                        }
                    }
                    if (this.j != null) {
                        removeCallbacks(this.j);
                    }
                    a(false);
                    setClickable(this.h);
                    setLongClickable(this.i);
                    break;
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    private final void a() {
        if (!isPressed()) {
            setPressed(true);
            sendAccessibilityEvent(1);
            setPressed(false);
        }
    }

    public final void a(boolean z) {
        if (this.f != z) {
            this.f = z;
            if (z) {
                this.g = getContentDescription();
                super.setContentDescription(this.a);
                return;
            }
            super.setContentDescription(this.g);
        }
    }
}
