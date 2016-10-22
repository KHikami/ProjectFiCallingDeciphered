package android.support.v7.widget;

import afp;
import age;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import gwb;
import nzf;
import pn;
import wi;
import wx;
import xy;
import yx;
import zb;
import zh;

public class ActionBarContextView extends yx {
    private CharSequence g;
    private CharSequence h;
    private View i;
    private View j;
    private LinearLayout k;
    private TextView l;
    private TextView m;
    private int n;
    private int o;
    private boolean p;
    private int q;

    public /* bridge */ /* synthetic */ pn a(int i, long j) {
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
        this(context, attributeSet, gwb.z);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        afp a = afp.a(context, attributeSet, wi.y, i, 0);
        setBackgroundDrawable(a.a(wi.z));
        this.n = a.g(wi.D, 0);
        this.o = a.g(wi.C, 0);
        this.e = a.f(wi.B, 0);
        this.q = a.g(wi.A, gwb.bP);
        a.a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.d != null) {
            this.d.e();
            this.d.g();
        }
    }

    public void a(int i) {
        this.e = i;
    }

    public void a(View view) {
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

    public void a(CharSequence charSequence) {
        this.g = charSequence;
        g();
    }

    public void b(CharSequence charSequence) {
        this.h = charSequence;
        g();
    }

    public CharSequence b() {
        return this.g;
    }

    public CharSequence c() {
        return this.h;
    }

    private void g() {
        int i;
        int i2 = 8;
        Object obj = 1;
        if (this.k == null) {
            LayoutInflater.from(getContext()).inflate(gwb.bM, this);
            this.k = (LinearLayout) getChildAt(getChildCount() - 1);
            this.l = (TextView) this.k.findViewById(gwb.bn);
            this.m = (TextView) this.k.findViewById(gwb.bm);
            if (this.n != 0) {
                this.l.setTextAppearance(getContext(), this.n);
            }
            if (this.o != 0) {
                this.m.setTextAppearance(getContext(), this.o);
            }
        }
        this.l.setText(this.g);
        this.m.setText(this.h);
        Object obj2 = !TextUtils.isEmpty(this.g) ? 1 : null;
        if (TextUtils.isEmpty(this.h)) {
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

    public void a(wx wxVar) {
        if (this.i == null) {
            this.i = LayoutInflater.from(getContext()).inflate(this.q, this, false);
            addView(this.i);
        } else if (this.i.getParent() == null) {
            addView(this.i);
        }
        this.i.findViewById(gwb.br).setOnClickListener(new zb(this, wxVar));
        xy xyVar = (xy) wxVar.b();
        if (this.d != null) {
            this.d.f();
        }
        this.d = new zh(getContext());
        this.d.c(true);
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        xyVar.a(this.d, this.b);
        this.c = (ActionMenuView) this.d.a(this);
        this.c.setBackgroundDrawable(null);
        addView(this.c, layoutParams);
    }

    public void d() {
        if (this.i == null) {
            e();
        }
    }

    public void e() {
        removeAllViews();
        this.j = null;
        this.c = null;
    }

    public boolean a() {
        if (this.d != null) {
            return this.d.d();
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
            if (this.e > 0) {
                i5 = this.e;
            } else {
                i5 = MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i6 = i5 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i6, nzf.UNSET_ENUM_VALUE);
            if (this.i != null) {
                a = a(this.i, paddingLeft, makeMeasureSpec, 0);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.i.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.rightMargin + marginLayoutParams.leftMargin);
            }
            if (this.c != null && this.c.getParent() == this) {
                paddingLeft = a(this.c, paddingLeft, makeMeasureSpec, 0);
            }
            if (this.k != null && this.j == null) {
                if (this.p) {
                    this.k.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    a = this.k.getMeasuredWidth();
                    makeMeasureSpec = a <= paddingLeft ? 1 : 0;
                    if (makeMeasureSpec != 0) {
                        paddingLeft -= a;
                    }
                    this.k.setVisibility(makeMeasureSpec != 0 ? 0 : 8);
                } else {
                    paddingLeft = a(this.k, paddingLeft, makeMeasureSpec, 0);
                }
            }
            if (this.j != null) {
                int min;
                LayoutParams layoutParams = this.j.getLayoutParams();
                if (layoutParams.width != -2) {
                    makeMeasureSpec = 1073741824;
                } else {
                    makeMeasureSpec = nzf.UNSET_ENUM_VALUE;
                }
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = nzf.UNSET_ENUM_VALUE;
                }
                if (layoutParams.height >= 0) {
                    min = Math.min(layoutParams.height, i6);
                } else {
                    min = i6;
                }
                this.j.measure(MeasureSpec.makeMeasureSpec(paddingLeft, makeMeasureSpec), MeasureSpec.makeMeasureSpec(min, i3));
            }
            if (this.e <= 0) {
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
        boolean a = age.a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (this.i == null || this.i.getVisibility() == 8) {
            i5 = paddingRight;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.i.getLayoutParams();
            i5 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            i5 = a(paddingRight, i5, a);
            i5 = a(a(this.i, i5, paddingTop, paddingTop2, a) + i5, i6, a);
        }
        if (!(this.k == null || this.j != null || this.k.getVisibility() == 8)) {
            i5 += a(this.k, i5, paddingTop, paddingTop2, a);
        }
        if (this.j != null) {
            a(this.j, i5, paddingTop, paddingTop2, a);
        }
        i5 = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.c != null) {
            a(this.c, i5, paddingTop, paddingTop2, !a);
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
            accessibilityEvent.setContentDescription(this.g);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void a(boolean z) {
        if (z != this.p) {
            requestLayout();
        }
        this.p = z;
    }

    public boolean f() {
        return this.p;
    }
}
