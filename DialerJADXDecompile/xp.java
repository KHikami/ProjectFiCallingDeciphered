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

/* compiled from: PG */
public class xp extends ViewGroup {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    public boolean f;
    public int g;
    private float h;
    private boolean i;
    private int[] j;
    private int[] k;
    private Drawable l;
    private int m;
    private int n;
    private int o;

    public /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return d();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    public /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return b(layoutParams);
    }

    public xp(Context context) {
        this(context, null);
    }

    public xp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public xp(Context context, AttributeSet attributeSet, int i) {
        boolean z = true;
        super(context, attributeSet, i);
        this.f = true;
        this.a = -1;
        this.b = 0;
        this.d = 8388659;
        aah a = aah.a(context, attributeSet, rk.as, i, 0);
        int a2 = a.a(rk.az, -1);
        if (a2 >= 0) {
            b(a2);
        }
        a2 = a.a(rk.ay, -1);
        if (a2 >= 0) {
            c(a2);
        }
        boolean a3 = a.a(rk.aw, true);
        if (!a3) {
            this.f = a3;
        }
        this.h = a.a.getFloat(rk.aA, -1.0f);
        this.a = a.a(rk.ax, -1);
        this.i = a.a(rk.aD, false);
        Drawable a4 = a.a(rk.aB);
        if (a4 != this.l) {
            this.l = a4;
            if (a4 != null) {
                this.g = a4.getIntrinsicWidth();
                this.m = a4.getIntrinsicHeight();
            } else {
                this.g = 0;
                this.m = 0;
            }
            if (a4 != null) {
                z = false;
            }
            setWillNotDraw(z);
            requestLayout();
        }
        this.n = a.a(rk.aE, 0);
        this.o = a.e(rk.aC, 0);
        a.a.recycle();
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected void onDraw(Canvas canvas) {
        if (this.l != null) {
            int childCount;
            int i;
            View childAt;
            int height;
            xq xqVar;
            if (this.c == 1) {
                childCount = getChildCount();
                i = 0;
                while (i < childCount) {
                    View childAt2 = getChildAt(i);
                    if (!(childAt2 == null || childAt2.getVisibility() == 8 || !a(i))) {
                        a(canvas, (childAt2.getTop() - ((xq) childAt2.getLayoutParams()).topMargin) - this.m);
                    }
                    i++;
                }
                if (a(childCount)) {
                    childAt = getChildAt(childCount - 1);
                    if (childAt == null) {
                        height = (getHeight() - getPaddingBottom()) - this.m;
                    } else {
                        xqVar = (xq) childAt.getLayoutParams();
                        height = xqVar.bottomMargin + childAt.getBottom();
                    }
                    a(canvas, height);
                    return;
                }
                return;
            }
            childCount = getChildCount();
            boolean a = aav.a(this);
            i = 0;
            while (i < childCount) {
                View childAt3 = getChildAt(i);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !a(i))) {
                    xqVar = (xq) childAt3.getLayoutParams();
                    if (a) {
                        height = xqVar.rightMargin + childAt3.getRight();
                    } else {
                        height = (childAt3.getLeft() - xqVar.leftMargin) - this.g;
                    }
                    b(canvas, height);
                }
                i++;
            }
            if (a(childCount)) {
                childAt = getChildAt(childCount - 1);
                if (childAt != null) {
                    xqVar = (xq) childAt.getLayoutParams();
                    if (a) {
                        height = (childAt.getLeft() - xqVar.leftMargin) - this.g;
                    } else {
                        height = xqVar.rightMargin + childAt.getRight();
                    }
                } else if (a) {
                    height = getPaddingLeft();
                } else {
                    height = (getWidth() - getPaddingRight()) - this.g;
                }
                b(canvas, height);
            }
        }
    }

    private void a(Canvas canvas, int i) {
        this.l.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.l.draw(canvas);
    }

    private void b(Canvas canvas, int i) {
        this.l.setBounds(i, getPaddingTop() + this.o, this.g + i, (getHeight() - getPaddingBottom()) - this.o);
        this.l.draw(canvas);
    }

    public int getBaseline() {
        if (this.a < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.a) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.a);
        int baseline = childAt.getBaseline();
        if (baseline != -1) {
            int i;
            int i2 = this.b;
            if (this.c == 1) {
                i = this.d & 112;
                if (i != 48) {
                    switch (i) {
                        case rk.bX /*16*/:
                            i = i2 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.e) / 2);
                            break;
                        case 80:
                            i = ((getBottom() - getTop()) - getPaddingBottom()) - this.e;
                            break;
                    }
                }
            }
            i = i2;
            return (((xq) childAt.getLayoutParams()).topMargin + i) + baseline;
        } else if (this.a == 0) {
            return -1;
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.c == 1) {
            int i3;
            int i4;
            int i5;
            int i6;
            int measuredWidth;
            int max;
            Object obj;
            int i7;
            int i8;
            xq xqVar;
            this.e = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            Object obj2 = 1;
            float f = 0.0f;
            int childCount = getChildCount();
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            Object obj3 = null;
            Object obj4 = null;
            int i13 = this.a;
            boolean z = this.i;
            int i14 = oe.INVALID_ID;
            int i15 = 0;
            while (i15 < childCount) {
                View childAt = getChildAt(i15);
                if (childAt == null) {
                    this.e = this.e;
                    i3 = i15;
                } else {
                    Object obj5;
                    int a;
                    Object obj6;
                    float f2;
                    if (childAt.getVisibility() != 8) {
                        Object obj7;
                        if (a(i15)) {
                            this.e += this.m;
                        }
                        xq xqVar2 = (xq) childAt.getLayoutParams();
                        float f3 = f + xqVar2.g;
                        if (mode2 == 1073741824 && xqVar2.height == 0 && xqVar2.g > 0.0f) {
                            i3 = this.e;
                            this.e = Math.max(i3, (xqVar2.topMargin + i3) + xqVar2.bottomMargin);
                            i4 = i14;
                            obj7 = 1;
                        } else {
                            i3 = oe.INVALID_ID;
                            if (xqVar2.height == 0 && xqVar2.g > 0.0f) {
                                i3 = 0;
                                xqVar2.height = -2;
                            }
                            int i16 = i3;
                            a(childAt, i, 0, i2, f3 == 0.0f ? this.e : 0);
                            if (i16 != Integer.MIN_VALUE) {
                                xqVar2.height = i16;
                            }
                            i3 = childAt.getMeasuredHeight();
                            i5 = this.e;
                            this.e = Math.max(i5, ((i5 + i3) + xqVar2.topMargin) + xqVar2.bottomMargin);
                            if (z) {
                                i4 = Math.max(i3, i14);
                                obj7 = obj4;
                            } else {
                                i4 = i14;
                                obj7 = obj4;
                            }
                        }
                        if (i13 >= 0 && i13 == i15 + 1) {
                            this.b = this.e;
                        }
                        if (i15 >= i13 || xqVar2.g <= 0.0f) {
                            Object obj8 = null;
                            if (mode == 1073741824 || xqVar2.width != -1) {
                                obj5 = obj3;
                            } else {
                                obj5 = 1;
                                obj8 = 1;
                            }
                            i6 = xqVar2.leftMargin + xqVar2.rightMargin;
                            measuredWidth = childAt.getMeasuredWidth() + i6;
                            max = Math.max(i9, measuredWidth);
                            a = aav.a(i10, kn.g(childAt));
                            obj6 = (obj2 == null || xqVar2.width != -1) ? null : 1;
                            if (xqVar2.g > 0.0f) {
                                if (obj8 != null) {
                                    i3 = i6;
                                } else {
                                    i3 = measuredWidth;
                                }
                                f2 = f3;
                                obj = obj6;
                                i7 = i11;
                                obj6 = obj7;
                                i14 = max;
                                int i17 = i4;
                                i4 = Math.max(i12, i3);
                                i3 = i17;
                            } else {
                                if (obj8 == null) {
                                    i6 = measuredWidth;
                                }
                                i3 = Math.max(i11, i6);
                                f2 = f3;
                                obj = obj6;
                                i7 = i3;
                                obj6 = obj7;
                                i3 = i4;
                                i4 = i12;
                                i14 = max;
                            }
                        } else {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                    }
                    i3 = i14;
                    obj6 = obj4;
                    f2 = f;
                    obj = obj2;
                    i4 = i12;
                    i7 = i11;
                    obj5 = obj3;
                    i14 = i9;
                    a = i10;
                    obj4 = obj6;
                    obj2 = obj;
                    i12 = i4;
                    i11 = i7;
                    i10 = a;
                    i9 = i14;
                    obj3 = obj5;
                    i14 = i3;
                    f = f2;
                    i3 = i15;
                }
                i15 = i3 + 1;
            }
            if (this.e > 0 && a(childCount)) {
                this.e += this.m;
            }
            if (z && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
                this.e = 0;
                i8 = 0;
                while (i8 < childCount) {
                    View childAt2 = getChildAt(i8);
                    if (childAt2 == null) {
                        this.e = this.e;
                        i3 = i8;
                    } else if (childAt2.getVisibility() == 8) {
                        i3 = i8;
                    } else {
                        xqVar = (xq) childAt2.getLayoutParams();
                        i6 = this.e;
                        this.e = Math.max(i6, xqVar.bottomMargin + ((i6 + i14) + xqVar.topMargin));
                        i3 = i8;
                    }
                    i8 = i3 + 1;
                }
            }
            this.e += getPaddingTop() + getPaddingBottom();
            i15 = kn.a(Math.max(this.e, getSuggestedMinimumHeight()), i2, 0);
            i6 = (16777215 & i15) - this.e;
            if (obj4 != null || (i6 != 0 && f > 0.0f)) {
                if (this.h > 0.0f) {
                    f = this.h;
                }
                this.e = 0;
                Object obj9 = obj2;
                i14 = i11;
                measuredWidth = i10;
                max = i9;
                int i18 = 0;
                while (i18 < childCount) {
                    float f4;
                    View childAt3 = getChildAt(i18);
                    if (childAt3.getVisibility() != 8) {
                        xqVar = (xq) childAt3.getLayoutParams();
                        float f5 = xqVar.g;
                        if (f5 > 0.0f) {
                            i8 = (int) ((((float) i6) * f5) / f);
                            f -= f5;
                            i6 -= i8;
                            i4 = getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + xqVar.leftMargin) + xqVar.rightMargin, xqVar.width);
                            if (xqVar.height == 0 && mode2 == 1073741824) {
                                if (i8 <= 0) {
                                    i8 = 0;
                                }
                                childAt3.measure(i4, MeasureSpec.makeMeasureSpec(i8, 1073741824));
                            } else {
                                i8 += childAt3.getMeasuredHeight();
                                if (i8 < 0) {
                                    i8 = 0;
                                }
                                childAt3.measure(i4, MeasureSpec.makeMeasureSpec(i8, 1073741824));
                            }
                            float f6 = f;
                            i5 = i6;
                            i6 = aav.a(measuredWidth, kn.g(childAt3) & -256);
                            f4 = f6;
                        } else {
                            f4 = f;
                            i5 = i6;
                            i6 = measuredWidth;
                        }
                        measuredWidth = xqVar.leftMargin + xqVar.rightMargin;
                        i4 = childAt3.getMeasuredWidth() + measuredWidth;
                        max = Math.max(max, i4);
                        Object obj10 = (mode == 1073741824 || xqVar.width != -1) ? null : 1;
                        if (obj10 == null) {
                            measuredWidth = i4;
                        }
                        i4 = Math.max(i14, measuredWidth);
                        obj = (obj9 == null || xqVar.width != -1) ? null : 1;
                        i7 = this.e;
                        this.e = Math.max(i7, xqVar.bottomMargin + ((childAt3.getMeasuredHeight() + i7) + xqVar.topMargin));
                        i3 = i4;
                        i4 = max;
                    } else {
                        f4 = f;
                        i3 = i14;
                        i4 = max;
                        i5 = i6;
                        i6 = measuredWidth;
                        obj = obj9;
                    }
                    i18++;
                    i14 = i3;
                    max = i4;
                    obj9 = obj;
                    measuredWidth = i6;
                    i6 = i5;
                    f = f4;
                }
                this.e += getPaddingTop() + getPaddingBottom();
                obj2 = obj9;
                i3 = i14;
                i10 = measuredWidth;
                i8 = max;
            } else {
                i8 = Math.max(i11, i12);
                if (z && mode2 != 1073741824) {
                    for (i5 = 0; i5 < childCount; i5++) {
                        View childAt4 = getChildAt(i5);
                        if (!(childAt4 == null || childAt4.getVisibility() == 8 || ((xq) childAt4.getLayoutParams()).g <= 0.0f)) {
                            childAt4.measure(MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(i14, 1073741824));
                        }
                    }
                }
                i3 = i8;
                i8 = i9;
            }
            if (obj2 != null || mode == 1073741824) {
                i3 = i8;
            }
            setMeasuredDimension(kn.a(Math.max(i3 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, i10), i15);
            if (obj3 != null) {
                a(childCount, i2);
                return;
            }
            return;
        }
        b(i, i2);
    }

    private boolean a(int i) {
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

    private final void a(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                xq xqVar = (xq) childAt.getLayoutParams();
                if (xqVar.width == -1) {
                    int i4 = xqVar.height;
                    xqVar.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i2, 0);
                    xqVar.height = i4;
                }
            }
        }
    }

    private void b(int i, int i2) {
        Object obj;
        int i3;
        Object obj2;
        Object obj3;
        int i4;
        int measuredHeight;
        xq xqVar;
        this.e = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        Object obj4 = 1;
        float f = 0.0f;
        int childCount = getChildCount();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        Object obj5 = null;
        Object obj6 = null;
        if (this.j == null || this.k == null) {
            this.j = new int[4];
            this.k = new int[4];
        }
        int[] iArr = this.j;
        int[] iArr2 = this.k;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z = this.f;
        boolean z2 = this.i;
        if (mode == 1073741824) {
            obj = 1;
        } else {
            obj = null;
        }
        int i9 = oe.INVALID_ID;
        int i10 = 0;
        while (i10 < childCount) {
            xq xqVar2;
            int i11;
            int a;
            int baseline;
            Object obj7;
            int i12;
            View childAt = getChildAt(i10);
            if (childAt == null) {
                this.e = this.e;
                i3 = i10;
            } else {
                float f2;
                Object obj8;
                if (childAt.getVisibility() != 8) {
                    if (a(i10)) {
                        this.e += this.g;
                    }
                    xqVar2 = (xq) childAt.getLayoutParams();
                    float f3 = f + xqVar2.g;
                    if (mode == 1073741824 && xqVar2.width == 0 && xqVar2.g > 0.0f) {
                        if (obj != null) {
                            this.e += xqVar2.leftMargin + xqVar2.rightMargin;
                        } else {
                            i3 = this.e;
                            this.e = Math.max(i3, (xqVar2.leftMargin + i3) + xqVar2.rightMargin);
                        }
                        if (z) {
                            i3 = MeasureSpec.makeMeasureSpec(0, 0);
                            childAt.measure(i3, i3);
                            i11 = i9;
                            obj2 = obj6;
                        } else {
                            i11 = i9;
                            i9 = 1;
                        }
                    } else {
                        i3 = oe.INVALID_ID;
                        if (xqVar2.width == 0 && xqVar2.g > 0.0f) {
                            i3 = 0;
                            xqVar2.width = -2;
                        }
                        int i13 = i3;
                        a(childAt, i, f3 == 0.0f ? this.e : 0, i2, 0);
                        if (i13 != Integer.MIN_VALUE) {
                            xqVar2.width = i13;
                        }
                        i3 = childAt.getMeasuredWidth();
                        if (obj != null) {
                            this.e += (xqVar2.leftMargin + i3) + xqVar2.rightMargin;
                        } else {
                            int i14 = this.e;
                            this.e = Math.max(i14, ((i14 + i3) + xqVar2.leftMargin) + xqVar2.rightMargin);
                        }
                        if (z2) {
                            i11 = Math.max(i3, i9);
                            obj2 = obj6;
                        } else {
                            i11 = i9;
                            obj2 = obj6;
                        }
                    }
                    Object obj9 = null;
                    if (mode2 == 1073741824 || xqVar2.height != -1) {
                        obj3 = obj5;
                    } else {
                        obj3 = 1;
                        obj9 = 1;
                    }
                    i4 = xqVar2.topMargin + xqVar2.bottomMargin;
                    measuredHeight = childAt.getMeasuredHeight() + i4;
                    a = aav.a(i6, kn.g(childAt));
                    if (z) {
                        baseline = childAt.getBaseline();
                        if (baseline != -1) {
                            int i15 = ((((xqVar2.h < 0 ? this.d : xqVar2.h) & 112) >> 4) & -2) >> 1;
                            iArr[i15] = Math.max(iArr[i15], baseline);
                            iArr2[i15] = Math.max(iArr2[i15], measuredHeight - baseline);
                        }
                    }
                    baseline = Math.max(i5, measuredHeight);
                    obj7 = (obj4 == null || xqVar2.height != -1) ? null : 1;
                    if (xqVar2.g > 0.0f) {
                        if (obj9 != null) {
                            i3 = i4;
                        } else {
                            i3 = measuredHeight;
                        }
                        f2 = f3;
                        obj8 = obj7;
                        i12 = i7;
                        obj7 = obj2;
                        i9 = baseline;
                        int i16 = i11;
                        i11 = Math.max(i8, i3);
                        i3 = i16;
                    } else {
                        if (obj9 == null) {
                            i4 = measuredHeight;
                        }
                        i3 = Math.max(i7, i4);
                        f2 = f3;
                        obj8 = obj7;
                        i12 = i3;
                        obj7 = obj2;
                        i3 = i11;
                        i11 = i8;
                        i9 = baseline;
                    }
                } else {
                    i3 = i9;
                    obj7 = obj6;
                    f2 = f;
                    obj8 = obj4;
                    i11 = i8;
                    i12 = i7;
                    obj3 = obj5;
                    i9 = i5;
                    a = i6;
                }
                obj6 = obj7;
                obj4 = obj8;
                i8 = i11;
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
        if (this.e > 0 && a(childCount)) {
            this.e += this.g;
        }
        if (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) {
            i4 = i5;
        } else {
            i4 = Math.max(i5, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        }
        if (z2 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.e = 0;
            i15 = 0;
            while (i15 < childCount) {
                View childAt2 = getChildAt(i15);
                if (childAt2 == null) {
                    this.e = this.e;
                    i3 = i15;
                } else if (childAt2.getVisibility() == 8) {
                    i3 = i15;
                } else {
                    xqVar = (xq) childAt2.getLayoutParams();
                    if (obj != null) {
                        this.e = (xqVar.rightMargin + (xqVar.leftMargin + i9)) + this.e;
                        i3 = i15;
                    } else {
                        measuredHeight = this.e;
                        this.e = Math.max(measuredHeight, xqVar.rightMargin + ((measuredHeight + i9) + xqVar.leftMargin));
                        i3 = i15;
                    }
                }
                i15 = i3 + 1;
            }
        }
        this.e += getPaddingLeft() + getPaddingRight();
        i5 = kn.a(Math.max(this.e, getSuggestedMinimumWidth()), i, 0);
        measuredHeight = (16777215 & i5) - this.e;
        View view;
        if (obj6 != null || (measuredHeight != 0 && f > 0.0f)) {
            if (this.h > 0.0f) {
                f = this.h;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.e = 0;
            i8 = 0;
            obj2 = obj4;
            baseline = i7;
            int i17 = -1;
            i11 = i6;
            while (i8 < childCount) {
                float f4;
                View childAt3 = getChildAt(i8);
                if (childAt3 == null || childAt3.getVisibility() == 8) {
                    f4 = f;
                    i15 = measuredHeight;
                    i4 = baseline;
                    obj3 = obj2;
                    measuredHeight = i11;
                    i11 = i17;
                } else {
                    int childMeasureSpec;
                    float f5;
                    xqVar = (xq) childAt3.getLayoutParams();
                    float f6 = xqVar.g;
                    if (f6 > 0.0f) {
                        i15 = (int) ((((float) measuredHeight) * f6) / f);
                        f6 = f - f6;
                        measuredHeight -= i15;
                        childMeasureSpec = getChildMeasureSpec(i2, ((getPaddingTop() + getPaddingBottom()) + xqVar.topMargin) + xqVar.bottomMargin, xqVar.height);
                        if (xqVar.width != 0 || mode != 1073741824) {
                            i15 += childAt3.getMeasuredWidth();
                            if (i15 < 0) {
                                i15 = 0;
                            }
                            view = childAt3;
                        } else if (i15 > 0) {
                            view = childAt3;
                        } else {
                            i15 = 0;
                            view = childAt3;
                        }
                        view.measure(MeasureSpec.makeMeasureSpec(i15, 1073741824), childMeasureSpec);
                        childMeasureSpec = aav.a(i11, kn.g(childAt3) & -16777216);
                        f5 = f6;
                        i12 = measuredHeight;
                    } else {
                        i12 = measuredHeight;
                        childMeasureSpec = i11;
                        f5 = f;
                    }
                    if (obj != null) {
                        this.e += (childAt3.getMeasuredWidth() + xqVar.leftMargin) + xqVar.rightMargin;
                    } else {
                        i15 = this.e;
                        this.e = Math.max(i15, ((childAt3.getMeasuredWidth() + i15) + xqVar.leftMargin) + xqVar.rightMargin);
                    }
                    obj7 = (mode2 == 1073741824 || xqVar.height != -1) ? null : 1;
                    i14 = xqVar.topMargin + xqVar.bottomMargin;
                    measuredHeight = childAt3.getMeasuredHeight() + i14;
                    i17 = Math.max(i17, measuredHeight);
                    if (obj7 != null) {
                        i15 = i14;
                    } else {
                        i15 = measuredHeight;
                    }
                    i14 = Math.max(baseline, i15);
                    obj7 = (obj2 == null || xqVar.height != -1) ? null : 1;
                    if (z) {
                        i4 = childAt3.getBaseline();
                        if (i4 != -1) {
                            i3 = ((((xqVar.h < 0 ? this.d : xqVar.h) & 112) >> 4) & -2) >> 1;
                            iArr[i3] = Math.max(iArr[i3], i4);
                            iArr2[i3] = Math.max(iArr2[i3], measuredHeight - i4);
                        }
                    }
                    f4 = f5;
                    i4 = i14;
                    measuredHeight = childMeasureSpec;
                    obj3 = obj7;
                    i11 = i17;
                    i15 = i12;
                }
                i8++;
                obj2 = obj3;
                baseline = i4;
                i17 = i11;
                i11 = measuredHeight;
                f = f4;
                measuredHeight = i15;
            }
            this.e += getPaddingLeft() + getPaddingRight();
            if (!(iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1)) {
                i17 = Math.max(i17, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            i3 = baseline;
            i6 = i11;
            i15 = i17;
            obj4 = obj2;
        } else {
            baseline = Math.max(i7, i8);
            if (z2 && mode != 1073741824) {
                for (i15 = 0; i15 < childCount; i15++) {
                    view = getChildAt(i15);
                    if (!(view == null || view.getVisibility() == 8 || ((xq) view.getLayoutParams()).g <= 0.0f)) {
                        view.measure(MeasureSpec.makeMeasureSpec(i9, 1073741824), MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = baseline;
            i15 = i4;
        }
        if (obj4 != null || mode2 == 1073741824) {
            i3 = i15;
        }
        setMeasuredDimension((-16777216 & i6) | i5, kn.a(Math.max(i3 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, i6 << 16));
        if (obj5 != null) {
            measuredHeight = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            for (int i18 = 0; i18 < childCount; i18++) {
                childAt = getChildAt(i18);
                if (childAt.getVisibility() != 8) {
                    xqVar2 = (xq) childAt.getLayoutParams();
                    if (xqVar2.height == -1) {
                        a = xqVar2.width;
                        xqVar2.width = childAt.getMeasuredWidth();
                        measureChildWithMargins(childAt, i, 0, measuredHeight, 0);
                        xqVar2.width = a;
                    }
                }
            }
        }
    }

    private void a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
        r23 = this;
        r0 = r23;
        r3 = r0.c;
        r4 = 1;
        if (r3 != r4) goto L_0x00b6;
    L_0x0007:
        r8 = r23.getPaddingLeft();
        r3 = r27 - r25;
        r4 = r23.getPaddingRight();
        r9 = r3 - r4;
        r3 = r3 - r8;
        r4 = r23.getPaddingRight();
        r10 = r3 - r4;
        r11 = r23.getChildCount();
        r0 = r23;
        r3 = r0.d;
        r3 = r3 & 112;
        r0 = r23;
        r4 = r0.d;
        r5 = 8388615; // 0x800007 float:1.1754953E-38 double:4.1445265E-317;
        r5 = r5 & r4;
        switch(r3) {
            case 16: goto L_0x0051;
            case 80: goto L_0x0043;
            default: goto L_0x002f;
        };
    L_0x002f:
        r3 = r23.getPaddingTop();
    L_0x0033:
        r7 = 0;
        r6 = r3;
    L_0x0035:
        if (r7 >= r11) goto L_0x01c8;
    L_0x0037:
        r0 = r23;
        r12 = r0.getChildAt(r7);
        if (r12 != 0) goto L_0x0060;
    L_0x003f:
        r3 = r7;
    L_0x0040:
        r7 = r3 + 1;
        goto L_0x0035;
    L_0x0043:
        r3 = r23.getPaddingTop();
        r3 = r3 + r28;
        r3 = r3 - r26;
        r0 = r23;
        r4 = r0.e;
        r3 = r3 - r4;
        goto L_0x0033;
    L_0x0051:
        r3 = r23.getPaddingTop();
        r4 = r28 - r26;
        r0 = r23;
        r6 = r0.e;
        r4 = r4 - r6;
        r4 = r4 / 2;
        r3 = r3 + r4;
        goto L_0x0033;
    L_0x0060:
        r3 = r12.getVisibility();
        r4 = 8;
        if (r3 == r4) goto L_0x01d4;
    L_0x0068:
        r13 = r12.getMeasuredWidth();
        r14 = r12.getMeasuredHeight();
        r3 = r12.getLayoutParams();
        r3 = (xq) r3;
        r4 = r3.h;
        if (r4 >= 0) goto L_0x007b;
    L_0x007a:
        r4 = r5;
    L_0x007b:
        r15 = kn.f(r23);
        r4 = iy.a(r4, r15);
        r4 = r4 & 7;
        switch(r4) {
            case 1: goto L_0x00a4;
            case 5: goto L_0x00b0;
            default: goto L_0x0088;
        };
    L_0x0088:
        r4 = r3.leftMargin;
        r4 = r4 + r8;
    L_0x008b:
        r0 = r23;
        r15 = r0.a(r7);
        if (r15 == 0) goto L_0x0098;
    L_0x0093:
        r0 = r23;
        r15 = r0.m;
        r6 = r6 + r15;
    L_0x0098:
        r15 = r3.topMargin;
        r6 = r6 + r15;
        b(r12, r4, r6, r13, r14);
        r3 = r3.bottomMargin;
        r3 = r3 + r14;
        r6 = r6 + r3;
        r3 = r7;
        goto L_0x0040;
    L_0x00a4:
        r4 = r10 - r13;
        r4 = r4 / 2;
        r4 = r4 + r8;
        r15 = r3.leftMargin;
        r4 = r4 + r15;
        r15 = r3.rightMargin;
        r4 = r4 - r15;
        goto L_0x008b;
    L_0x00b0:
        r4 = r9 - r13;
        r15 = r3.rightMargin;
        r4 = r4 - r15;
        goto L_0x008b;
    L_0x00b6:
        r5 = aav.a(r23);
        r8 = r23.getPaddingTop();
        r3 = r28 - r26;
        r4 = r23.getPaddingBottom();
        r12 = r3 - r4;
        r3 = r3 - r8;
        r4 = r23.getPaddingBottom();
        r13 = r3 - r4;
        r14 = r23.getChildCount();
        r0 = r23;
        r3 = r0.d;
        r4 = 8388615; // 0x800007 float:1.1754953E-38 double:4.1445265E-317;
        r3 = r3 & r4;
        r0 = r23;
        r4 = r0.d;
        r11 = r4 & 112;
        r0 = r23;
        r15 = r0.f;
        r0 = r23;
        r0 = r0.j;
        r16 = r0;
        r0 = r23;
        r0 = r0.k;
        r17 = r0;
        r4 = kn.f(r23);
        r3 = iy.a(r3, r4);
        switch(r3) {
            case 1: goto L_0x012b;
            case 5: goto L_0x011c;
            default: goto L_0x00fa;
        };
    L_0x00fa:
        r9 = r23.getPaddingLeft();
    L_0x00fe:
        r4 = 0;
        r3 = 1;
        if (r5 == 0) goto L_0x01d0;
    L_0x0102:
        r4 = r14 + -1;
        r3 = -1;
        r5 = r4;
        r4 = r3;
    L_0x0107:
        r10 = 0;
    L_0x0108:
        if (r10 >= r14) goto L_0x01c8;
    L_0x010a:
        r3 = r4 * r10;
        r18 = r5 + r3;
        r0 = r23;
        r1 = r18;
        r19 = r0.getChildAt(r1);
        if (r19 != 0) goto L_0x013b;
    L_0x0118:
        r3 = r10;
    L_0x0119:
        r10 = r3 + 1;
        goto L_0x0108;
    L_0x011c:
        r3 = r23.getPaddingLeft();
        r3 = r3 + r27;
        r3 = r3 - r25;
        r0 = r23;
        r4 = r0.e;
        r9 = r3 - r4;
        goto L_0x00fe;
    L_0x012b:
        r3 = r23.getPaddingLeft();
        r4 = r27 - r25;
        r0 = r23;
        r6 = r0.e;
        r4 = r4 - r6;
        r4 = r4 / 2;
        r9 = r3 + r4;
        goto L_0x00fe;
    L_0x013b:
        r3 = r19.getVisibility();
        r6 = 8;
        if (r3 == r6) goto L_0x01cd;
    L_0x0143:
        r20 = r19.getMeasuredWidth();
        r21 = r19.getMeasuredHeight();
        r6 = -1;
        r3 = r19.getLayoutParams();
        r3 = (xq) r3;
        if (r15 == 0) goto L_0x0160;
    L_0x0154:
        r7 = r3.height;
        r22 = -1;
        r0 = r22;
        if (r7 == r0) goto L_0x0160;
    L_0x015c:
        r6 = r19.getBaseline();
    L_0x0160:
        r7 = r3.h;
        if (r7 >= 0) goto L_0x0165;
    L_0x0164:
        r7 = r11;
    L_0x0165:
        r7 = r7 & 112;
        switch(r7) {
            case 16: goto L_0x019f;
            case 48: goto L_0x018e;
            case 80: goto L_0x01ab;
            default: goto L_0x016a;
        };
    L_0x016a:
        r6 = r8;
    L_0x016b:
        r0 = r23;
        r1 = r18;
        r7 = r0.a(r1);
        if (r7 == 0) goto L_0x01c9;
    L_0x0175:
        r0 = r23;
        r7 = r0.g;
        r7 = r7 + r9;
    L_0x017a:
        r9 = r3.leftMargin;
        r7 = r7 + r9;
        r0 = r19;
        r1 = r20;
        r2 = r21;
        b(r0, r7, r6, r1, r2);
        r3 = r3.rightMargin;
        r3 = r3 + r20;
        r9 = r7 + r3;
        r3 = r10;
        goto L_0x0119;
    L_0x018e:
        r7 = r3.topMargin;
        r7 = r7 + r8;
        r22 = -1;
        r0 = r22;
        if (r6 == r0) goto L_0x01cb;
    L_0x0197:
        r22 = 1;
        r22 = r16[r22];
        r6 = r22 - r6;
        r6 = r6 + r7;
        goto L_0x016b;
    L_0x019f:
        r6 = r13 - r21;
        r6 = r6 / 2;
        r6 = r6 + r8;
        r7 = r3.topMargin;
        r6 = r6 + r7;
        r7 = r3.bottomMargin;
        r6 = r6 - r7;
        goto L_0x016b;
    L_0x01ab:
        r7 = r12 - r21;
        r0 = r3.bottomMargin;
        r22 = r0;
        r7 = r7 - r22;
        r22 = -1;
        r0 = r22;
        if (r6 == r0) goto L_0x01cb;
    L_0x01b9:
        r22 = r19.getMeasuredHeight();
        r6 = r22 - r6;
        r22 = 2;
        r22 = r17[r22];
        r6 = r22 - r6;
        r6 = r7 - r6;
        goto L_0x016b;
    L_0x01c8:
        return;
    L_0x01c9:
        r7 = r9;
        goto L_0x017a;
    L_0x01cb:
        r6 = r7;
        goto L_0x016b;
    L_0x01cd:
        r3 = r10;
        goto L_0x0119;
    L_0x01d0:
        r5 = r4;
        r4 = r3;
        goto L_0x0107;
    L_0x01d4:
        r3 = r7;
        goto L_0x0040;
        */
        throw new UnsupportedOperationException("Method not decompiled: xp.onLayout(boolean, int, int, int, int):void");
    }

    private static void b(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    public final void b(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public final void c(int i) {
        if (this.d != i) {
            int i2;
            if ((8388615 & i) == 0) {
                i2 = 8388611 | i;
            } else {
                i2 = i;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.d = i2;
            requestLayout();
        }
    }

    public xq a(AttributeSet attributeSet) {
        return new xq(getContext(), attributeSet);
    }

    public xq d() {
        if (this.c == 0) {
            return new xq(-2, -2);
        }
        if (this.c == 1) {
            return new xq(-1, -2);
        }
        return null;
    }

    public xq b(LayoutParams layoutParams) {
        return new xq(layoutParams);
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof xq;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(xp.class.getName());
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(xp.class.getName());
        }
    }
}
