package android.support.v7.widget;

import aah;
import aav;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import buf;
import lv;
import oe;
import rk;
import rt;
import su;
import tt;
import tx;
import ud;

/* compiled from: PG */
public class ActionBarContextView extends tt {
    public CharSequence f;
    public CharSequence g;
    public View h;
    public boolean i;
    private View j;
    private LinearLayout k;
    private TextView l;
    private TextView m;
    private int n;
    private int o;
    private int p;

    public final /* bridge */ /* synthetic */ lv a(int i, long j) {
        return super.a(i, j);
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, buf.y);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aah a = aah.a(context, attributeSet, rk.x, i, 0);
        setBackgroundDrawable(a.a(rk.y));
        this.n = a.g(rk.C, 0);
        this.o = a.g(rk.B, 0);
        this.d = a.f(rk.A, 0);
        this.p = a.g(rk.z, buf.bL);
        a.a.recycle();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.c != null) {
            this.c.c();
            this.c.e();
        }
    }

    public final void a(int i) {
        this.d = i;
    }

    public final void a(View view) {
        if (this.j != null) {
            removeView(this.j);
        }
        this.j = view;
        if (!(view == null || this.k == null)) {
            removeView(this.k);
            this.k = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public final void a(CharSequence charSequence) {
        this.f = charSequence;
        c();
    }

    public final void b(CharSequence charSequence) {
        this.g = charSequence;
        c();
    }

    private final void c() {
        int i;
        int i2 = 8;
        Object obj = 1;
        if (this.k == null) {
            LayoutInflater.from(getContext()).inflate(buf.bI, this);
            this.k = (LinearLayout) getChildAt(getChildCount() - 1);
            this.l = (TextView) this.k.findViewById(buf.bg);
            this.m = (TextView) this.k.findViewById(buf.bf);
            if (this.n != 0) {
                this.l.setTextAppearance(getContext(), this.n);
            }
            if (this.o != 0) {
                this.m.setTextAppearance(getContext(), this.o);
            }
        }
        this.l.setText(this.f);
        this.m.setText(this.g);
        Object obj2 = !TextUtils.isEmpty(this.f) ? 1 : null;
        if (TextUtils.isEmpty(this.g)) {
            obj = null;
        }
        TextView textView = this.m;
        if (obj != null) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout = this.k;
        if (!(obj2 == null && obj == null)) {
            i2 = 0;
        }
        linearLayout.setVisibility(i2);
        if (this.k.getParent() == null) {
            addView(this.k);
        }
    }

    public final void a(rt rtVar) {
        if (this.h == null) {
            this.h = LayoutInflater.from(getContext()).inflate(this.p, this, false);
            addView(this.h);
        } else if (this.h.getParent() == null) {
            addView(this.h);
        }
        this.h.findViewById(buf.bj).setOnClickListener(new tx(this, rtVar));
        su suVar = (su) rtVar.b();
        if (this.c != null) {
            this.c.d();
        }
        this.c = new ud(getContext());
        this.c.c(true);
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        suVar.a(this.c, this.a);
        this.b = (ActionMenuView) this.c.a((ViewGroup) this);
        this.b.setBackgroundDrawable(null);
        addView(this.b, layoutParams);
    }

    public final void b() {
        removeAllViews();
        this.j = null;
        this.b = null;
    }

    public final boolean a() {
        if (this.c != null) {
            return this.c.b();
        }
        return false;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    protected void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        int i4 = 0;
        if (MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int i5;
            int a;
            int size = MeasureSpec.getSize(i);
            if (this.d > 0) {
                i5 = this.d;
            } else {
                i5 = MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i6 = i5 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i6, oe.INVALID_ID);
            if (this.h != null) {
                a = tt.a(this.h, paddingLeft, makeMeasureSpec, 0);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.h.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.rightMargin + marginLayoutParams.leftMargin);
            }
            if (this.b != null && this.b.getParent() == this) {
                paddingLeft = tt.a(this.b, paddingLeft, makeMeasureSpec, 0);
            }
            if (this.k != null && this.j == null) {
                if (this.i) {
                    this.k.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    a = this.k.getMeasuredWidth();
                    makeMeasureSpec = a <= paddingLeft ? 1 : 0;
                    if (makeMeasureSpec != 0) {
                        paddingLeft -= a;
                    }
                    this.k.setVisibility(makeMeasureSpec != 0 ? 0 : 8);
                } else {
                    paddingLeft = tt.a(this.k, paddingLeft, makeMeasureSpec, 0);
                }
            }
            if (this.j != null) {
                int min;
                LayoutParams layoutParams = this.j.getLayoutParams();
                if (layoutParams.width != -2) {
                    makeMeasureSpec = 1073741824;
                } else {
                    makeMeasureSpec = oe.INVALID_ID;
                }
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = oe.INVALID_ID;
                }
                if (layoutParams.height >= 0) {
                    min = Math.min(layoutParams.height, i6);
                } else {
                    min = i6;
                }
                this.j.measure(MeasureSpec.makeMeasureSpec(paddingLeft, makeMeasureSpec), MeasureSpec.makeMeasureSpec(min, i3));
            }
            if (this.d <= 0) {
                makeMeasureSpec = getChildCount();
                i5 = 0;
                while (i4 < makeMeasureSpec) {
                    paddingLeft = getChildAt(i4).getMeasuredHeight() + paddingTop;
                    if (paddingLeft <= i5) {
                        paddingLeft = i5;
                    }
                    i4++;
                    i5 = paddingLeft;
                }
                setMeasuredDimension(size, i5);
                return;
            }
            setMeasuredDimension(size, i5);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean a = aav.a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (!(this.h == null || this.h.getVisibility() == 8)) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.h.getLayoutParams();
            int i6 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            i5 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            paddingRight = tt.a(paddingRight, i6, a);
            paddingRight = tt.a(paddingRight + tt.a(this.h, paddingRight, paddingTop, paddingTop2, a), i5, a);
        }
        if (!(this.k == null || this.j != null || this.k.getVisibility() == 8)) {
            paddingRight += tt.a(this.k, paddingRight, paddingTop, paddingTop2, a);
        }
        if (this.j != null) {
            tt.a(this.j, paddingRight, paddingTop, paddingTop2, a);
        }
        i5 = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.b != null) {
            tt.a(this.b, i5, paddingTop, paddingTop2, !a);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT < 14) {
            return;
        }
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public final void a(boolean z) {
        if (z != this.i) {
            requestLayout();
        }
        this.i = z;
    }
}
