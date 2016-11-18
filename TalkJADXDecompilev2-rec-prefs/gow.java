package p000;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class gow extends ViewPager {
    private boolean f7017d = true;
    private gox f7018e;

    public gow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3193c(2);
        this.f7018e = new gox();
        super.mo1265a(this.f7018e);
    }

    public final void mo1265a(pc pcVar) {
        throw new UnsupportedOperationException("This method has been disabled, please use addOnPageChangeListener instead");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f7017d && super.onTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f7017d && super.onInterceptTouchEvent(motionEvent);
    }

    public void mo1266b(pc pcVar) {
        this.f7018e.f15834a.add(pcVar);
    }

    public void mo1267b(boolean z) {
        this.f7017d = z;
    }
}
