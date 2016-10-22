import android.view.View;
import com.google.android.apps.hangouts.views.MultiLineLayout;

public class gqg {
    final /* synthetic */ MultiLineLayout b;

    gqg(MultiLineLayout multiLineLayout) {
        this.b = multiLineLayout;
    }

    public void a(int i) {
        int paddingRight;
        boolean a = gld.a(this.b.getRootView());
        if (a) {
            paddingRight = this.b.getPaddingRight();
        } else {
            paddingRight = this.b.getPaddingLeft();
        }
        int paddingTop = this.b.getPaddingTop();
        int paddingLeft = (i - this.b.getPaddingLeft()) - this.b.getPaddingRight();
        int childCount = this.b.getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (i2 < childCount) {
            int max;
            View childAt = this.b.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                int paddingRight2;
                int i4;
                a(childAt);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (paddingRight + measuredWidth > paddingLeft) {
                    paddingTop += i3;
                    paddingRight2 = a ? this.b.getPaddingRight() : this.b.getPaddingLeft();
                    i4 = 0;
                } else {
                    paddingRight2 = paddingRight;
                    i4 = i3;
                }
                if (a) {
                    i3 = (this.b.getWidth() - paddingRight2) - measuredWidth;
                } else {
                    i3 = paddingRight2;
                }
                a(childAt, i3, paddingTop, measuredWidth, measuredHeight);
                paddingRight = paddingRight2 + measuredWidth;
                max = Math.max(i4, measuredHeight);
            } else {
                max = i3;
            }
            i2++;
            i3 = max;
        }
    }

    protected void a(View view) {
    }

    protected void a(View view, int i, int i2, int i3, int i4) {
    }
}
