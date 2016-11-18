package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

public class yx extends ViewGroup {
    public final yy a;
    public final Context b;
    public ActionMenuView c;
    public zh d;
    public int e;
    public pn f;
    private boolean g;
    private boolean h;

    yx(Context context) {
        this(context, null);
    }

    yx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public yx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new yy(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(gwb.q, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, wi.a, gwb.s, 0);
        a(obtainStyledAttributes.getLayoutDimension(wi.j, 0));
        obtainStyledAttributes.recycle();
        if (this.d != null) {
            this.d.c();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a = nh.a(motionEvent);
        if (a == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (a == 0 && !onTouchEvent) {
                this.g = true;
            }
        }
        if (a == 1 || a == 3) {
            this.g = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int a = nh.a(motionEvent);
        if (a == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (a == 9 && !onHoverEvent) {
                this.h = true;
            }
        }
        if (a == 10 || a == 3) {
            this.h = false;
        }
        return true;
    }

    public void a(int i) {
        this.e = i;
        requestLayout();
    }

    public pn a(int i, long j) {
        if (this.f != null) {
            this.f.b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                oa.c((View) this, 0.0f);
            }
            pn a = oa.m(this).a(1.0f);
            a.a(j);
            a.a(this.a.a(a, i));
            return a;
        }
        a = oa.m(this).a(0.0f);
        a.a(j);
        a.a(this.a.a(a, i));
        return a;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f != null) {
                this.f.b();
            }
            super.setVisibility(i);
        }
    }

    public boolean a() {
        if (this.d != null) {
            return this.d.d();
        }
        return false;
    }

    public int a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, nzf.UNSET_ENUM_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
