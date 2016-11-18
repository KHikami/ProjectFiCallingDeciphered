package p000;

import android.view.View;
import com.google.android.apps.hangouts.views.MultiLineLayout;

public class gqg {
    final /* synthetic */ MultiLineLayout f15902b;

    gqg(MultiLineLayout multiLineLayout) {
        this.f15902b = multiLineLayout;
    }

    public void mo2315a(int i) {
        int paddingRight;
        boolean a = gld.m17938a(this.f15902b.getRootView());
        if (a) {
            paddingRight = this.f15902b.getPaddingRight();
        } else {
            paddingRight = this.f15902b.getPaddingLeft();
        }
        int paddingTop = this.f15902b.getPaddingTop();
        int paddingLeft = (i - this.f15902b.getPaddingLeft()) - this.f15902b.getPaddingRight();
        int childCount = this.f15902b.getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (i2 < childCount) {
            int max;
            View childAt = this.f15902b.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                int paddingRight2;
                int i4;
                mo2316a(childAt);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (paddingRight + measuredWidth > paddingLeft) {
                    paddingTop += i3;
                    paddingRight2 = a ? this.f15902b.getPaddingRight() : this.f15902b.getPaddingLeft();
                    i4 = 0;
                } else {
                    paddingRight2 = paddingRight;
                    i4 = i3;
                }
                if (a) {
                    i3 = (this.f15902b.getWidth() - paddingRight2) - measuredWidth;
                } else {
                    i3 = paddingRight2;
                }
                mo2314a(childAt, i3, paddingTop, measuredWidth, measuredHeight);
                paddingRight = paddingRight2 + measuredWidth;
                max = Math.max(i4, measuredHeight);
            } else {
                max = i3;
            }
            i2++;
            i3 = max;
        }
    }

    protected void mo2316a(View view) {
    }

    protected void mo2314a(View view, int i, int i2, int i3, int i4) {
    }
}
