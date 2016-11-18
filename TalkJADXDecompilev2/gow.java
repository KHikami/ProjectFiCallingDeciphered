package defpackage;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class gow extends ViewPager {
    private boolean d = true;
    private gox e;

    public gow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(2);
        this.e = new gox();
        super.a(this.e);
    }

    public final void a(pc pcVar) {
        throw new UnsupportedOperationException("This method has been disabled, please use addOnPageChangeListener instead");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.d && super.onTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.d && super.onInterceptTouchEvent(motionEvent);
    }

    public void b(pc pcVar) {
        this.e.a.add(pcVar);
    }

    public void b(boolean z) {
        this.d = z;
    }
}
