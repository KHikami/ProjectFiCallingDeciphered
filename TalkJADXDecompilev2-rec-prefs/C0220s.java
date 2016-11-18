package p000;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import java.util.List;

@ac(a = t.class)
public final class C0220s extends LinearLayout {
    int f28998a;
    int f28999b;
    boolean f29000c;
    int f29001d;
    List<C0000a> f29002e;
    boolean f29003f;
    private int f29004g;
    private qb f29005h;
    private boolean f29006i;
    private final int[] f29007j;

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return C0220s.m33703d();
    }

    protected /* synthetic */ LinearLayout.LayoutParams m41647generateDefaultLayoutParams() {
        return C0220s.m33703d();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m33700a(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return C0220s.m33701a(layoutParams);
    }

    public /* synthetic */ LinearLayout.LayoutParams m41648generateLayoutParams(AttributeSet attributeSet) {
        return m33700a(attributeSet);
    }

    protected /* synthetic */ LinearLayout.LayoutParams m41649generateLayoutParams(LayoutParams layoutParams) {
        return C0220s.m33701a(layoutParams);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m33702c();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        m33702c();
        this.f29000c = false;
        int childCount = getChildCount();
        for (i5 = 0; i5 < childCount; i5++) {
            if (((w) getChildAt(i5).getLayoutParams()).b() != null) {
                this.f29000c = true;
                break;
            }
        }
        childCount = getChildCount();
        for (i5 = 0; i5 < childCount; i5++) {
            w wVar = (w) getChildAt(i5).getLayoutParams();
            if ((wVar.a & 1) != 1 || (wVar.a & 10) == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        if (this.f29006i != z2) {
            this.f29006i = z2;
            refreshDrawableState();
        }
    }

    private void m33702c() {
        this.f29004g = -1;
        this.f28998a = -1;
        this.f28999b = -1;
    }

    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void m33705a(boolean z, boolean z2) {
        this.f29001d = (z2 ? 4 : 0) | 2;
        requestLayout();
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof w;
    }

    private static w m33703d() {
        return new w(-1, -2);
    }

    private w m33700a(AttributeSet attributeSet) {
        return new w(getContext(), attributeSet);
    }

    private static w m33701a(LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new w((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new w((MarginLayoutParams) layoutParams);
        }
        return new w(layoutParams);
    }

    public final int m33704a() {
        if (this.f29004g != -1) {
            return this.f29004g;
        }
        int l;
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            w wVar = (w) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = wVar.a;
            if ((i3 & 1) == 0) {
                break;
            }
            i += wVar.bottomMargin + (measuredHeight + wVar.topMargin);
            if ((i3 & 2) != 0) {
                l = i - oa.l(childAt);
                break;
            }
        }
        l = i;
        l = Math.max(0, l - m33706b());
        this.f29004g = l;
        return l;
    }

    protected int[] onCreateDrawableState(int i) {
        int[] iArr = this.f29007j;
        int[] onCreateDrawableState = super.onCreateDrawableState(iArr.length + i);
        iArr[0] = this.f29006i ? oto.d : -oto.d;
        int i2 = (this.f29006i && this.f29003f) ? oto.c : -oto.c;
        iArr[1] = i2;
        return C0220s.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    final int m33706b() {
        return this.f29005h != null ? this.f29005h.m33678b() : 0;
    }
}
