package p000;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

public final class afh extends TouchDelegate {
    private final View f522a;
    private final Rect f523b = new Rect();
    private final Rect f524c = new Rect();
    private final Rect f525d = new Rect();
    private final int f526e;
    private boolean f527f;

    public afh(Rect rect, Rect rect2, View view) {
        super(rect, view);
        this.f526e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        m920a(rect, rect2);
        this.f522a = view;
    }

    public void m920a(Rect rect, Rect rect2) {
        this.f523b.set(rect);
        this.f525d.set(rect);
        this.f525d.inset(-this.f526e, -this.f526e);
        this.f524c.set(rect2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = true;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        switch (motionEvent.getAction()) {
            case 0:
                if (this.f523b.contains(x, y)) {
                    this.f527f = true;
                    z = true;
                    break;
                }
            case 1:
            case 2:
                z = this.f527f;
                if (z && !this.f525d.contains(x, y)) {
                    z2 = false;
                    break;
                }
            case 3:
                z = this.f527f;
                this.f527f = false;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            return false;
        }
        if (!z2 || this.f524c.contains(x, y)) {
            motionEvent.setLocation((float) (x - this.f524c.left), (float) (y - this.f524c.top));
        } else {
            motionEvent.setLocation((float) (this.f522a.getWidth() / 2), (float) (this.f522a.getHeight() / 2));
        }
        return this.f522a.dispatchTouchEvent(motionEvent);
    }
}
