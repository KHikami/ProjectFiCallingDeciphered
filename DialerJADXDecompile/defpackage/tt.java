package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: tt */
public class tt extends ViewGroup {
    public final Context a;
    public ActionMenuView b;
    public ud c;
    public int d;
    public lv e;
    private tu f;
    private boolean g;
    private boolean h;

    tt(Context context) {
        this(context, null);
    }

    tt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public tt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new tu(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(buf.o, typedValue, true) || typedValue.resourceId == 0) {
            this.a = context;
        } else {
            this.a = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected void onConfigurationChanged(Configuration configuration) {
        if (VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, rk.a, buf.q, 0);
        a(obtainStyledAttributes.getLayoutDimension(rk.l, 0));
        obtainStyledAttributes.recycle();
        if (this.c != null) {
            ud udVar = this.c;
            udVar.g = rs.a(udVar.b).a();
            if (udVar.c != null) {
                udVar.c.b(true);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a = jw.a(motionEvent);
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
        int a = jw.a(motionEvent);
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
        this.d = i;
        requestLayout();
    }

    public lv a(int i, long j) {
        if (this.e != null) {
            this.e.a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                kn.c((View) this, 0.0f);
            }
            lv a = kn.l(this).a(1.0f);
            a.a(j);
            a.a(this.f.a(a, i));
            return a;
        }
        a = kn.l(this).a(0.0f);
        a.a(j);
        a.a(this.f.a(a, i));
        return a;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.e != null) {
                this.e.a();
            }
            super.setVisibility(i);
        }
    }

    public boolean a() {
        if (this.c != null) {
            return this.c.b();
        }
        return false;
    }

    public static int a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, oe.INVALID_ID), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public static int a(View view, int i, int i2, int i3, boolean z) {
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
