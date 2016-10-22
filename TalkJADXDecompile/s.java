import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import java.util.List;

@ac(a = t.class)
public final class s extends LinearLayout {
    int a;
    int b;
    boolean c;
    int d;
    List<a> e;
    boolean f;
    private int g;
    private qb h;
    private boolean i;
    private final int[] j;

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return d();
    }

    protected /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return d();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    protected /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return a(layoutParams);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        c();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        c();
        this.c = false;
        int childCount = getChildCount();
        for (i5 = 0; i5 < childCount; i5++) {
            if (((w) getChildAt(i5).getLayoutParams()).b() != null) {
                this.c = true;
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
        if (this.i != z2) {
            this.i = z2;
            refreshDrawableState();
        }
    }

    private void c() {
        this.g = -1;
        this.a = -1;
        this.b = -1;
    }

    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void a(boolean z, boolean z2) {
        this.d = (z2 ? 4 : 0) | 2;
        requestLayout();
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof w;
    }

    private static w d() {
        return new w(-1, -2);
    }

    private w a(AttributeSet attributeSet) {
        return new w(getContext(), attributeSet);
    }

    private static w a(LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new w((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new w((MarginLayoutParams) layoutParams);
        }
        return new w(layoutParams);
    }

    public final int a() {
        if (this.g != -1) {
            return this.g;
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
        l = Math.max(0, l - b());
        this.g = l;
        return l;
    }

    protected int[] onCreateDrawableState(int i) {
        int[] iArr = this.j;
        int[] onCreateDrawableState = super.onCreateDrawableState(iArr.length + i);
        iArr[0] = this.i ? oto.d : -oto.d;
        int i2 = (this.i && this.f) ? oto.c : -oto.c;
        iArr[1] = i2;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    final int b() {
        return this.h != null ? this.h.b() : 0;
    }
}
