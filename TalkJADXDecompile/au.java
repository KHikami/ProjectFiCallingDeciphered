import android.support.design.widget.CoordinatorLayout;
import android.view.MotionEvent;
import android.view.View;

public class au<V extends View> extends gwb {
    private boolean a;
    tl b;
    aw c;
    int d;
    float e;
    float f;
    float g;
    private float h;
    private boolean i;
    private final to j;

    public au() {
        this.h = 0.0f;
        this.d = 2;
        this.e = 0.5f;
        this.f = 0.0f;
        this.g = 0.5f;
        this.j = new av(this);
    }

    public void a(aw awVar) {
        this.c = awVar;
    }

    public void a(int i) {
        this.d = 0;
    }

    public void a(float f) {
        this.f = a(0.0f, 0.1f, 1.0f);
    }

    public void b(float f) {
        this.g = a(0.0f, 0.6f, 1.0f);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.a;
        switch (nh.a(motionEvent)) {
            case wi.w /*0*/:
                this.a = coordinatorLayout.a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
                z = this.a;
                break;
            case wi.j /*1*/:
            case wi.z /*3*/:
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
