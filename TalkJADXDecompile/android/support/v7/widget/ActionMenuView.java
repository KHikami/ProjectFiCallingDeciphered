package android.support.v7.widget;

import acv;
import acw;
import age;
import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import nzf;
import xy;
import xz;
import ya;
import yc;
import yo;
import yp;
import zh;
import zo;
import zp;
import zq;
import zr;
import zs;

public class ActionMenuView extends acv implements ya, yp {
    public xz a;
    public zs b;
    private xy c;
    private Context d;
    private int e;
    private boolean f;
    private zh g;
    private yo h;
    private boolean i;
    private int j;
    private int k;
    private int l;

    public /* synthetic */ acw b(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    protected /* synthetic */ acw b(LayoutParams layoutParams) {
        return a(layoutParams);
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return b();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return a(layoutParams);
    }

    protected /* synthetic */ acw k() {
        return b();
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.k = (int) (56.0f * f);
        this.l = (int) (f * 4.0f);
        this.d = context;
        this.e = 0;
    }

    public void a(int i) {
        if (this.e != i) {
            this.e = i;
            if (i == 0) {
                this.d = getContext();
            } else {
                this.d = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void a(zh zhVar) {
        this.g = zhVar;
        this.g.a(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.g != null) {
            this.g.b(false);
            if (this.g.h()) {
                this.g.e();
                this.g.d();
            }
        }
    }

    public void a(zs zsVar) {
        this.b = zsVar;
    }

    protected void onMeasure(int i, int i2) {
        boolean z = this.i;
        this.i = MeasureSpec.getMode(i) == 1073741824;
        if (z != this.i) {
            this.j = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (!(!this.i || this.c == null || size == this.j)) {
            this.j = size;
            this.c.b(true);
        }
        int childCount = getChildCount();
        int i3;
        if (!this.i || childCount <= 0) {
            for (i3 = 0; i3 < childCount; i3++) {
                zq zqVar = (zq) getChildAt(i3).getLayoutParams();
                zqVar.rightMargin = 0;
                zqVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i2);
        size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        i3 = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int i4 = size - i3;
        int i5 = i4 / this.k;
        size = i4 % this.k;
        if (i5 == 0) {
            setMeasuredDimension(i4, 0);
            return;
        }
        Object obj;
        Object obj2;
        int i6 = this.k + (size / i5);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        i3 = 0;
        Object obj3 = null;
        long j = 0;
        int childCount2 = getChildCount();
        int i10 = 0;
        while (i10 < childCount2) {
            int i11;
            int i12;
            int i13;
            long j2;
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                boolean z2 = childAt instanceof ActionMenuItemView;
                i11 = i3 + 1;
                if (z2) {
                    childAt.setPadding(this.l, 0, this.l, 0);
                }
                zqVar = (zq) childAt.getLayoutParams();
                zqVar.f = false;
                zqVar.c = 0;
                zqVar.b = 0;
                zqVar.d = false;
                zqVar.leftMargin = 0;
                zqVar.rightMargin = 0;
                z = z2 && ((ActionMenuItemView) childAt).e();
                zqVar.e = z;
                if (zqVar.a) {
                    i3 = 1;
                } else {
                    i3 = i5;
                }
                int a = a(childAt, i6, i3, childMeasureSpec, paddingTop);
                i8 = Math.max(i8, a);
                if (zqVar.d) {
                    i3 = i9 + 1;
                } else {
                    i3 = i9;
                }
                if (zqVar.a) {
                    obj = 1;
                } else {
                    obj = obj3;
                }
                int i14 = i5 - a;
                i9 = Math.max(i7, childAt.getMeasuredHeight());
                if (a == 1) {
                    long j3 = ((long) (1 << i10)) | j;
                    i12 = i9;
                    i13 = i14;
                    i9 = i3;
                    obj3 = obj;
                    j2 = j3;
                    i5 = i8;
                    childCount = i11;
                } else {
                    childCount = i11;
                    i5 = i8;
                    long j4 = j;
                    i12 = i9;
                    i13 = i14;
                    obj3 = obj;
                    i9 = i3;
                    j2 = j4;
                }
            } else {
                childCount = i3;
                j2 = j;
                i12 = i7;
                i13 = i5;
                i5 = i8;
            }
            i10++;
            i8 = i5;
            i7 = i12;
            i5 = i13;
            j = j2;
            i3 = childCount;
        }
        if (obj3 == null || i3 != 2) {
            obj2 = null;
        } else {
            obj2 = 1;
        }
        Object obj4 = null;
        long j5 = j;
        paddingTop = i5;
        while (i9 > 0 && paddingTop > 0) {
            i11 = Integer.MAX_VALUE;
            j = 0;
            i5 = 0;
            int i15 = 0;
            while (i15 < childCount2) {
                zqVar = (zq) getChildAt(i15).getLayoutParams();
                if (zqVar.d) {
                    int i16 = zqVar.b;
                    if (r0 < i11) {
                        i5 = zqVar.b;
                        j = (long) (1 << i15);
                        size = 1;
                    } else if (zqVar.b == i11) {
                        j |= (long) (1 << i15);
                        size = i5 + 1;
                        i5 = i11;
                    }
                    i15++;
                    i11 = i5;
                    i5 = size;
                }
                size = i5;
                i5 = i11;
                i15++;
                i11 = i5;
                i5 = size;
            }
            j5 |= j;
            if (i5 > paddingTop) {
                break;
            }
            i15 = i11 + 1;
            i11 = 0;
            i5 = paddingTop;
            long j6 = j5;
            while (i11 < childCount2) {
                View childAt2 = getChildAt(i11);
                zqVar = (zq) childAt2.getLayoutParams();
                if ((((long) (1 << i11)) & j) != 0) {
                    if (obj2 != null && zqVar.e && i5 == 1) {
                        childAt2.setPadding(this.l + i6, 0, this.l, 0);
                    }
                    zqVar.b++;
                    zqVar.f = true;
                    size = i5 - 1;
                } else if (zqVar.b == i15) {
                    j6 |= (long) (1 << i11);
                    size = i5;
                } else {
                    size = i5;
                }
                i11++;
                i5 = size;
            }
            j5 = j6;
            i10 = 1;
            paddingTop = i5;
        }
        j = j5;
        obj = (obj3 == null && i3 == 1) ? 1 : null;
        if (paddingTop <= 0 || j == 0 || (paddingTop >= i3 - 1 && obj == null && i8 <= 1)) {
            obj2 = obj4;
        } else {
            float f;
            View childAt3;
            float bitCount = (float) Long.bitCount(j);
            if (obj == null) {
                if (!((1 & j) == 0 || ((zq) getChildAt(0).getLayoutParams()).e)) {
                    bitCount -= 0.5f;
                }
                if (!((((long) (1 << (childCount2 - 1))) & j) == 0 || ((zq) getChildAt(childCount2 - 1).getLayoutParams()).e)) {
                    f = bitCount - 0.5f;
                    if (f <= 0.0f) {
                        i3 = (int) (((float) (paddingTop * i6)) / f);
                    } else {
                        i3 = 0;
                    }
                    i5 = 0;
                    obj2 = obj4;
                    while (i5 < childCount2) {
                        if ((((long) (1 << i5)) & j) != 0) {
                            childAt3 = getChildAt(i5);
                            zqVar = (zq) childAt3.getLayoutParams();
                            if (childAt3 instanceof ActionMenuItemView) {
                                zqVar.c = i3;
                                zqVar.f = true;
                                if (i5 == 0 && !zqVar.e) {
                                    zqVar.leftMargin = (-i3) / 2;
                                }
                                obj = 1;
                            } else if (zqVar.a) {
                                if (i5 != 0) {
                                    zqVar.leftMargin = i3 / 2;
                                }
                                if (i5 != childCount2 - 1) {
                                    zqVar.rightMargin = i3 / 2;
                                }
                            } else {
                                zqVar.c = i3;
                                zqVar.f = true;
                                zqVar.rightMargin = (-i3) / 2;
                                obj = 1;
                            }
                            i5++;
                            obj2 = obj;
                        }
                        obj = obj2;
                        i5++;
                        obj2 = obj;
                    }
                }
            }
            f = bitCount;
            if (f <= 0.0f) {
                i3 = 0;
            } else {
                i3 = (int) (((float) (paddingTop * i6)) / f);
            }
            i5 = 0;
            obj2 = obj4;
            while (i5 < childCount2) {
                if ((((long) (1 << i5)) & j) != 0) {
                    childAt3 = getChildAt(i5);
                    zqVar = (zq) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        zqVar.c = i3;
                        zqVar.f = true;
                        zqVar.leftMargin = (-i3) / 2;
                        obj = 1;
                    } else if (zqVar.a) {
                        if (i5 != 0) {
                            zqVar.leftMargin = i3 / 2;
                        }
                        if (i5 != childCount2 - 1) {
                            zqVar.rightMargin = i3 / 2;
                        }
                    } else {
                        zqVar.c = i3;
                        zqVar.f = true;
                        zqVar.rightMargin = (-i3) / 2;
                        obj = 1;
                    }
                    i5++;
                    obj2 = obj;
                }
                obj = obj2;
                i5++;
                obj2 = obj;
            }
        }
        if (obj2 != null) {
            for (i3 = 0; i3 < childCount2; i3++) {
                childAt = getChildAt(i3);
                zqVar = (zq) childAt.getLayoutParams();
                if (zqVar.f) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(zqVar.c + (zqVar.b * i6), 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode == 1073741824) {
            i7 = size2;
        }
        setMeasuredDimension(i4, i7);
    }

    public static int a(View view, int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        boolean z2 = false;
        zq zqVar = (zq) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        if (actionMenuItemView == null || !actionMenuItemView.e()) {
            z = false;
        } else {
            z = true;
        }
        if (i2 <= 0 || (z && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i * i2, nzf.UNSET_ENUM_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            i5 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i5++;
            }
            if (z && r1 < 2) {
                i5 = 2;
            }
        }
        if (!zqVar.a && z) {
            z2 = true;
        }
        zqVar.d = z2;
        zqVar.b = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i5 * i, 1073741824), makeMeasureSpec);
        return i5;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.i) {
            zq zqVar;
            int measuredWidth;
            int paddingLeft;
            int i5;
            int childCount = getChildCount();
            int i6 = (i4 - i2) / 2;
            int l = l();
            int i7 = 0;
            int paddingRight = ((i3 - i) - getPaddingRight()) - getPaddingLeft();
            Object obj = null;
            boolean a = age.a(this);
            int i8 = 0;
            while (i8 < childCount) {
                Object obj2;
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8) {
                    zqVar = (zq) childAt.getLayoutParams();
                    if (zqVar.a) {
                        measuredWidth = childAt.getMeasuredWidth();
                        if (b(i8)) {
                            measuredWidth += l;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (a) {
                            paddingLeft = zqVar.leftMargin + getPaddingLeft();
                            i5 = paddingLeft + measuredWidth;
                        } else {
                            i5 = (getWidth() - getPaddingRight()) - zqVar.rightMargin;
                            paddingLeft = i5 - measuredWidth;
                        }
                        int i9 = i6 - (measuredHeight / 2);
                        childAt.layout(paddingLeft, i9, i5, measuredHeight + i9);
                        measuredWidth = paddingRight - measuredWidth;
                        obj2 = 1;
                        i5 = i7;
                    } else {
                        paddingLeft = paddingRight - (zqVar.rightMargin + (childAt.getMeasuredWidth() + zqVar.leftMargin));
                        b(i8);
                        i5 = i7 + 1;
                        Object obj3 = obj;
                        measuredWidth = paddingLeft;
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj;
                    i5 = i7;
                    measuredWidth = paddingRight;
                }
                i8++;
                i7 = i5;
                paddingRight = measuredWidth;
                obj = obj2;
            }
            if (childCount == 1 && obj == null) {
                View childAt2 = getChildAt(0);
                measuredWidth = childAt2.getMeasuredWidth();
                i5 = childAt2.getMeasuredHeight();
                paddingRight = ((i3 - i) / 2) - (measuredWidth / 2);
                i7 = i6 - (i5 / 2);
                childAt2.layout(paddingRight, i7, measuredWidth + paddingRight, i5 + i7);
                return;
            }
            paddingLeft = i7 - (obj != null ? 0 : 1);
            paddingRight = Math.max(0, paddingLeft > 0 ? paddingRight / paddingLeft : 0);
            View childAt3;
            int i10;
            if (a) {
                measuredWidth = getWidth() - getPaddingRight();
                i5 = 0;
                while (i5 < childCount) {
                    childAt3 = getChildAt(i5);
                    zqVar = (zq) childAt3.getLayoutParams();
                    if (childAt3.getVisibility() == 8 || zqVar.a) {
                        paddingLeft = measuredWidth;
                    } else {
                        measuredWidth -= zqVar.rightMargin;
                        i8 = childAt3.getMeasuredWidth();
                        l = childAt3.getMeasuredHeight();
                        i10 = i6 - (l / 2);
                        childAt3.layout(measuredWidth - i8, i10, measuredWidth, l + i10);
                        paddingLeft = measuredWidth - ((zqVar.leftMargin + i8) + paddingRight);
                    }
                    i5++;
                    measuredWidth = paddingLeft;
                }
                return;
            }
            measuredWidth = getPaddingLeft();
            i5 = 0;
            while (i5 < childCount) {
                childAt3 = getChildAt(i5);
                zqVar = (zq) childAt3.getLayoutParams();
                if (childAt3.getVisibility() == 8 || zqVar.a) {
                    paddingLeft = measuredWidth;
                } else {
                    measuredWidth += zqVar.leftMargin;
                    i8 = childAt3.getMeasuredWidth();
                    l = childAt3.getMeasuredHeight();
                    i10 = i6 - (l / 2);
                    childAt3.layout(measuredWidth, i10, measuredWidth + i8, l + i10);
                    paddingLeft = ((zqVar.rightMargin + i8) + paddingRight) + measuredWidth;
                }
                i5++;
                measuredWidth = paddingLeft;
            }
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
    }

    public boolean a() {
        return this.f;
    }

    public void a(boolean z) {
        this.f = z;
    }

    protected zq b() {
        zq zqVar = new zq(-2, -2);
        zqVar.h = 16;
        return zqVar;
    }

    public zq a(AttributeSet attributeSet) {
        return new zq(getContext(), attributeSet);
    }

    public zq a(LayoutParams layoutParams) {
        if (layoutParams == null) {
            return b();
        }
        zq zqVar = layoutParams instanceof zq ? new zq((zq) layoutParams) : new zq(layoutParams);
        if (zqVar.h > 0) {
            return zqVar;
        }
        zqVar.h = 16;
        return zqVar;
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof zq);
    }

    public zq c() {
        zq b = b();
        b.a = true;
        return b;
    }

    public boolean a(yc ycVar) {
        return this.c.a(ycVar, 0);
    }

    public void a(xy xyVar) {
        this.c = xyVar;
    }

    public Menu d() {
        if (this.c == null) {
            yo yoVar;
            Context context = getContext();
            this.c = new xy(context);
            this.c.a(new zr(this));
            this.g = new zh(context);
            this.g.c(true);
            zh zhVar = this.g;
            if (this.h != null) {
                yoVar = this.h;
            } else {
                yoVar = new zp(this);
            }
            zhVar.a(yoVar);
            this.c.a(this.g, this.d);
            this.g.a(this);
        }
        return this.c;
    }

    public void a(yo yoVar, xz xzVar) {
        this.h = yoVar;
        this.a = xzVar;
    }

    public xy e() {
        return this.c;
    }

    public boolean f() {
        return this.g != null && this.g.d();
    }

    public boolean g() {
        return this.g != null && this.g.e();
    }

    public boolean h() {
        return this.g != null && this.g.h();
    }

    public boolean i() {
        return this.g != null && this.g.i();
    }

    public void j() {
        if (this.g != null) {
            this.g.f();
        }
    }

    protected boolean b(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof zo)) {
            z = ((zo) childAt).g() | 0;
        }
        return (i <= 0 || !(childAt2 instanceof zo)) ? z : ((zo) childAt2).f() | z;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public void b(boolean z) {
        this.g.d(true);
    }
}
