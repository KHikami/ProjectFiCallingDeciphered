package android.support.v7.widget;

import aez;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import gwb;
import nzf;
import wi;
import yz;
import za;

public class ActionBarContainer extends FrameLayout {
    public Drawable a;
    public Drawable b;
    public Drawable c;
    public boolean d;
    public boolean e;
    private boolean f;
    private View g;
    private View h;
    private View i;
    private int j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        Drawable zaVar;
        super(context, attributeSet);
        if (VERSION.SDK_INT >= 21) {
            zaVar = new za(this);
        } else {
            zaVar = new yz(this);
        }
        setBackgroundDrawable(zaVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wi.a);
        this.a = obtainStyledAttributes.getDrawable(wi.b);
        this.b = obtainStyledAttributes.getDrawable(wi.d);
        this.j = obtainStyledAttributes.getDimensionPixelSize(wi.j, -1);
        if (getId() == gwb.bG) {
            this.d = true;
            this.c = obtainStyledAttributes.getDrawable(wi.c);
        }
        obtainStyledAttributes.recycle();
        boolean z = this.d ? this.c == null : this.a == null && this.b == null;
        setWillNotDraw(z);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.h = findViewById(gwb.bj);
        this.i = findViewById(gwb.bo);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.a != null) {
            this.a.setVisible(z, false);
        }
        if (this.b != null) {
            this.b.setVisible(z, false);
        }
        if (this.c != null) {
            this.c.setVisible(z, false);
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.a && !this.d) || ((drawable == this.b && this.e) || ((drawable == this.c && this.d) || super.verifyDrawable(drawable)));
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.a != null && this.a.isStateful()) {
            this.a.setState(getDrawableState());
        }
        if (this.b != null && this.b.isStateful()) {
            this.b.setState(getDrawableState());
        }
        if (this.c != null && this.c.isStateful()) {
            this.c.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        if (VERSION.SDK_INT >= 11) {
            super.jumpDrawablesToCurrentState();
            if (this.a != null) {
                this.a.jumpToCurrentState();
            }
            if (this.b != null) {
                this.b.jumpToCurrentState();
            }
            if (this.c != null) {
                this.c.jumpToCurrentState();
            }
        }
    }

    public void a(boolean z) {
        this.f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void a(aez aez) {
        if (this.g != null) {
            removeView(this.g);
        }
        this.g = aez;
        if (aez != null) {
            addView(aez);
            LayoutParams layoutParams = aez.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            aez.a(false);
        }
    }

    public View a() {
        return this.g;
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    private static boolean a(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    private static int b(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return layoutParams.bottomMargin + (view.getMeasuredHeight() + layoutParams.topMargin);
    }

    public void onMeasure(int i, int i2) {
        if (this.h == null && MeasureSpec.getMode(i2) == nzf.UNSET_ENUM_VALUE && this.j >= 0) {
            i2 = MeasureSpec.makeMeasureSpec(Math.min(this.j, MeasureSpec.getSize(i2)), nzf.UNSET_ENUM_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.h != null) {
            int mode = MeasureSpec.getMode(i2);
            if (this.g != null && this.g.getVisibility() != 8 && mode != 1073741824) {
                int b;
                if (!a(this.h)) {
                    b = b(this.h);
                } else if (a(this.i)) {
                    b = 0;
                } else {
                    b = b(this.i);
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(b + b(this.g), mode == nzf.UNSET_ENUM_VALUE ? MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 1;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.g;
        boolean z2 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (!this.d) {
            int i6;
            if (this.a != null) {
                if (this.h.getVisibility() == 0) {
                    this.a.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
                } else if (this.i == null || this.i.getVisibility() != 0) {
                    this.a.setBounds(0, 0, 0, 0);
                } else {
                    this.a.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
                }
                i6 = 1;
            } else {
                i6 = 0;
            }
            this.e = z2;
            if (!z2 || this.b == null) {
                i5 = i6;
            } else {
                this.b.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        } else if (this.c != null) {
            this.c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            i5 = 0;
        }
        if (i5 != 0) {
            invalidate();
        }
    }
}
