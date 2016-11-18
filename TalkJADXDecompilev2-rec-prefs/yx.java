package p000;

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
    public final yy f35866a;
    public final Context f35867b;
    public ActionMenuView f35868c;
    public zh f35869d;
    public int f35870e;
    public pn f35871f;
    private boolean f35872g;
    private boolean f35873h;

    yx(Context context) {
        this(context, null);
    }

    yx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public yx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35866a = new yy(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(gwb.q, typedValue, true) || typedValue.resourceId == 0) {
            this.f35867b = context;
        } else {
            this.f35867b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, wi.a, gwb.s, 0);
        m41557a(obtainStyledAttributes.getLayoutDimension(wi.j, 0));
        obtainStyledAttributes.recycle();
        if (this.f35869d != null) {
            this.f35869d.m41577c();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a = nh.m34904a(motionEvent);
        if (a == 0) {
            this.f35872g = false;
        }
        if (!this.f35872g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (a == 0 && !onTouchEvent) {
                this.f35872g = true;
            }
        }
        if (a == 1 || a == 3) {
            this.f35872g = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int a = nh.m34904a(motionEvent);
        if (a == 9) {
            this.f35873h = false;
        }
        if (!this.f35873h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (a == 9 && !onHoverEvent) {
                this.f35873h = true;
            }
        }
        if (a == 10 || a == 3) {
            this.f35873h = false;
        }
        return true;
    }

    public void m41557a(int i) {
        this.f35870e = i;
        requestLayout();
    }

    public pn m41556a(int i, long j) {
        if (this.f35871f != null) {
            this.f35871f.m40279b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                oa.m37348c((View) this, 0.0f);
            }
            pn a = oa.m37366m(this).m40272a(1.0f);
            a.m40273a(j);
            a.m40275a(this.f35866a.m41559a(a, i));
            return a;
        }
        a = oa.m37366m(this).m40272a(0.0f);
        a.m40273a(j);
        a.m40275a(this.f35866a.m41559a(a, i));
        return a;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f35871f != null) {
                this.f35871f.m40279b();
            }
            super.setVisibility(i);
        }
    }

    public boolean m41558a() {
        if (this.f35869d != null) {
            return this.f35869d.m41580d();
        }
        return false;
    }

    public int m41554a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, nzf.UNSET_ENUM_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int m41551a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int m41555a(View view, int i, int i2, int i3, boolean z) {
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
