package android.support.v7.widget;

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
import buf;
import oe;
import rk;
import tv;
import tw;
import zs;

/* compiled from: PG */
public class ActionBarContainer extends FrameLayout {
    View a;
    public View b;
    public Drawable c;
    public Drawable d;
    public Drawable e;
    public boolean f;
    public boolean g;
    private boolean h;
    private View i;
    private int j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        Drawable twVar;
        super(context, attributeSet);
        if (VERSION.SDK_INT >= 21) {
            twVar = new tw(this);
        } else {
            twVar = new tv(this);
        }
        setBackgroundDrawable(twVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk.a);
        this.c = obtainStyledAttributes.getDrawable(rk.d);
        this.d = obtainStyledAttributes.getDrawable(rk.f);
        this.j = obtainStyledAttributes.getDimensionPixelSize(rk.l, -1);
        if (getId() == buf.bC) {
            this.f = true;
            this.e = obtainStyledAttributes.getDrawable(rk.e);
        }
        obtainStyledAttributes.recycle();
        boolean z = this.f ? this.e == null : this.c == null && this.d == null;
        setWillNotDraw(z);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.b = findViewById(buf.bc);
        this.i = findViewById(buf.bh);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.c != null) {
            this.c.setVisible(z, false);
        }
        if (this.d != null) {
            this.d.setVisible(z, false);
        }
        if (this.e != null) {
            this.e.setVisible(z, false);
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.c && !this.f) || ((drawable == this.d && this.g) || ((drawable == this.e && this.f) || super.verifyDrawable(drawable)));
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.c != null && this.c.isStateful()) {
            this.c.setState(getDrawableState());
        }
        if (this.d != null && this.d.isStateful()) {
            this.d.setState(getDrawableState());
        }
        if (this.e != null && this.e.isStateful()) {
            this.e.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        if (VERSION.SDK_INT >= 11) {
            super.jumpDrawablesToCurrentState();
            if (this.c != null) {
                this.c.jumpToCurrentState();
            }
            if (this.d != null) {
                this.d.jumpToCurrentState();
            }
            if (this.e != null) {
                this.e.jumpToCurrentState();
            }
        }
    }

    public final void a(boolean z) {
        this.h = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.h || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void a(zs zsVar) {
        if (this.a != null) {
            removeView(this.a);
        }
        this.a = zsVar;
        if (zsVar != null) {
            addView(zsVar);
            LayoutParams layoutParams = zsVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            zsVar.c = false;
        }
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
        if (this.b == null && MeasureSpec.getMode(i2) == oe.INVALID_ID && this.j >= 0) {
            i2 = MeasureSpec.makeMeasureSpec(Math.min(this.j, MeasureSpec.getSize(i2)), oe.INVALID_ID);
        }
        super.onMeasure(i, i2);
        if (this.b != null) {
            int mode = MeasureSpec.getMode(i2);
            if (this.a != null && this.a.getVisibility() != 8 && mode != 1073741824) {
                int b;
                if (!a(this.b)) {
                    b = b(this.b);
                } else if (a(this.i)) {
                    b = 0;
                } else {
                    b = b(this.i);
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(b + b(this.a), mode == oe.INVALID_ID ? MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 1;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.a;
        boolean z2 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (!this.f) {
            int i6;
            if (this.c != null) {
                if (this.b.getVisibility() == 0) {
                    this.c.setBounds(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
                } else if (this.i == null || this.i.getVisibility() != 0) {
                    this.c.setBounds(0, 0, 0, 0);
                } else {
                    this.c.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
                }
                i6 = 1;
            } else {
                i6 = 0;
            }
            this.g = z2;
            if (!z2 || this.d == null) {
                i5 = i6;
            } else {
                this.d.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        } else if (this.e != null) {
            this.e.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            i5 = 0;
        }
        if (i5 != 0) {
            invalidate();
        }
    }
}
