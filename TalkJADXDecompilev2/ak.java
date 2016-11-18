package defpackage;

import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.List;

abstract class ak extends bp<View> {
    final Rect a = new Rect();
    final Rect b = new Rect();
    int c = 0;
    int d;

    abstract View b(List<View> list);

    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            View b = b(coordinatorLayout.c(view));
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
                coordinatorLayout.a(view, i, i2, MeasureSpec.makeMeasureSpec(c(b) + (size - b.getMeasuredHeight()), i5 == -1 ? 1073741824 : nzf.UNSET_ENUM_VALUE), i4);
                return true;
            }
        }
        return false;
    }

    protected void b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View b = b(coordinatorLayout.c(view));
        if (b != null) {
            ae aeVar = (ae) view.getLayoutParams();
            Rect rect = this.a;
            rect.set(coordinatorLayout.getPaddingLeft() + aeVar.leftMargin, b.getBottom() + aeVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - aeVar.rightMargin, ((coordinatorLayout.getHeight() + b.getBottom()) - coordinatorLayout.getPaddingBottom()) - aeVar.bottomMargin);
            qb qbVar = coordinatorLayout.e;
            if (!(qbVar == null || !oa.p(coordinatorLayout) || oa.p(view))) {
                rect.left += qbVar.a();
                rect.right -= qbVar.c();
            }
            Rect rect2 = this.b;
            int i2 = aeVar.c;
            if (i2 == 0) {
                i2 = 8388659;
            }
            mj.a(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            i2 = d(b);
            view.layout(rect2.left, rect2.top - i2, rect2.right, rect2.bottom - i2);
            this.c = rect2.top - b.getBottom();
            return;
        }
        super.b(coordinatorLayout, view, i);
        this.c = 0;
    }

    float b(View view) {
        return 1.0f;
    }

    final int d(View view) {
        return this.d == 0 ? 0 : gwb.a((int) (b(view) * ((float) this.d)), 0, this.d);
    }

    int c(View view) {
        return view.getMeasuredHeight();
    }
}
