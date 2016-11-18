package p000;

import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.List;

abstract class ak extends bp<View> {
    final Rect f1076a = new Rect();
    final Rect f1077b = new Rect();
    int f1078c = 0;
    int f1079d;

    abstract View m2680b(List<View> list);

    public boolean mo230a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            View b = m2680b(coordinatorLayout.m3137c(view));
            if (b != null) {
                if (oa.p(b) && !oa.p(view)) {
                    oa.a(view, true);
                    if (oa.p(view)) {
                        view.requestLayout();
                        return true;
                    }
                }
                int size = MeasureSpec.getSize(i3);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                coordinatorLayout.m3128a(view, i, i2, MeasureSpec.makeMeasureSpec(m2682c(b) + (size - b.getMeasuredHeight()), i5 == -1 ? 1073741824 : nzf.UNSET_ENUM_VALUE), i4);
                return true;
            }
        }
        return false;
    }

    protected void mo231b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View b = m2680b(coordinatorLayout.m3137c(view));
        if (b != null) {
            ae aeVar = (ae) view.getLayoutParams();
            Rect rect = this.f1076a;
            rect.set(coordinatorLayout.getPaddingLeft() + aeVar.leftMargin, b.getBottom() + aeVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - aeVar.rightMargin, ((coordinatorLayout.getHeight() + b.getBottom()) - coordinatorLayout.getPaddingBottom()) - aeVar.bottomMargin);
            qb qbVar = coordinatorLayout.f1472e;
            if (!(qbVar == null || !oa.p(coordinatorLayout) || oa.p(view))) {
                rect.left += qbVar.m33676a();
                rect.right -= qbVar.m33679c();
            }
            Rect rect2 = this.f1077b;
            int i2 = aeVar.f366c;
            if (i2 == 0) {
                i2 = 8388659;
            }
            mj.m32251a(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            i2 = m2683d(b);
            view.layout(rect2.left, rect2.top - i2, rect2.right, rect2.bottom - i2);
            this.f1078c = rect2.top - b.getBottom();
            return;
        }
        super.mo231b(coordinatorLayout, view, i);
        this.f1078c = 0;
    }

    float m2679b(View view) {
        return 1.0f;
    }

    final int m2683d(View view) {
        return this.f1079d == 0 ? 0 : gwb.m1486a((int) (m2679b(view) * ((float) this.f1079d)), 0, this.f1079d);
    }

    int m2682c(View view) {
        return view.getMeasuredHeight();
    }
}
