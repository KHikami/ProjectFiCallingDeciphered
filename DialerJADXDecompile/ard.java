import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
final class ard implements OnPreDrawListener {
    private /* synthetic */ ViewTreeObserver a;
    private /* synthetic */ long[] b;
    private /* synthetic */ arc c;

    ard(arc arc, ViewTreeObserver viewTreeObserver, long[] jArr) {
        this.c = arc;
        this.a = viewTreeObserver;
        this.b = jArr;
    }

    public final boolean onPreDraw() {
        this.a.removeOnPreDrawListener(this);
        int firstVisiblePosition = this.c.g.getFirstVisiblePosition();
        AnimatorSet animatorSet = new AnimatorSet();
        Collection arrayList = new ArrayList();
        for (int i = 0; i < this.c.g.getChildCount(); i++) {
            View childAt = this.c.g.getChildAt(i);
            int i2 = firstVisiblePosition + i;
            if (this.c.f.a(i2)) {
                long itemId = this.c.f.getItemId(i2);
                arc arc = this.c;
                if (arc.a(this.b, itemId)) {
                    arrayList.add(ObjectAnimator.ofFloat(childAt, "alpha", new float[]{0.0f, 1.0f}));
                    break;
                }
                Integer num = (Integer) this.c.a.get(Long.valueOf(itemId));
                Integer num2 = (Integer) this.c.b.get(Long.valueOf(itemId));
                int top = childAt.getTop();
                int left = childAt.getLeft();
                if (!(num2 == null || num2.intValue() == left)) {
                    int intValue = num2.intValue() - left;
                    arrayList.add(ObjectAnimator.ofFloat(childAt, "translationX", new float[]{(float) intValue, 0.0f}));
                }
                if (!(num == null || num.intValue() == top)) {
                    i2 = num.intValue() - top;
                    arrayList.add(ObjectAnimator.ofFloat(childAt, "translationY", new float[]{(float) i2, 0.0f}));
                }
            }
        }
        if (arrayList.size() > 0) {
            animatorSet.setDuration((long) this.c.c).playTogether(arrayList);
            animatorSet.start();
        }
        this.c.a.clear();
        this.c.b.clear();
        return true;
    }
}
