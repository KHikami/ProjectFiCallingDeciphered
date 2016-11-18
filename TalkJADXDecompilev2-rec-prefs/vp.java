package p000;

import android.content.Context;
import android.support.v7.widget.ContentFrameLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;

final class vp extends ContentFrameLayout {
    final /* synthetic */ vg f35376a;

    public vp(vg vgVar, Context context) {
        this.f35376a = vgVar;
        super(context);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f35376a.mo4419a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                x = true;
            } else {
                x = 0;
            }
            if (x != 0) {
                vg vgVar = this.f35376a;
                vgVar.m40985a(vgVar.m41005g(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(wk.m41196b(getContext(), i));
    }
}
