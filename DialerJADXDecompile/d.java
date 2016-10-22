import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;

@n(a = e.class)
public final class d extends LinearLayout {
    int a;
    int b;
    boolean c;
    int d;
    boolean e;
    private int f;
    private boolean g;
    private final int[] h;

    protected final /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return c();
    }

    protected final /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return c();
    }

    public final /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    protected final /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public final /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    protected final /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return a(layoutParams);
    }

    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        b();
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        b();
        this.c = false;
        int childCount = getChildCount();
        for (i5 = 0; i5 < childCount; i5++) {
            if (((h) getChildAt(i5).getLayoutParams()).b != null) {
                this.c = true;
                break;
            }
        }
        childCount = getChildCount();
        for (i5 = 0; i5 < childCount; i5++) {
            h hVar = (h) getChildAt(i5).getLayoutParams();
            if ((hVar.a & 1) != 1 || (hVar.a & 10) == 0) {
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
        if (this.g != z2) {
            this.g = z2;
            refreshDrawableState();
        }
    }

    private final void b() {
        this.f = -1;
        this.a = -1;
        this.b = -1;
    }

    public final void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    protected final boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof h;
    }

    private static h c() {
        return new h(-1, -2);
    }

    private h a(AttributeSet attributeSet) {
        return new h(getContext(), attributeSet);
    }

    private static h a(LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new h((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new h((MarginLayoutParams) layoutParams);
        }
        return new h(layoutParams);
    }

    public final int a() {
        if (this.f != -1) {
            return this.f;
        }
        int k;
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            h hVar = (h) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = hVar.a;
            if ((i3 & 1) == 0) {
                break;
            }
            i += hVar.bottomMargin + (measuredHeight + hVar.topMargin);
            if ((i3 & 2) != 0) {
                k = i - kn.k(childAt);
                break;
            }
        }
        k = i;
        k = Math.max(0, k);
        this.f = k;
        return k;
    }

    protected final int[] onCreateDrawableState(int i) {
        int[] iArr = this.h;
        int[] onCreateDrawableState = super.onCreateDrawableState(iArr.length + i);
        iArr[0] = this.g ? 2130772009 : -2130772009;
        int i2 = (this.g && this.e) ? 2130772008 : -2130772008;
        iArr[1] = i2;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }
}
