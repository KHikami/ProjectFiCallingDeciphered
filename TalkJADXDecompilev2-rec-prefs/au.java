package p000;

import android.support.design.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.View;

public class au<V extends View> extends gwb {
    private boolean f2194a;
    tl f2195b;
    aw f2196c;
    int f2197d = 2;
    float f2198e = 0.5f;
    float f2199f = 0.0f;
    float f2200g = 0.5f;
    private float f2201h = 0.0f;
    private boolean f2202i;
    private final to f2203j = new av(this);

    public void m3809a(aw awVar) {
        this.f2196c = awVar;
    }

    public void m3808a(int i) {
        this.f2197d = 0;
    }

    public void m3807a(float f) {
        this.f2199f = au.m3806a(0.0f, 0.1f, 1.0f);
    }

    public void m3811b(float f) {
        this.f2200g = au.m3806a(0.0f, 0.6f, 1.0f);
    }

    public boolean mo221a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f2194a;
        switch (nh.a(motionEvent)) {
            case 0:
                this.f2194a = coordinatorLayout.m3132a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
                z = this.f2194a;
                break;
            case 1:
            case 3:
                this.f2194a = false;
                break;
        }
        if (!z) {
            return false;
        }
        if (this.f2195b == null) {
            tl a;
            if (this.f2202i) {
                a = tl.a(coordinatorLayout, this.f2201h, this.f2203j);
            } else {
                a = tl.a(coordinatorLayout, this.f2203j);
            }
            this.f2195b = a;
        }
        return this.f2195b.a(motionEvent);
    }

    public boolean mo222b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f2195b == null) {
            return false;
        }
        this.f2195b.b(motionEvent);
        return true;
    }

    public boolean mo355b(View view) {
        return true;
    }

    static float m3806a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }
}
