package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class acv extends ViewGroup {
    private boolean f292a;
    private int f293b;
    private int f294c;
    private int f295d;
    private int f296e;
    private int f297f;
    private float f298g;
    private boolean f299h;
    private int[] f300i;
    private int[] f301j;
    private Drawable f302k;
    private int f303l;
    private int f304m;
    private int f305n;
    private int f306o;

    public /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return mo294k();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return mo288b(attributeSet);
    }

    public /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return mo289b(layoutParams);
    }

    public acv(Context context) {
        this(context, null);
    }

    public acv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public acv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f292a = true;
        this.f293b = -1;
        this.f294c = 0;
        this.f296e = 8388659;
        afp a = afp.m927a(context, attributeSet, wi.bg, i, 0);
        int a2 = a.m929a(wi.bk, -1);
        if (a2 >= 0) {
            m633e(a2);
        }
        a2 = a.m929a(wi.bj, -1);
        if (a2 >= 0) {
            m634f(a2);
        }
        boolean a3 = a.m932a(wi.bh, true);
        if (!a3) {
            m631c(a3);
        }
        this.f298g = a.m928a(wi.bl, -1.0f);
        this.f293b = a.m929a(wi.bi, -1);
        this.f299h = a.m932a(wi.bo, false);
        m628b(a.m930a(wi.bm));
        this.f305n = a.m929a(wi.bp, 0);
        this.f306o = a.m939e(wi.bn, 0);
        a.m931a();
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void m628b(Drawable drawable) {
        boolean z = false;
        if (drawable != this.f302k) {
            this.f302k = drawable;
            if (drawable != null) {
                this.f303l = drawable.getIntrinsicWidth();
                this.f304m = drawable.getIntrinsicHeight();
            } else {
                this.f303l = 0;
                this.f304m = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public int m636l() {
        return this.f303l;
    }

    protected void onDraw(Canvas canvas) {
        if (this.f302k != null) {
            if (this.f295d == 1) {
                m620a(canvas);
            } else {
                m626b(canvas);
            }
        }
    }

    void m620a(Canvas canvas) {
        int m = m637m();
        int i = 0;
        while (i < m) {
            View c = m630c(i);
            if (!(c == null || c.getVisibility() == 8 || !m632d(i))) {
                m621a(canvas, (c.getTop() - ((acw) c.getLayoutParams()).topMargin) - this.f304m);
            }
            i++;
        }
        if (m632d(m)) {
            int height;
            View c2 = m630c(m - 1);
            if (c2 == null) {
                height = (getHeight() - getPaddingBottom()) - this.f304m;
            } else {
                acw acw = (acw) c2.getLayoutParams();
                height = acw.bottomMargin + c2.getBottom();
            }
            m621a(canvas, height);
        }
    }

    void m626b(Canvas canvas) {
        int right;
        int m = m637m();
        boolean a = age.m1025a(this);
        int i = 0;
        while (i < m) {
            acw acw;
            View c = m630c(i);
            if (!(c == null || c.getVisibility() == 8 || !m632d(i))) {
                acw = (acw) c.getLayoutParams();
                if (a) {
                    right = acw.rightMargin + c.getRight();
                } else {
                    right = (c.getLeft() - acw.leftMargin) - this.f303l;
                }
                m627b(canvas, right);
            }
            i++;
        }
        if (m632d(m)) {
            View c2 = m630c(m - 1);
            if (c2 != null) {
                acw = (acw) c2.getLayoutParams();
                if (a) {
                    right = (c2.getLeft() - acw.leftMargin) - this.f303l;
                } else {
                    right = acw.rightMargin + c2.getRight();
                }
            } else if (a) {
                right = getPaddingLeft();
            } else {
                right = (getWidth() - getPaddingRight()) - this.f303l;
            }
            m627b(canvas, right);
        }
    }

    void m621a(Canvas canvas, int i) {
        this.f302k.setBounds(getPaddingLeft() + this.f306o, i, (getWidth() - getPaddingRight()) - this.f306o, this.f304m + i);
        this.f302k.draw(canvas);
    }

    void m627b(Canvas canvas, int i) {
        this.f302k.setBounds(i, getPaddingTop() + this.f306o, this.f303l + i, (getHeight() - getPaddingBottom()) - this.f306o);
        this.f302k.draw(canvas);
    }

    public void m631c(boolean z) {
        this.f292a = z;
    }

    public int getBaseline() {
        if (this.f293b < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.f293b) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.f293b);
        int baseline = childAt.getBaseline();
        if (baseline != -1) {
            int i;
            int i2 = this.f294c;
            if (this.f295d == 1) {
                i = this.f296e & 112;
                if (i != 48) {
                    switch (i) {
                        case 16:
                            i = i2 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f297f) / 2);
                            break;
                        case 80:
                            i = ((getBottom() - getTop()) - getPaddingBottom()) - this.f297f;
                            break;
                    }
                }
            }
            i = i2;
            return (((acw) childAt.getLayoutParams()).topMargin + i) + baseline;
        } else if (this.f293b == 0) {
            return -1;
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
    }

    View m630c(int i) {
        return getChildAt(i);
    }

    int m637m() {
        return getChildCount();
    }

    public void onMeasure(int i, int i2) {
        if (this.f295d == 1) {
            m618a(i, i2);
        } else {
            m624b(i, i2);
        }
    }

    protected boolean m632d(int i) {
        if (i == 0) {
            if ((this.f305n & 1) != 0) {
                return true;
            }
            return false;
        } else if (i == getChildCount()) {
            if ((this.f305n & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.f305n & 2) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    void m618a(int i, int i2) {
        int i3;
        int i4;
        int max;
        int i5;
        int i6;
        this.f297f = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        Object obj = 1;
        float f = 0.0f;
        int m = m637m();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        Object obj2 = null;
        Object obj3 = null;
        int i11 = this.f293b;
        boolean z = this.f299h;
        int i12 = nzf.UNSET_ENUM_VALUE;
        int i13 = 0;
        while (i13 < m) {
            int i14;
            int measuredWidth;
            View c = m630c(i13);
            if (c == null) {
                this.f297f = this.f297f;
                i3 = i13;
            } else {
                Object obj4;
                int a;
                Object obj5;
                float f2;
                Object obj6;
                if (c.getVisibility() != 8) {
                    Object obj7;
                    if (m632d(i13)) {
                        this.f297f += this.f304m;
                    }
                    acw acw = (acw) c.getLayoutParams();
                    float f3 = f + acw.f307g;
                    if (mode2 == 1073741824 && acw.height == 0 && acw.f307g > 0.0f) {
                        i3 = this.f297f;
                        this.f297f = Math.max(i3, (acw.topMargin + i3) + acw.bottomMargin);
                        i14 = i12;
                        obj7 = 1;
                    } else {
                        i3 = nzf.UNSET_ENUM_VALUE;
                        if (acw.height == 0 && acw.f307g > 0.0f) {
                            i3 = 0;
                            acw.height = -2;
                        }
                        int i15 = i3;
                        m629b(c, i, 0, i2, f3 == 0.0f ? this.f297f : 0);
                        if (i15 != Integer.MIN_VALUE) {
                            acw.height = i15;
                        }
                        i3 = c.getMeasuredHeight();
                        int i16 = this.f297f;
                        this.f297f = Math.max(i16, ((i16 + i3) + acw.topMargin) + acw.bottomMargin);
                        if (z) {
                            i14 = Math.max(i3, i12);
                            obj7 = obj3;
                        } else {
                            i14 = i12;
                            obj7 = obj3;
                        }
                    }
                    if (i11 >= 0 && i11 == i13 + 1) {
                        this.f294c = this.f297f;
                    }
                    if (i13 >= i11 || acw.f307g <= 0.0f) {
                        Object obj8 = null;
                        if (mode == 1073741824 || acw.width != -1) {
                            obj4 = obj2;
                        } else {
                            obj4 = 1;
                            obj8 = 1;
                        }
                        i4 = acw.leftMargin + acw.rightMargin;
                        measuredWidth = c.getMeasuredWidth() + i4;
                        max = Math.max(i7, measuredWidth);
                        a = age.m1023a(i8, oa.f(c));
                        obj5 = (obj == null || acw.width != -1) ? null : 1;
                        if (acw.f307g > 0.0f) {
                            if (obj8 != null) {
                                i3 = i4;
                            } else {
                                i3 = measuredWidth;
                            }
                            f2 = f3;
                            obj6 = obj5;
                            i5 = i9;
                            obj5 = obj7;
                            i12 = max;
                            int i17 = i14;
                            i14 = Math.max(i10, i3);
                            i3 = i17;
                        } else {
                            if (obj8 == null) {
                                i4 = measuredWidth;
                            }
                            i3 = Math.max(i9, i4);
                            f2 = f3;
                            obj6 = obj5;
                            i5 = i3;
                            obj5 = obj7;
                            i3 = i14;
                            i14 = i10;
                            i12 = max;
                        }
                    } else {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                }
                i3 = i12;
                obj5 = obj3;
                f2 = f;
                obj6 = obj;
                i14 = i10;
                i5 = i9;
                obj4 = obj2;
                i12 = i7;
                a = i8;
                obj3 = obj5;
                obj = obj6;
                i10 = i14;
                i9 = i5;
                i8 = a;
                i7 = i12;
                obj2 = obj4;
                i12 = i3;
                f = f2;
                i3 = i13;
            }
            i13 = i3 + 1;
        }
        if (this.f297f > 0 && m632d(m)) {
            this.f297f += this.f304m;
        }
        if (z && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.f297f = 0;
            i6 = 0;
            while (i6 < m) {
                View c2 = m630c(i6);
                if (c2 == null) {
                    this.f297f = this.f297f;
                    i3 = i6;
                } else if (c2.getVisibility() == 8) {
                    i3 = i6;
                } else {
                    acw acw2 = (acw) c2.getLayoutParams();
                    i4 = this.f297f;
                    this.f297f = Math.max(i4, acw2.bottomMargin + ((i4 + i12) + acw2.topMargin));
                    i3 = i6;
                }
                i6 = i3 + 1;
            }
        }
        this.f297f += getPaddingTop() + getPaddingBottom();
        i13 = oa.a(Math.max(this.f297f, getSuggestedMinimumHeight()), i2, 0);
        i4 = (16777215 & i13) - this.f297f;
        int i18;
        if (obj3 != null || (i4 != 0 && f > 0.0f)) {
            if (this.f298g > 0.0f) {
                f = this.f298g;
            }
            this.f297f = 0;
            i10 = 0;
            obj3 = obj;
            i18 = i9;
            i12 = i8;
            int i19 = i7;
            while (i10 < m) {
                float f4;
                Object obj9;
                View c3 = m630c(i10);
                if (c3.getVisibility() != 8) {
                    acw2 = (acw) c3.getLayoutParams();
                    float f5 = acw2.f307g;
                    if (f5 > 0.0f) {
                        View view;
                        i6 = (int) ((((float) i4) * f5) / f);
                        f5 = f - f5;
                        i5 = i4 - i6;
                        i16 = acv.getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + acw2.leftMargin) + acw2.rightMargin, acw2.width);
                        if (acw2.height != 0 || mode2 != 1073741824) {
                            i6 += c3.getMeasuredHeight();
                            if (i6 < 0) {
                                i6 = 0;
                            }
                            view = c3;
                        } else if (i6 > 0) {
                            view = c3;
                        } else {
                            i6 = 0;
                            view = c3;
                        }
                        view.measure(i16, MeasureSpec.makeMeasureSpec(i6, 1073741824));
                        i16 = i5;
                        i4 = age.m1023a(i12, oa.f(c3) & -256);
                        f4 = f5;
                    } else {
                        f4 = f;
                        i16 = i4;
                        i4 = i12;
                    }
                    i14 = acw2.leftMargin + acw2.rightMargin;
                    i5 = c3.getMeasuredWidth() + i14;
                    i12 = Math.max(i19, i5);
                    obj = (mode == 1073741824 || acw2.width != -1) ? null : 1;
                    if (obj == null) {
                        i14 = i5;
                    }
                    i5 = Math.max(i18, i14);
                    obj9 = (obj3 == null || acw2.width != -1) ? null : 1;
                    max = this.f297f;
                    this.f297f = Math.max(max, acw2.bottomMargin + ((c3.getMeasuredHeight() + max) + acw2.topMargin));
                    i3 = i5;
                    measuredWidth = i12;
                } else {
                    f4 = f;
                    obj9 = obj3;
                    i3 = i18;
                    measuredWidth = i19;
                    i16 = i4;
                    i4 = i12;
                }
                i10++;
                obj3 = obj9;
                i18 = i3;
                i12 = i4;
                i19 = measuredWidth;
                i4 = i16;
                f = f4;
            }
            this.f297f += getPaddingTop() + getPaddingBottom();
            i3 = i18;
            i8 = i12;
            i6 = i19;
            obj = obj3;
        } else {
            i18 = Math.max(i9, i10);
            if (z && mode2 != 1073741824) {
                for (i6 = 0; i6 < m; i6++) {
                    View c4 = m630c(i6);
                    if (!(c4 == null || c4.getVisibility() == 8 || ((acw) c4.getLayoutParams()).f307g <= 0.0f)) {
                        c4.measure(MeasureSpec.makeMeasureSpec(c4.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(i12, 1073741824));
                    }
                }
            }
            i3 = i18;
            i6 = i7;
        }
        if (obj != null || mode == 1073741824) {
            i3 = i6;
        }
        setMeasuredDimension(oa.a(Math.max(i3 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, i8), i13);
        if (obj2 != null) {
            m617c(m, i2);
        }
    }

    private void m617c(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View c = m630c(i3);
            if (c.getVisibility() != 8) {
                acw acw = (acw) c.getLayoutParams();
                if (acw.width == -1) {
                    int i4 = acw.height;
                    acw.height = c.getMeasuredHeight();
                    measureChildWithMargins(c, makeMeasureSpec, 0, i2, 0);
                    acw.height = i4;
                }
            }
        }
    }

    void m624b(int i, int i2) {
        Object obj;
        int i3;
        int i4;
        Object obj2;
        Object obj3;
        int measuredHeight;
        acw acw;
        this.f297f = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        Object obj4 = 1;
        float f = 0.0f;
        int m = m637m();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        Object obj5 = null;
        Object obj6 = null;
        if (this.f300i == null || this.f301j == null) {
            this.f300i = new int[4];
            this.f301j = new int[4];
        }
        int[] iArr = this.f300i;
        int[] iArr2 = this.f301j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z = this.f292a;
        boolean z2 = this.f299h;
        if (mode == 1073741824) {
            obj = 1;
        } else {
            obj = null;
        }
        int i9 = nzf.UNSET_ENUM_VALUE;
        int i10 = 0;
        while (i10 < m) {
            acw acw2;
            int i11;
            int a;
            int baseline;
            Object obj7;
            int i12;
            View c = m630c(i10);
            if (c == null) {
                this.f297f = this.f297f;
                i3 = i10;
            } else {
                float f2;
                Object obj8;
                if (c.getVisibility() != 8) {
                    if (m632d(i10)) {
                        this.f297f += this.f303l;
                    }
                    acw2 = (acw) c.getLayoutParams();
                    float f3 = f + acw2.f307g;
                    if (mode == 1073741824 && acw2.width == 0 && acw2.f307g > 0.0f) {
                        if (obj != null) {
                            this.f297f += acw2.leftMargin + acw2.rightMargin;
                        } else {
                            i3 = this.f297f;
                            this.f297f = Math.max(i3, (acw2.leftMargin + i3) + acw2.rightMargin);
                        }
                        if (z) {
                            i3 = MeasureSpec.makeMeasureSpec(0, 0);
                            c.measure(i3, i3);
                            i4 = i9;
                            obj2 = obj6;
                        } else {
                            i4 = i9;
                            i9 = 1;
                        }
                    } else {
                        i3 = nzf.UNSET_ENUM_VALUE;
                        if (acw2.width == 0 && acw2.f307g > 0.0f) {
                            i3 = 0;
                            acw2.width = -2;
                        }
                        int i13 = i3;
                        m629b(c, i, f3 == 0.0f ? this.f297f : 0, i2, 0);
                        if (i13 != Integer.MIN_VALUE) {
                            acw2.width = i13;
                        }
                        i3 = c.getMeasuredWidth();
                        if (obj != null) {
                            this.f297f += (acw2.leftMargin + i3) + acw2.rightMargin;
                        } else {
                            int i14 = this.f297f;
                            this.f297f = Math.max(i14, ((i14 + i3) + acw2.leftMargin) + acw2.rightMargin);
                        }
                        if (z2) {
                            i4 = Math.max(i3, i9);
                            obj2 = obj6;
                        } else {
                            i4 = i9;
                            obj2 = obj6;
                        }
                    }
                    Object obj9 = null;
                    if (mode2 == 1073741824 || acw2.height != -1) {
                        obj3 = obj5;
                    } else {
                        obj3 = 1;
                        obj9 = 1;
                    }
                    i11 = acw2.topMargin + acw2.bottomMargin;
                    measuredHeight = c.getMeasuredHeight() + i11;
                    a = age.m1023a(i6, oa.f(c));
                    if (z) {
                        baseline = c.getBaseline();
                        if (baseline != -1) {
                            int i15 = ((((acw2.f308h < 0 ? this.f296e : acw2.f308h) & 112) >> 4) & -2) >> 1;
                            iArr[i15] = Math.max(iArr[i15], baseline);
                            iArr2[i15] = Math.max(iArr2[i15], measuredHeight - baseline);
                        }
                    }
                    baseline = Math.max(i5, measuredHeight);
                    obj7 = (obj4 == null || acw2.height != -1) ? null : 1;
                    if (acw2.f307g > 0.0f) {
                        if (obj9 != null) {
                            i3 = i11;
                        } else {
                            i3 = measuredHeight;
                        }
                        f2 = f3;
                        obj8 = obj7;
                        i12 = i7;
                        obj7 = obj2;
                        i9 = baseline;
                        int i16 = i4;
                        i4 = Math.max(i8, i3);
                        i3 = i16;
                    } else {
                        if (obj9 == null) {
                            i11 = measuredHeight;
                        }
                        i3 = Math.max(i7, i11);
                        f2 = f3;
                        obj8 = obj7;
                        i12 = i3;
                        obj7 = obj2;
                        i3 = i4;
                        i4 = i8;
                        i9 = baseline;
                    }
                } else {
                    i3 = i9;
                    obj7 = obj6;
                    f2 = f;
                    obj8 = obj4;
                    i4 = i8;
                    i12 = i7;
                    obj3 = obj5;
                    i9 = i5;
                    a = i6;
                }
                obj6 = obj7;
                obj4 = obj8;
                i8 = i4;
                i7 = i12;
                i6 = a;
                i5 = i9;
                obj5 = obj3;
                i9 = i3;
                f = f2;
                i3 = i10;
            }
            i10 = i3 + 1;
        }
        if (this.f297f > 0 && m632d(m)) {
            this.f297f += this.f303l;
        }
        if (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) {
            i11 = i5;
        } else {
            i11 = Math.max(i5, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        }
        if (z2 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f297f = 0;
            i15 = 0;
            while (i15 < m) {
                View c2 = m630c(i15);
                if (c2 == null) {
                    this.f297f = this.f297f;
                    i3 = i15;
                } else if (c2.getVisibility() == 8) {
                    i3 = i15;
                } else {
                    acw = (acw) c2.getLayoutParams();
                    if (obj != null) {
                        this.f297f = (acw.rightMargin + (acw.leftMargin + i9)) + this.f297f;
                        i3 = i15;
                    } else {
                        measuredHeight = this.f297f;
                        this.f297f = Math.max(measuredHeight, acw.rightMargin + ((measuredHeight + i9) + acw.leftMargin));
                        i3 = i15;
                    }
                }
                i15 = i3 + 1;
            }
        }
        this.f297f += getPaddingLeft() + getPaddingRight();
        i5 = oa.a(Math.max(this.f297f, getSuggestedMinimumWidth()), i, 0);
        measuredHeight = (16777215 & i5) - this.f297f;
        View view;
        if (obj6 != null || (measuredHeight != 0 && f > 0.0f)) {
            if (this.f298g > 0.0f) {
                f = this.f298g;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f297f = 0;
            i8 = 0;
            obj2 = obj4;
            baseline = i7;
            int i17 = -1;
            i4 = i6;
            while (i8 < m) {
                float f4;
                View c3 = m630c(i8);
                if (c3 == null || c3.getVisibility() == 8) {
                    f4 = f;
                    i15 = measuredHeight;
                    i11 = baseline;
                    obj3 = obj2;
                    measuredHeight = i4;
                    i4 = i17;
                } else {
                    int childMeasureSpec;
                    float f5;
                    acw = (acw) c3.getLayoutParams();
                    float f6 = acw.f307g;
                    if (f6 > 0.0f) {
                        i15 = (int) ((((float) measuredHeight) * f6) / f);
                        f6 = f - f6;
                        measuredHeight -= i15;
                        childMeasureSpec = acv.getChildMeasureSpec(i2, ((getPaddingTop() + getPaddingBottom()) + acw.topMargin) + acw.bottomMargin, acw.height);
                        if (acw.width != 0 || mode != 1073741824) {
                            i15 += c3.getMeasuredWidth();
                            if (i15 < 0) {
                                i15 = 0;
                            }
                            view = c3;
                        } else if (i15 > 0) {
                            view = c3;
                        } else {
                            i15 = 0;
                            view = c3;
                        }
                        view.measure(MeasureSpec.makeMeasureSpec(i15, 1073741824), childMeasureSpec);
                        childMeasureSpec = age.m1023a(i4, oa.f(c3) & -16777216);
                        f5 = f6;
                        i12 = measuredHeight;
                    } else {
                        i12 = measuredHeight;
                        childMeasureSpec = i4;
                        f5 = f;
                    }
                    if (obj != null) {
                        this.f297f += (c3.getMeasuredWidth() + acw.leftMargin) + acw.rightMargin;
                    } else {
                        i15 = this.f297f;
                        this.f297f = Math.max(i15, ((c3.getMeasuredWidth() + i15) + acw.leftMargin) + acw.rightMargin);
                    }
                    obj7 = (mode2 == 1073741824 || acw.height != -1) ? null : 1;
                    i14 = acw.topMargin + acw.bottomMargin;
                    measuredHeight = c3.getMeasuredHeight() + i14;
                    i17 = Math.max(i17, measuredHeight);
                    if (obj7 != null) {
                        i15 = i14;
                    } else {
                        i15 = measuredHeight;
                    }
                    i14 = Math.max(baseline, i15);
                    obj7 = (obj2 == null || acw.height != -1) ? null : 1;
                    if (z) {
                        i11 = c3.getBaseline();
                        if (i11 != -1) {
                            i3 = ((((acw.f308h < 0 ? this.f296e : acw.f308h) & 112) >> 4) & -2) >> 1;
                            iArr[i3] = Math.max(iArr[i3], i11);
                            iArr2[i3] = Math.max(iArr2[i3], measuredHeight - i11);
                        }
                    }
                    f4 = f5;
                    i11 = i14;
                    measuredHeight = childMeasureSpec;
                    obj3 = obj7;
                    i4 = i17;
                    i15 = i12;
                }
                i8++;
                obj2 = obj3;
                baseline = i11;
                i17 = i4;
                i4 = measuredHeight;
                f = f4;
                measuredHeight = i15;
            }
            this.f297f += getPaddingLeft() + getPaddingRight();
            if (!(iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1)) {
                i17 = Math.max(i17, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            i3 = baseline;
            i6 = i4;
            i15 = i17;
            obj4 = obj2;
        } else {
            baseline = Math.max(i7, i8);
            if (z2 && mode != 1073741824) {
                for (i15 = 0; i15 < m; i15++) {
                    view = m630c(i15);
                    if (!(view == null || view.getVisibility() == 8 || ((acw) view.getLayoutParams()).f307g <= 0.0f)) {
                        view.measure(MeasureSpec.makeMeasureSpec(i9, 1073741824), MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = baseline;
            i15 = i11;
        }
        if (obj4 != null || mode2 == 1073741824) {
            i3 = i15;
        }
        setMeasuredDimension((-16777216 & i6) | i5, oa.a(Math.max(i3 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, i6 << 16));
        if (obj5 != null) {
            measuredHeight = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            for (int i18 = 0; i18 < m; i18++) {
                c = m630c(i18);
                if (c.getVisibility() != 8) {
                    acw2 = (acw) c.getLayoutParams();
                    if (acw2.height == -1) {
                        a = acw2.width;
                        acw2.width = c.getMeasuredWidth();
                        measureChildWithMargins(c, i, 0, measuredHeight, 0);
                        acw2.width = a;
                    }
                }
            }
        }
    }

    void m629b(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f295d == 1) {
            m619a(i, i2, i3, i4);
        } else {
            m625b(i, i2, i3, i4);
        }
    }

    void m619a(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int i5 = i3 - i;
        int paddingRight = i5 - getPaddingRight();
        int paddingRight2 = (i5 - paddingLeft) - getPaddingRight();
        int m = m637m();
        int i6 = 8388615 & this.f296e;
        switch (this.f296e & 112) {
            case 16:
                i5 = getPaddingTop() + (((i4 - i2) - this.f297f) / 2);
                break;
            case 80:
                i5 = ((getPaddingTop() + i4) - i2) - this.f297f;
                break;
            default:
                i5 = getPaddingTop();
                break;
        }
        int i7 = 0;
        int i8 = i5;
        while (i7 < m) {
            View c = m630c(i7);
            if (c == null) {
                i5 = i7;
            } else if (c.getVisibility() != 8) {
                int measuredWidth = c.getMeasuredWidth();
                int measuredHeight = c.getMeasuredHeight();
                acw acw = (acw) c.getLayoutParams();
                int i9 = acw.f308h;
                if (i9 < 0) {
                    i9 = i6;
                }
                switch (mj.m32250a(i9, oa.d(this)) & 7) {
                    case 1:
                        i9 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + acw.leftMargin) - acw.rightMargin;
                        break;
                    case 5:
                        i9 = (paddingRight - measuredWidth) - acw.rightMargin;
                        break;
                    default:
                        i9 = acw.leftMargin + paddingLeft;
                        break;
                }
                if (m632d(i7)) {
                    i8 += this.f304m;
                }
                i8 += acw.topMargin;
                acv.m616a(c, i9, i8, measuredWidth, measuredHeight);
                i8 += acw.bottomMargin + measuredHeight;
                i5 = i7;
            } else {
                i5 = i7;
            }
            i7 = i5 + 1;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m625b(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        boolean a = age.m1025a(this);
        int paddingTop = getPaddingTop();
        int i7 = i4 - i2;
        int paddingBottom = i7 - getPaddingBottom();
        int paddingBottom2 = (i7 - paddingTop) - getPaddingBottom();
        int m = m637m();
        i7 = this.f296e & 8388615;
        int i8 = this.f296e & 112;
        boolean z = this.f292a;
        int[] iArr = this.f300i;
        int[] iArr2 = this.f301j;
        switch (mj.m32250a(i7, oa.d(this))) {
            case 1:
                paddingLeft = getPaddingLeft() + (((i3 - i) - this.f297f) / 2);
                break;
            case 5:
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.f297f;
                break;
            default:
                paddingLeft = getPaddingLeft();
                break;
        }
        if (a) {
            i5 = m - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i9 = 0;
        while (i9 < m) {
            int i10 = i5 + (i6 * i9);
            View c = m630c(i10);
            if (c == null) {
                i7 = i9;
            } else if (c.getVisibility() != 8) {
                int measuredWidth = c.getMeasuredWidth();
                int measuredHeight = c.getMeasuredHeight();
                int i11 = -1;
                acw acw = (acw) c.getLayoutParams();
                if (z && acw.height != -1) {
                    i11 = c.getBaseline();
                }
                int i12 = acw.f308h;
                if (i12 < 0) {
                    i12 = i8;
                }
                switch (i12 & 112) {
                    case 16:
                        i11 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + acw.topMargin) - acw.bottomMargin;
                        break;
                    case 48:
                        i12 = acw.topMargin + paddingTop;
                        if (i11 != -1) {
                            i11 = (iArr[1] - i11) + i12;
                            break;
                        }
                    case 80:
                        i12 = (paddingBottom - measuredHeight) - acw.bottomMargin;
                        if (i11 != -1) {
                            i11 = i12 - (iArr2[2] - (c.getMeasuredHeight() - i11));
                            break;
                        }
                    default:
                        i11 = paddingTop;
                        break;
                }
                if (m632d(i10)) {
                    i12 = this.f303l + paddingLeft;
                } else {
                    i12 = paddingLeft;
                }
                i12 += acw.leftMargin;
                acv.m616a(c, i12, i11, measuredWidth, measuredHeight);
                paddingLeft = i12 + (acw.rightMargin + measuredWidth);
                i7 = i9;
            } else {
                i7 = i9;
            }
            i9 = i7 + 1;
        }
    }

    private static void m616a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    public void m633e(int i) {
        if (this.f295d != i) {
            this.f295d = i;
            requestLayout();
        }
    }

    public void m634f(int i) {
        if (this.f296e != i) {
            int i2;
            if ((8388615 & i) == 0) {
                i2 = 8388611 | i;
            } else {
                i2 = i;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f296e = i2;
            requestLayout();
        }
    }

    public acw mo288b(AttributeSet attributeSet) {
        return new acw(getContext(), attributeSet);
    }

    public acw mo294k() {
        if (this.f295d == 0) {
            return new acw(-2, -2);
        }
        if (this.f295d == 1) {
            return new acw(-1, -2);
        }
        return null;
    }

    public acw mo289b(LayoutParams layoutParams) {
        return new acw(layoutParams);
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof acw;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(acv.class.getName());
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(acv.class.getName());
        }
    }
}
