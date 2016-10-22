package android.support.v7.widget;

import aav;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import oe;
import sj;
import su;
import sv;
import sw;
import sy;
import tk;
import tl;
import ud;
import uk;
import ul;
import um;
import un;
import uo;
import xp;
import xq;

/* compiled from: PG */
public class ActionMenuView extends xp implements sw, tl {
    public su a;
    public boolean b;
    public ud c;
    public sv d;
    public uo e;
    private Context h;
    private int i;
    private tk j;
    private boolean k;
    private int l;
    private int m;
    private int n;

    public final /* synthetic */ xq a(AttributeSet attributeSet) {
        return b(attributeSet);
    }

    protected final /* synthetic */ xq b(LayoutParams layoutParams) {
        return a(layoutParams);
    }

    protected final /* synthetic */ xq d() {
        return a();
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return b(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = false;
        float f = context.getResources().getDisplayMetrics().density;
        this.m = (int) (56.0f * f);
        this.n = (int) (f * 4.0f);
        this.h = context;
        this.i = 0;
    }

    public final void a(int i) {
        if (this.i != i) {
            this.i = i;
            if (i == 0) {
                this.h = getContext();
            } else {
                this.h = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void a(ud udVar) {
        this.c = udVar;
        this.c.a(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        if (this.c != null) {
            this.c.b(false);
            if (this.c.f()) {
                this.c.c();
                this.c.b();
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        boolean z = this.k;
        this.k = MeasureSpec.getMode(i) == 1073741824;
        if (z != this.k) {
            this.l = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (!(!this.k || this.a == null || size == this.l)) {
            this.l = size;
            this.a.b(true);
        }
        int childCount = getChildCount();
        int i3;
        if (!this.k || childCount <= 0) {
            for (i3 = 0; i3 < childCount; i3++) {
                um umVar = (um) getChildAt(i3).getLayoutParams();
                umVar.rightMargin = 0;
                umVar.leftMargin = 0;
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
        int i5 = i4 / this.m;
        size = i4 % this.m;
        if (i5 == 0) {
            setMeasuredDimension(i4, 0);
            return;
        }
        int i6;
        int i7;
        Object obj;
        Object obj2;
        long j;
        int i8 = this.m + (size / i5);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        i3 = 0;
        Object obj3 = null;
        long j2 = 0;
        int childCount2 = getChildCount();
        int i12 = 0;
        while (i12 < childCount2) {
            int i13;
            long j3;
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                Object obj4;
                boolean z2 = childAt instanceof ActionMenuItemView;
                i6 = i3 + 1;
                if (z2) {
                    childAt.setPadding(this.n, 0, this.n, 0);
                }
                umVar = (um) childAt.getLayoutParams();
                umVar.f = false;
                umVar.c = 0;
                umVar.b = 0;
                umVar.d = false;
                umVar.leftMargin = 0;
                umVar.rightMargin = 0;
                z = z2 && ((ActionMenuItemView) childAt).e();
                umVar.e = z;
                if (umVar.a) {
                    i13 = 1;
                } else {
                    i13 = i5;
                }
                um umVar2 = (um) childAt.getLayoutParams();
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(childMeasureSpec) - paddingTop, MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = childAt instanceof ActionMenuItemView ? (ActionMenuItemView) childAt : null;
                if (actionMenuItemView == null || !actionMenuItemView.e()) {
                    obj4 = null;
                } else {
                    obj4 = 1;
                }
                i7 = 0;
                if (i13 > 0 && (obj4 == null || i13 >= 2)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(i8 * i13, oe.INVALID_ID), makeMeasureSpec);
                    i13 = childAt.getMeasuredWidth();
                    i7 = i13 / i8;
                    if (i13 % i8 != 0) {
                        i7++;
                    }
                    if (obj4 != null && r9 < 2) {
                        i7 = 2;
                    }
                }
                boolean z3 = (umVar2.a || obj4 == null) ? false : true;
                umVar2.d = z3;
                umVar2.b = i7;
                childAt.measure(MeasureSpec.makeMeasureSpec(i7 * i8, 1073741824), makeMeasureSpec);
                i13 = Math.max(i10, i7);
                if (umVar.d) {
                    i3 = i11 + 1;
                } else {
                    i3 = i11;
                }
                if (umVar.a) {
                    obj = 1;
                } else {
                    obj = obj3;
                }
                i11 = i5 - i7;
                i5 = Math.max(i9, childAt.getMeasuredHeight());
                if (i7 == 1) {
                    obj3 = obj;
                    childCount = i6;
                    i7 = i13;
                    i13 = i5;
                    i5 = i11;
                    i11 = i3;
                    j3 = ((long) (1 << i12)) | j2;
                } else {
                    obj3 = obj;
                    childCount = i6;
                    i7 = i13;
                    i13 = i5;
                    i5 = i11;
                    i11 = i3;
                    j3 = j2;
                }
            } else {
                childCount = i3;
                i7 = i10;
                i13 = i9;
                j3 = j2;
            }
            i12++;
            i10 = i7;
            i9 = i13;
            j2 = j3;
            i3 = childCount;
        }
        if (obj3 == null || i3 != 2) {
            obj2 = null;
        } else {
            obj2 = 1;
        }
        long j4 = j2;
        i6 = i5;
        Object obj5 = null;
        while (i11 > 0 && i6 > 0) {
            int i14 = Integer.MAX_VALUE;
            j = 0;
            i7 = 0;
            paddingTop = 0;
            while (paddingTop < childCount2) {
                umVar = (um) getChildAt(paddingTop).getLayoutParams();
                if (umVar.d) {
                    makeMeasureSpec = umVar.b;
                    if (r0 < i14) {
                        i7 = umVar.b;
                        j = (long) (1 << paddingTop);
                        size = 1;
                    } else if (umVar.b == i14) {
                        j |= (long) (1 << paddingTop);
                        size = i7 + 1;
                        i7 = i14;
                    }
                    paddingTop++;
                    i14 = i7;
                    i7 = size;
                }
                size = i7;
                i7 = i14;
                paddingTop++;
                i14 = i7;
                i7 = size;
            }
            j4 |= j;
            if (i7 > i6) {
                break;
            }
            paddingTop = i14 + 1;
            j2 = j4;
            i7 = i6;
            i6 = 0;
            while (i6 < childCount2) {
                View childAt2 = getChildAt(i6);
                umVar = (um) childAt2.getLayoutParams();
                if ((((long) (1 << i6)) & j) != 0) {
                    if (obj2 != null && umVar.e && i7 == 1) {
                        childAt2.setPadding(this.n + i8, 0, this.n, 0);
                    }
                    umVar.b++;
                    umVar.f = true;
                    size = i7 - 1;
                } else if (umVar.b == paddingTop) {
                    j2 |= (long) (1 << i6);
                    size = i7;
                } else {
                    size = i7;
                }
                i6++;
                i7 = size;
            }
            j4 = j2;
            i6 = i7;
            int i15 = 1;
        }
        j = j4;
        obj = (obj3 == null && i3 == 1) ? 1 : null;
        if (i6 <= 0 || j == 0 || (i6 >= i3 - 1 && obj == null && i10 <= 1)) {
            obj2 = obj5;
        } else {
            float f;
            View childAt3;
            float bitCount = (float) Long.bitCount(j);
            if (obj == null) {
                if (!((1 & j) == 0 || ((um) getChildAt(0).getLayoutParams()).e)) {
                    bitCount -= 0.5f;
                }
                if (!((((long) (1 << (childCount2 - 1))) & j) == 0 || ((um) getChildAt(childCount2 - 1).getLayoutParams()).e)) {
                    f = bitCount - 0.5f;
                    if (f <= 0.0f) {
                        i3 = (int) (((float) (i6 * i8)) / f);
                    } else {
                        i3 = 0;
                    }
                    i7 = 0;
                    obj2 = obj5;
                    while (i7 < childCount2) {
                        if ((((long) (1 << i7)) & j) != 0) {
                            childAt3 = getChildAt(i7);
                            umVar = (um) childAt3.getLayoutParams();
                            if (childAt3 instanceof ActionMenuItemView) {
                                umVar.c = i3;
                                umVar.f = true;
                                if (i7 == 0 && !umVar.e) {
                                    umVar.leftMargin = (-i3) / 2;
                                }
                                obj = 1;
                            } else if (umVar.a) {
                                if (i7 != 0) {
                                    umVar.leftMargin = i3 / 2;
                                }
                                if (i7 != childCount2 - 1) {
                                    umVar.rightMargin = i3 / 2;
                                }
                            } else {
                                umVar.c = i3;
                                umVar.f = true;
                                umVar.rightMargin = (-i3) / 2;
                                obj = 1;
                            }
                            i7++;
                            obj2 = obj;
                        }
                        obj = obj2;
                        i7++;
                        obj2 = obj;
                    }
                }
            }
            f = bitCount;
            if (f <= 0.0f) {
                i3 = 0;
            } else {
                i3 = (int) (((float) (i6 * i8)) / f);
            }
            i7 = 0;
            obj2 = obj5;
            while (i7 < childCount2) {
                if ((((long) (1 << i7)) & j) != 0) {
                    childAt3 = getChildAt(i7);
                    umVar = (um) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        umVar.c = i3;
                        umVar.f = true;
                        umVar.leftMargin = (-i3) / 2;
                        obj = 1;
                    } else if (umVar.a) {
                        if (i7 != 0) {
                            umVar.leftMargin = i3 / 2;
                        }
                        if (i7 != childCount2 - 1) {
                            umVar.rightMargin = i3 / 2;
                        }
                    } else {
                        umVar.c = i3;
                        umVar.f = true;
                        umVar.rightMargin = (-i3) / 2;
                        obj = 1;
                    }
                    i7++;
                    obj2 = obj;
                }
                obj = obj2;
                i7++;
                obj2 = obj;
            }
        }
        if (obj2 != null) {
            for (i3 = 0; i3 < childCount2; i3++) {
                childAt = getChildAt(i3);
                umVar = (um) childAt.getLayoutParams();
                if (umVar.f) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(umVar.c + (umVar.b * i8), 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode == 1073741824) {
            i9 = size2;
        }
        setMeasuredDimension(i4, i9);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.k) {
            um umVar;
            int measuredWidth;
            int paddingLeft;
            int i5;
            int childCount = getChildCount();
            int i6 = (i4 - i2) / 2;
            int i7 = this.g;
            int i8 = 0;
            int paddingRight = ((i3 - i) - getPaddingRight()) - getPaddingLeft();
            Object obj = null;
            boolean a = aav.a(this);
            int i9 = 0;
            while (i9 < childCount) {
                Object obj2;
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8) {
                    umVar = (um) childAt.getLayoutParams();
                    if (umVar.a) {
                        measuredWidth = childAt.getMeasuredWidth();
                        if (d(i9)) {
                            measuredWidth += i7;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (a) {
                            paddingLeft = umVar.leftMargin + getPaddingLeft();
                            i5 = paddingLeft + measuredWidth;
                        } else {
                            i5 = (getWidth() - getPaddingRight()) - umVar.rightMargin;
                            paddingLeft = i5 - measuredWidth;
                        }
                        int i10 = i6 - (measuredHeight / 2);
                        childAt.layout(paddingLeft, i10, i5, measuredHeight + i10);
                        measuredWidth = paddingRight - measuredWidth;
                        obj2 = 1;
                        i5 = i8;
                    } else {
                        paddingLeft = paddingRight - (umVar.rightMargin + (childAt.getMeasuredWidth() + umVar.leftMargin));
                        d(i9);
                        i5 = i8 + 1;
                        Object obj3 = obj;
                        measuredWidth = paddingLeft;
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj;
                    i5 = i8;
                    measuredWidth = paddingRight;
                }
                i9++;
                i8 = i5;
                paddingRight = measuredWidth;
                obj = obj2;
            }
            if (childCount == 1 && obj == null) {
                View childAt2 = getChildAt(0);
                measuredWidth = childAt2.getMeasuredWidth();
                i5 = childAt2.getMeasuredHeight();
                paddingRight = ((i3 - i) / 2) - (measuredWidth / 2);
                i8 = i6 - (i5 / 2);
                childAt2.layout(paddingRight, i8, measuredWidth + paddingRight, i5 + i8);
                return;
            }
            paddingLeft = i8 - (obj != null ? 0 : 1);
            paddingRight = Math.max(0, paddingLeft > 0 ? paddingRight / paddingLeft : 0);
            View childAt3;
            int i11;
            if (a) {
                measuredWidth = getWidth() - getPaddingRight();
                i5 = 0;
                while (i5 < childCount) {
                    childAt3 = getChildAt(i5);
                    umVar = (um) childAt3.getLayoutParams();
                    if (childAt3.getVisibility() == 8 || umVar.a) {
                        paddingLeft = measuredWidth;
                    } else {
                        measuredWidth -= umVar.rightMargin;
                        i9 = childAt3.getMeasuredWidth();
                        i7 = childAt3.getMeasuredHeight();
                        i11 = i6 - (i7 / 2);
                        childAt3.layout(measuredWidth - i9, i11, measuredWidth, i7 + i11);
                        paddingLeft = measuredWidth - ((umVar.leftMargin + i9) + paddingRight);
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
                umVar = (um) childAt3.getLayoutParams();
                if (childAt3.getVisibility() == 8 || umVar.a) {
                    paddingLeft = measuredWidth;
                } else {
                    measuredWidth += umVar.leftMargin;
                    i9 = childAt3.getMeasuredWidth();
                    i7 = childAt3.getMeasuredHeight();
                    i11 = i6 - (i7 / 2);
                    childAt3.layout(measuredWidth, i11, measuredWidth + i9, i7 + i11);
                    paddingLeft = ((umVar.rightMargin + i9) + paddingRight) + measuredWidth;
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
        c();
    }

    public static um a() {
        um umVar = new um(-2, -2);
        umVar.h = 16;
        return umVar;
    }

    private um b(AttributeSet attributeSet) {
        return new um(getContext(), attributeSet);
    }

    public final um a(LayoutParams layoutParams) {
        if (layoutParams == null) {
            return a();
        }
        um umVar = layoutParams instanceof um ? new um((um) layoutParams) : new um(layoutParams);
        if (umVar.h > 0) {
            return umVar;
        }
        umVar.h = 16;
        return umVar;
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof um);
    }

    public final boolean a(sy syVar) {
        return this.a.a((MenuItem) syVar, null, 0);
    }

    public final void a(su suVar) {
        this.a = suVar;
    }

    public final Menu b() {
        if (this.a == null) {
            tk tkVar;
            Context context = getContext();
            this.a = new su(context);
            this.a.a(new un(this));
            this.c = new ud(context);
            this.c.c(true);
            sj sjVar = this.c;
            if (this.j != null) {
                tkVar = this.j;
            } else {
                tkVar = new ul(this);
            }
            sjVar.d = tkVar;
            this.a.a(this.c, this.h);
            this.c.a(this);
        }
        return this.a;
    }

    public final void a(tk tkVar, sv svVar) {
        this.j = tkVar;
        this.d = svVar;
    }

    public final void c() {
        if (this.c != null) {
            this.c.d();
        }
    }

    private boolean d(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof uk)) {
            z = ((uk) childAt).g() | 0;
        }
        return (i <= 0 || !(childAt2 instanceof uk)) ? z : ((uk) childAt2).f() | z;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }
}
