package p000;

import com.android.ex.photo.views.PhotoView;

public final class ahv implements Runnable {
    private final PhotoView f838a;
    private float f839b;
    private float f840c;
    private long f841d = -1;
    private boolean f842e;
    private boolean f843f;

    public ahv(PhotoView photoView) {
        this.f838a = photoView;
    }

    public boolean m1356a(float f, float f2) {
        if (this.f842e) {
            return false;
        }
        this.f841d = -1;
        this.f839b = f;
        this.f840c = f2;
        this.f843f = false;
        this.f842e = true;
        this.f838a.postDelayed(this, 250);
        return true;
    }

    public void m1355a() {
        this.f842e = false;
        this.f843f = true;
    }

    public void run() {
        if (!this.f843f) {
            float f;
            long currentTimeMillis = System.currentTimeMillis();
            float f2 = this.f841d != -1 ? (float) (currentTimeMillis - this.f841d) : 0.0f;
            if (this.f841d == -1) {
                this.f841d = currentTimeMillis;
            }
            if (f2 >= 100.0f) {
                f2 = this.f839b;
            } else {
                f = (this.f839b / (100.0f - f2)) * 10.0f;
                float f3 = (this.f840c / (100.0f - f2)) * 10.0f;
                if (Math.abs(f) > Math.abs(this.f839b) || Float.isNaN(f)) {
                    f2 = this.f839b;
                } else {
                    f2 = f;
                }
                if (Math.abs(f3) <= Math.abs(this.f840c) && !Float.isNaN(f3)) {
                    f = f2;
                    f2 = f3;
                    this.f838a.m8199a(f, f2);
                    this.f839b -= f;
                    this.f840c -= f2;
                    if (this.f839b == 0.0f && this.f840c == 0.0f) {
                        m1355a();
                    }
                    if (!this.f843f) {
                        this.f838a.post(this);
                    }
                }
            }
            f = f2;
            f2 = this.f840c;
            this.f838a.m8199a(f, f2);
            this.f839b -= f;
            this.f840c -= f2;
            m1355a();
            if (!this.f843f) {
                this.f838a.post(this);
            }
        }
    }
}
