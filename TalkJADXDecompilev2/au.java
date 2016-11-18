package defpackage;

import android.support.design.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.View;

public class au<V extends View> extends gwb {
    private boolean a;
    tl b;
    aw c;
    int d = 2;
    float e = 0.5f;
    float f = 0.0f;
    float g = 0.5f;
    private float h = 0.0f;
    private boolean i;
    private final to j = new av(this);

    public void a(aw awVar) {
        this.c = awVar;
    }

    public void a(int i) {
        this.d = 0;
    }

    public void a(float f) {
        this.f = au.a(0.0f, 0.1f, 1.0f);
    }

    public void b(float f) {
        this.g = au.a(0.0f, 0.6f, 1.0f);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.a;
        switch (nh.a(motionEvent)) {
            case 0:
                this.a = coordinatorLayout.a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
                z = this.a;
                break;
            case 1:
            case 3:
                this.a = false;
                break;
        }
        if (!z) {
            return false;
        }
        if (this.b == null) {
            tl a;
            if (this.i) {
                a = tl.a(coordinatorLayout, this.h, this.j);
            } else {
                a = tl.a(coordinatorLayout, this.j);
            }
            this.b = a;
        }
        return this.b.a(motionEvent);
    }

    public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.b == null) {
            return false;
        }
        this.b.b(motionEvent);
        return true;
    }

    public boolean b(View view) {
        return true;
    }

    static float a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }
}
