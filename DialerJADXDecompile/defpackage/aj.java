package defpackage;

import android.support.design.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: aj */
public class aj extends buf {
    ph a;
    al b;
    int c;
    float d;
    float e;
    float f;
    private boolean g;
    private float h;
    private final pk i;

    public aj() {
        this.h = 0.0f;
        this.c = 2;
        this.d = 0.5f;
        this.e = 0.0f;
        this.f = 0.5f;
        this.i = new ak(this);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        switch (jw.a(motionEvent)) {
            case rq.b /*1*/:
            case rl.e /*3*/:
                if (this.g) {
                    this.g = false;
                    return false;
                }
                break;
            default:
                boolean z;
                if (coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    z = false;
                } else {
                    z = true;
                }
                this.g = z;
                break;
        }
        if (this.g) {
            return false;
        }
        if (this.a == null) {
            this.a = ph.a((ViewGroup) coordinatorLayout, this.i);
        }
        return this.a.a(motionEvent);
    }

    public final boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        this.a.b(motionEvent);
        return true;
    }

    public boolean a(View view) {
        return true;
    }

    static float a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }
}
