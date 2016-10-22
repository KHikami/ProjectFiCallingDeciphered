import android.animation.Animator;
import android.app.Activity;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* compiled from: PG */
final class baq implements OnPreDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ bao b;

    baq(bao bao, View view) {
        this.b = bao;
        this.a = view;
    }

    public final boolean onPreDraw() {
        Animator animator;
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        bao bao = this.b;
        Point point = this.b.a;
        Activity activity = bao.getActivity();
        if (activity == null) {
            animator = null;
        } else {
            View decorView = activity.getWindow().getDecorView();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Point point2 = new Point();
            defaultDisplay.getSize(point2);
            int i = point2.x / 2;
            int i2 = point2.y / 2;
            if (point != null) {
                i = point.x;
                i2 = point.y;
            }
            animator = ViewAnimationUtils.createCircularReveal(decorView, i, i2, 0.0f, (float) Math.max(point2.x, point2.y));
            animator.setDuration((long) bao.getResources().getInteger(buf.kK));
        }
        if (animator != null) {
            animator.addListener(new bar(this));
            animator.start();
        }
        return false;
    }
}
