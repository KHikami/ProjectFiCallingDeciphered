package defpackage;

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
import oa;

/* renamed from: acv */
public class acv extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private int[] i;
    private int[] j;
    private Drawable k;
    private int l;
    private int m;
    private int n;
    private int o;

    public /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return k();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return b(attributeSet);
    }

    public /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return b(layoutParams);
    }

    public acv(Context context) {
        this(context, null);
    }

    public acv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public acv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 8388659;
        afp a = afp.a(context, attributeSet, wi.bg, i, 0);
        int a2 = a.a(wi.bk, -1);
        if (a2 >= 0) {
            e(a2);
        }
        a2 = a.a(wi.bj, -1);
        if (a2 >= 0) {
            f(a2);
        }
        boolean a3 = a.a(wi.bh, true);
        if (!a3) {
            c(a3);
        }
        this.g = a.a(wi.bl, -1.0f);
        this.b = a.a(wi.bi, -1);
        this.h = a.a(wi.bo, false);
        b(a.a(wi.bm));
        this.n = a.a(wi.bp, 0);
        this.o = a.e(wi.bn, 0);
        a.a();
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void b(Drawable drawable) {
        boolean z = false;
        if (drawable != this.k) {
            this.k = drawable;
            if (drawable != null) {
                this.l = drawable.getIntrinsicWidth();
                this.m = drawable.getIntrinsicHeight();
            } else {
                this.l = 0;
                this.m = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public int l() {
        return this.l;
    }

    protected void onDraw(Canvas canvas) {
        if (this.k != null) {
            if (this.d == 1) {
                a(canvas);
            } else {
                b(canvas);
            }
        }
    }

    void a(Canvas canvas) {
        int m = m();
        int i = 0;
        while (i < m) {
            View c = c(i);
            if (!(c == null || c.getVisibility() == 8 || !d(i))) {
                a(canvas, (c.getTop() - ((acw) c.getLayoutParams()).topMargin) - this.m);
            }
            i++;
        }
        if (d(m)) {
            int height;
            View c2 = c(m - 1);
            if (c2 == null) {
                height = (getHeight() - getPaddingBottom()) - this.m;
            } else {
                acw acw = (acw) c2.getLayoutParams();
                height = acw.bottomMargin + c2.getBottom();
            }
            a(canvas, height);
        }
    }

    void b(Canvas canvas) {
        int m = m();
        boolean a = age.a(this);
        int i = 0;
        while (i < m) {
            acw acw;
            int right;
            View c = c(i);
            if (!(c == null || c.getVisibility() == 8 || !d(i))) {
                acw = (acw) c.getLayoutParams();
                if (a) {
                    right = acw.rightMargin + c.getRight();
                } else {
                    right = (c.getLeft() - acw.leftMargin) - this.l;
                }
                b(canvas, right);
            }
            i++;
        }
        if (d(m)) {
            View c2 = c(m - 1);
            if (c2 != null) {
                acw = (acw) c2.getLayoutParams();
                if (a) {
                    right = (c2.getLeft() - acw.leftMargin) - this.l;
                } else {
                    right = acw.rightMargin + c2.getRight();
                }
            } else if (a) {
                right = getPaddingLeft();
            } else {
                right = (getWidth() - getPaddingRight()) - this.l;
            }
            b(canvas, right);
        }
    }

    void a(Canvas canvas, int i) {
        this.k.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.k.draw(canvas);
    }

    void b(Canvas canvas, int i) {
        this.k.setBounds(i, getPaddingTop() + this.o, this.l + i, (getHeight() - getPaddingBottom()) - this.o);
        this.k.draw(canvas);
    }

    public void c(boolean z) {
        this.a = z;
    }

    public int getBaseline() {
        if (this.b < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.b) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.b);
        int baseline = childAt.getBaseline();
        if (baseline != -1) {
            int i;
            int i2 = this.c;
            if (this.d == 1) {
                i = this.e & 112;
                if (i != 48) {
                    switch (i) {
                        case wi.dI /*16*/:
                            i = i2 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f) / 2);
                            break;
                        case 80:
                            i = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
                            break;
                    }
                }
            }
            i = i2;
            return (((acw) childAt.getLayoutParams()).topMargin + i) + baseline;
        } else if (this.b == 0) {
            return -1;
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
    }

    View c(int i) {
        return getChildAt(i);
    }

    int m() {
        return getChildCount();
    }

    public void onMeasure(int i, int i2) {
        if (this.d == 1) {
            a(i, i2);
        } else {
            b(i, i2);
        }
    }

    protected boolean d(int i) {
        if (i == 0) {
            if ((this.n & 1) != 0) {
                return true;
            }
            return false;
        } else if (i == getChildCount()) {
            if ((this.n & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.n & 2) == 0) {
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

    void a(int i, int i2) {
        int i3;
        int i4;
        int measuredWidth;
        int i5;
        int i6;
        this.f = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        Object obj = 1;
        float f = 0.0f;
        int m = m();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        Object obj2 = null;
        Object obj3 = null;
        int i11 = this.b;
        boolean z = this.h;
        int i12 = nzf.UNSET_ENUM_VALUE;
        int i13 = 0;
        while (i13 < m) {
            int i14;
            int max;
            View c = c(i13);
            if (c == null) {
                this.f = this.f;
                i3 = i13;
            } else {
                Object obj4;
                int a;
                Object obj5;
                float f2;
                Object obj6;
                if (c.getVisibility() != 8) {
                    Object obj7;
                    if (d(i13)) {
                        this.f += this.m;
                    }
                    acw acw = (acw) c.getLayoutParams();
                    float f3 = f + acw.g;
                    if (mode2 == 1073741824 && acw.height == 0 && acw.g > 0.0f) {
                        i3 = this.f;
                        this.f = Math.max(i3, (acw.topMargin + i3) + acw.bottomMargin);
                        i14 = i12;
                        obj7 = 1;
                    } else {
                        i3 = nzf.UNSET_ENUM_VALUE;
                        if (acw.height == 0 && acw.g > 0.0f) {
                            i3 = 0;
                            acw.height = -2;
                        }
                        int i15 = i3;
                        b(c, i, 0, i2, f3 == 0.0f ? this.f : 0);
                        if (i15 != Integer.MIN_VALUE) {
                            acw.height = i15;
                        }
                        i3 = c.getMeasuredHeight();
                        int i16 = this.f;
                        this.f = Math.max(i16, ((i16 + i3) + acw.topMargin) + acw.bottomMargin);
                        if (z) {
                            i14 = Math.max(i3, i12);
                            obj7 = obj3;
                        } else {
                            i14 = i12;
                            obj7 = obj3;
                        }
                    }
                    if (i11 >= 0 && i11 == i13 + 1) {
                        this.c = this.f;
                    }
                    if (i13 >= i11 || acw.g <= 0.0f) {
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
                        a = age.a(i8, oa.f(c));
                        obj5 = (obj == null || acw.width != -1) ? null : 1;
                        if (acw.g > 0.0f) {
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
        if (this.f > 0 && d(m)) {
            this.f += this.m;
        }
        if (z && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.f = 0;
            i6 = 0;
            while (i6 < m) {
                View c2 = c(i6);
                if (c2 == null) {
                    this.f = this.f;
                    i3 = i6;
                } else if (c2.getVisibility() == 8) {
                    i3 = i6;
                } else {
                    acw acw2 = (acw) c2.getLayoutParams();
                    i4 = this.f;
                    this.f = Math.max(i4, acw2.bottomMargin + ((i4 + i12) + acw2.topMargin));
                    i3 = i6;
                }
                i6 = i3 + 1;
            }
        }
        this.f += getPaddingTop() + getPaddingBottom();
        i13 = oa.a(Math.max(this.f, getSuggestedMinimumHeight()), i2, 0);
        i4 = (16777215 & i13) - this.f;
        int i18;
        if (obj3 != null || (i4 != 0 && f > 0.0f)) {
            if (this.g > 0.0f) {
                f = this.g;
            }
            this.f = 0;
            i10 = 0;
            obj3 = obj;
            i18 = i9;
            i12 = i8;
            int i19 = i7;
            while (i10 < m) {
                float f4;
                Object obj9;
                View c3 = c(i10);
                if (c3.getVisibility() != 8) {
                    acw2 = (acw) c3.getLayoutParams();
                    float f5 = acw2.g;
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
                        i4 = age.a(i12, oa.f(c3) & -256);
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
                    max = this.f;
                    this.f = Math.max(max, acw2.bottomMargin + ((c3.getMeasuredHeight() + max) + acw2.topMargin));
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
            this.f += getPaddingTop() + getPaddingBottom();
            i3 = i18;
            i8 = i12;
            i6 = i19;
            obj = obj3;
        } else {
            i18 = Math.max(i9, i10);
            if (z && mode2 != 1073741824) {
                for (i6 = 0; i6 < m; i6++) {
                    View c4 = c(i6);
                    if (!(c4 == null || c4.getVisibility() == 8 || ((acw) c4.getLayoutParams()).g <= 0.0f)) {
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
            c(m, i2);
        }
    }

    private void c(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View c = c(i3);
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

    void b(int i, int i2) {
        Object obj;
        int i3;
        int measuredHeight;
        int i4;
        acw acw;
        this.f = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        Object obj2 = 1;
        float f = 0.0f;
        int m = m();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        Object obj3 = null;
        Object obj4 = null;
        if (this.i == null || this.j == null) {
            this.i = new int[4];
            this.j = new int[4];
        }
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z = this.a;
        boolean z2 = this.h;
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
            Object obj5;
            Object obj6;
            int i12;
            int a;
            int baseline;
            Object obj7;
            View c = c(i10);
            if (c == null) {
                this.f = this.f;
                i3 = i10;
            } else {
                float f2;
                Object obj8;
                if (c.getVisibility() != 8) {
                    if (d(i10)) {
                        this.f += this.l;
                    }
                    acw2 = (acw) c.getLayoutParams();
                    float f3 = f + acw2.g;
                    if (mode == 1073741824 && acw2.width == 0 && acw2.g > 0.0f) {
                        if (obj != null) {
                            this.f += acw2.leftMargin + acw2.rightMargin;
                        } else {
                            i3 = this.f;
                            this.f = Math.max(i3, (acw2.leftMargin + i3) + acw2.rightMargin);
                        }
                        if (z) {
                            i3 = MeasureSpec.makeMeasureSpec(0, 0);
                            c.measure(i3, i3);
                            i11 = i9;
                            obj5 = obj4;
                        } else {
                            i11 = i9;
                            i9 = 1;
                        }
                    } else {
                        i3 = nzf.UNSET_ENUM_VALUE;
                        if (acw2.width == 0 && acw2.g > 0.0f) {
                            i3 = 0;
                            acw2.width = -2;
                        }
                        int i13 = i3;
                        b(c, i, f3 == 0.0f ? this.f : 0, i2, 0);
                        if (i13 != Integer.MIN_VALUE) {
                            acw2.width = i13;
                        }
                        i3 = c.getMeasuredWidth();
                        if (obj != null) {
                            this.f += (acw2.leftMargin + i3) + acw2.rightMargin;
                        } else {
                            int i14 = this.f;
                            this.f = Math.max(i14, ((i14 + i3) + acw2.leftMargin) + acw2.rightMargin);
                        }
                        if (z2) {
                            i11 = Math.max(i3, i9);
                            obj5 = obj4;
                        } else {
                            i11 = i9;
                            obj5 = obj4;
                        }
                    }
                    Object obj9 = null;
                    if (mode2 == 1073741824 || acw2.height != -1) {
                        obj6 = obj3;
                    } else {
                        obj6 = 1;
                        obj9 = 1;
                    }
                    i12 = acw2.topMargin + acw2.bottomMargin;
                    measuredHeight = c.getMeasuredHeight() + i12;
                    a = age.a(i6, oa.f(c));
                    if (z) {
                        baseline = c.getBaseline();
                        if (baseline != -1) {
                            int i15 = ((((acw2.h < 0 ? this.e : acw2.h) & 112) >> 4) & -2) >> 1;
                            iArr[i15] = Math.max(iArr[i15], baseline);
                            iArr2[i15] = Math.max(iArr2[i15], measuredHeight - baseline);
                        }
                    }
                    baseline = Math.max(i5, measuredHeight);
                    obj7 = (obj2 == null || acw2.height != -1) ? null : 1;
                    if (acw2.g > 0.0f) {
                        if (obj9 != null) {
                            i3 = i12;
                        } else {
                            i3 = measuredHeight;
                        }
                        f2 = f3;
                        obj8 = obj7;
                        i4 = i7;
                        obj7 = obj5;
                        i9 = baseline;
                        int i16 = i11;
                        i11 = Math.max(i8, i3);
                        i3 = i16;
                    } else {
                        if (obj9 == null) {
                            i12 = measuredHeight;
                        }
                        i3 = Math.max(i7, i12);
                        f2 = f3;
                        obj8 = obj7;
                        i4 = i3;
                        obj7 = obj5;
                        i3 = i11;
                        i11 = i8;
                        i9 = baseline;
                    }
                } else {
                    i3 = i9;
                    obj7 = obj4;
                    f2 = f;
                    obj8 = obj2;
                    i11 = i8;
                    i4 = i7;
                    obj6 = obj3;
                    i9 = i5;
                    a = i6;
                }
                obj4 = obj7;
                obj2 = obj8;
                i8 = i11;
                i7 = i4;
                i6 = a;
                i5 = i9;
                obj3 = obj6;
                i9 = i3;
                f = f2;
                i3 = i10;
            }
            i10 = i3 + 1;
        }
        if (this.f > 0 && d(m)) {
            this.f += this.l;
        }
        if (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) {
            i12 = i5;
        } else {
            i12 = Math.max(i5, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        }
        if (z2 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f = 0;
            i15 = 0;
            while (i15 < m) {
                View c2 = c(i15);
                if (c2 == null) {
                    this.f = this.f;
                    i3 = i15;
                } else if (c2.getVisibility() == 8) {
                    i3 = i15;
                } else {
                    acw = (acw) c2.getLayoutParams();
                    if (obj != null) {
                        this.f = (acw.rightMargin + (acw.leftMargin + i9)) + this.f;
                        i3 = i15;
                    } else {
                        measuredHeight = this.f;
                        this.f = Math.max(measuredHeight, acw.rightMargin + ((measuredHeight + i9) + acw.leftMargin));
                        i3 = i15;
                    }
                }
                i15 = i3 + 1;
            }
        }
        this.f += getPaddingLeft() + getPaddingRight();
        i5 = oa.a(Math.max(this.f, getSuggestedMinimumWidth()), i, 0);
        measuredHeight = (16777215 & i5) - this.f;
        View view;
        if (obj4 != null || (measuredHeight != 0 && f > 0.0f)) {
            if (this.g > 0.0f) {
                f = this.g;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f = 0;
            i8 = 0;
            obj5 = obj2;
            baseline = i7;
            int i17 = -1;
            i11 = i6;
            while (i8 < m) {
                float f4;
                View c3 = c(i8);
                if (c3 == null || c3.getVisibility() == 8) {
                    f4 = f;
                    i15 = measuredHeight;
                    i12 = baseline;
                    obj6 = obj5;
                    measuredHeight = i11;
                    i11 = i17;
                } else {
                    int childMeasureSpec;
                    float f5;
                    acw = (acw) c3.getLayoutParams();
                    float f6 = acw.g;
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
                        childMeasureSpec = age.a(i11, oa.f(c3) & -16777216);
                        f5 = f6;
                        i4 = measuredHeight;
                    } else {
                        i4 = measuredHeight;
                        childMeasureSpec = i11;
                        f5 = f;
                    }
                    if (obj != null) {
                        this.f += (c3.getMeasuredWidth() + acw.leftMargin) + acw.rightMargin;
                    } else {
                        i15 = this.f;
                        this.f = Math.max(i15, ((c3.getMeasuredWidth() + i15) + acw.leftMargin) + acw.rightMargin);
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
                    obj7 = (obj5 == null || acw.height != -1) ? null : 1;
                    if (z) {
                        i12 = c3.getBaseline();
                        if (i12 != -1) {
                            i3 = ((((acw.h < 0 ? this.e : acw.h) & 112) >> 4) & -2) >> 1;
                            iArr[i3] = Math.max(iArr[i3], i12);
                            iArr2[i3] = Math.max(iArr2[i3], measuredHeight - i12);
                        }
                    }
                    f4 = f5;
                    i12 = i14;
                    measuredHeight = childMeasureSpec;
                    obj6 = obj7;
                    i11 = i17;
                    i15 = i4;
                }
                i8++;
                obj5 = obj6;
                baseline = i12;
                i17 = i11;
                i11 = measuredHeight;
                f = f4;
                measuredHeight = i15;
            }
            this.f += getPaddingLeft() + getPaddingRight();
            if (!(iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1)) {
                i17 = Math.max(i17, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            i3 = baseline;
            i6 = i11;
            i15 = i17;
            obj2 = obj5;
        } else {
            baseline = Math.max(i7, i8);
            if (z2 && mode != 1073741824) {
                for (i15 = 0; i15 < m; i15++) {
                    view = c(i15);
                    if (!(view == null || view.getVisibility() == 8 || ((acw) view.getLayoutParams()).g <= 0.0f)) {
                        view.measure(MeasureSpec.makeMeasureSpec(i9, 1073741824), MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = baseline;
            i15 = i12;
        }
        if (obj2 != null || mode2 == 1073741824) {
            i3 = i15;
        }
        setMeasuredDimension((-16777216 & i6) | i5, oa.a(Math.max(i3 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, i6 << 16));
        if (obj3 != null) {
            measuredHeight = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            for (int i18 = 0; i18 < m; i18++) {
                c = c(i18);
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

    void b(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.d == 1) {
            a(i, i2, i3, i4);
        } else {
            b(i, i2, i3, i4);
        }
    }

    void a(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int i5 = i3 - i;
        int paddingRight = i5 - getPaddingRight();
        int paddingRight2 = (i5 - paddingLeft) - getPaddingRight();
        int m = m();
        int i6 = 8388615 & this.e;
        switch (this.e & 112) {
            case wi.dI /*16*/:
                i5 = getPaddingTop() + (((i4 - i2) - this.f) / 2);
                break;
            case 80:
                i5 = ((getPaddingTop() + i4) - i2) - this.f;
                break;
            default:
                i5 = getPaddingTop();
                break;
        }
        int i7 = 0;
        int i8 = i5;
        while (i7 < m) {
            View c = c(i7);
            if (c == null) {
                i5 = i7;
            } else if (c.getVisibility() != 8) {
                int measuredWidth = c.getMeasuredWidth();
                int measuredHeight = c.getMeasuredHeight();
                acw acw = (acw) c.getLayoutParams();
                int i9 = acw.h;
                if (i9 < 0) {
                    i9 = i6;
                }
                switch (mj.a(i9, oa.d(this)) & 7) {
                    case wi.j /*1*/:
                        i9 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + acw.leftMargin) - acw.rightMargin;
                        break;
                    case wi.p /*5*/:
                        i9 = (paddingRight - measuredWidth) - acw.rightMargin;
                        break;
                    default:
                        i9 = acw.leftMargin + paddingLeft;
                        break;
                }
                if (d(i7)) {
                    i8 += this.m;
                }
                i8 += acw.topMargin;
                acv.a(c, i9, i8, measuredWidth, measuredHeight);
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
    void b(int r24, int r25, int r26, int r27) {
        /*
        r23 = this;
        r5 = defpackage.age.a(r23);
        r8 = r23.getPaddingTop();
        r3 = r27 - r25;
        r4 = r23.getPaddingBottom();
        r12 = r3 - r4;
        r3 = r3 - r8;
        r4 = r23.getPaddingBottom();
        r13 = r3 - r4;
        r14 = r23.m();
        r0 = r23;
        r3 = r0.e;
        r4 = 8388615; // 0x800007 float:1.1754953E-38 double:4.1445265E-317;
        r3 = r3 & r4;
        r0 = r23;
        r4 = r0.e;
        r11 = r4 & 112;
        r0 = r23;
        r15 = r0.a;
        r0 = r23;
        r0 = r0.i;
        r16 = r0;
        r0 = r23;
        r0 = r0.j;
        r17 = r0;
        r4 = oa.d(r23);
        r3 = defpackage.mj.a(r3, r4);
        switch(r3) {
            case 1: goto L_0x0075;
            case 5: goto L_0x0066;
            default: goto L_0x0044;
        };
    L_0x0044:
        r9 = r23.getPaddingLeft();
    L_0x0048:
        r4 = 0;
        r3 = 1;
        if (r5 == 0) goto L_0x011a;
    L_0x004c:
        r4 = r14 + -1;
        r3 = -1;
        r5 = r4;
        r4 = r3;
    L_0x0051:
        r10 = 0;
    L_0x0052:
        if (r10 >= r14) goto L_0x0112;
    L_0x0054:
        r3 = r4 * r10;
        r18 = r5 + r3;
        r0 = r23;
        r1 = r18;
        r19 = r0.c(r1);
        if (r19 != 0) goto L_0x0085;
    L_0x0062:
        r3 = r10;
    L_0x0063:
        r10 = r3 + 1;
        goto L_0x0052;
    L_0x0066:
        r3 = r23.getPaddingLeft();
        r3 = r3 + r26;
        r3 = r3 - r24;
        r0 = r23;
        r4 = r0.f;
        r9 = r3 - r4;
        goto L_0x0048;
    L_0x0075:
        r3 = r23.getPaddingLeft();
        r4 = r26 - r24;
        r0 = r23;
        r6 = r0.f;
        r4 = r4 - r6;
        r4 = r4 / 2;
        r9 = r3 + r4;
        goto L_0x0048;
    L_0x0085:
        r3 = r19.getVisibility();
        r6 = 8;
        if (r3 == r6) goto L_0x0117;
    L_0x008d:
        r20 = r19.getMeasuredWidth();
        r21 = r19.getMeasuredHeight();
        r6 = -1;
        r3 = r19.getLayoutParams();
        r3 = (defpackage.acw) r3;
        if (r15 == 0) goto L_0x00aa;
    L_0x009e:
        r7 = r3.height;
        r22 = -1;
        r0 = r22;
        if (r7 == r0) goto L_0x00aa;
    L_0x00a6:
        r6 = r19.getBaseline();
    L_0x00aa:
        r7 = r3.h;
        if (r7 >= 0) goto L_0x00af;
    L_0x00ae:
        r7 = r11;
    L_0x00af:
        r7 = r7 & 112;
        switch(r7) {
            case 16: goto L_0x00e9;
            case 48: goto L_0x00d8;
            case 80: goto L_0x00f5;
            default: goto L_0x00b4;
        };
    L_0x00b4:
        r6 = r8;
    L_0x00b5:
        r0 = r23;
        r1 = r18;
        r7 = r0.d(r1);
        if (r7 == 0) goto L_0x0113;
    L_0x00bf:
        r0 = r23;
        r7 = r0.l;
        r7 = r7 + r9;
    L_0x00c4:
        r9 = r3.leftMargin;
        r7 = r7 + r9;
        r0 = r19;
        r1 = r20;
        r2 = r21;
        defpackage.acv.a(r0, r7, r6, r1, r2);
        r3 = r3.rightMargin;
        r3 = r3 + r20;
        r9 = r7 + r3;
        r3 = r10;
        goto L_0x0063;
    L_0x00d8:
        r7 = r3.topMargin;
        r7 = r7 + r8;
        r22 = -1;
        r0 = r22;
        if (r6 == r0) goto L_0x0115;
    L_0x00e1:
        r22 = 1;
        r22 = r16[r22];
        r6 = r22 - r6;
        r6 = r6 + r7;
        goto L_0x00b5;
    L_0x00e9:
        r6 = r13 - r21;
        r6 = r6 / 2;
        r6 = r6 + r8;
        r7 = r3.topMargin;
        r6 = r6 + r7;
        r7 = r3.bottomMargin;
        r6 = r6 - r7;
        goto L_0x00b5;
    L_0x00f5:
        r7 = r12 - r21;
        r0 = r3.bottomMargin;
        r22 = r0;
        r7 = r7 - r22;
        r22 = -1;
        r0 = r22;
        if (r6 == r0) goto L_0x0115;
    L_0x0103:
        r22 = r19.getMeasuredHeight();
        r6 = r22 - r6;
        r22 = 2;
        r22 = r17[r22];
        r6 = r22 - r6;
        r6 = r7 - r6;
        goto L_0x00b5;
    L_0x0112:
        return;
    L_0x0113:
        r7 = r9;
        goto L_0x00c4;
    L_0x0115:
        r6 = r7;
        goto L_0x00b5;
    L_0x0117:
        r3 = r10;
        goto L_0x0063;
    L_0x011a:
        r5 = r4;
        r4 = r3;
        goto L_0x0051;
        */
        throw new UnsupportedOperationException("Method not decompiled: acv.b(int, int, int, int):void");
    }

    private static void a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    public void e(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void f(int i) {
        if (this.e != i) {
            int i2;
            if ((8388615 & i) == 0) {
                i2 = 8388611 | i;
            } else {
                i2 = i;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.e = i2;
            requestLayout();
        }
    }

    public acw b(AttributeSet attributeSet) {
        return new acw(getContext(), attributeSet);
    }

    public acw k() {
        if (this.d == 0) {
            return new acw(-2, -2);
        }
        if (this.d == 1) {
            return new acw(-1, -2);
        }
        return null;
    }

    public acw b(LayoutParams layoutParams) {
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
