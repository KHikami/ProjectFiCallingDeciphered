package p000;

import com.android.ex.photo.views.PhotoView;

public final class ahw implements Runnable {
    public boolean f844a;
    private final PhotoView f845b;
    private float f846c;
    private float f847d;
    private float f848e;
    private float f849f;
    private long f850g = -1;
    private boolean f851h;

    public ahw(PhotoView photoView) {
        this.f845b = photoView;
    }

    public boolean m1358a(float f, float f2) {
        if (this.f844a) {
            return false;
        }
        this.f850g = -1;
        this.f846c = f;
        this.f847d = f2;
        float atan2 = (float) Math.atan2((double) this.f847d, (double) this.f846c);
        this.f848e = (float) (Math.cos((double) atan2) * 20000.0d);
        this.f849f = (float) (Math.sin((double) atan2) * 20000.0d);
        this.f851h = false;
        this.f844a = true;
        this.f845b.post(this);
        return true;
    }

    public void m1357a() {
        this.f844a = false;
        this.f851h = true;
    }

    public void run() {
        float f = 20000.0f;
        if (!this.f851h) {
            long currentTimeMillis = System.currentTimeMillis();
            float f2 = this.f850g != -1 ? ((float) (currentTimeMillis - this.f850g)) / 1000.0f : 0.0f;
            int a = this.f845b.m8199a(this.f846c * f2, this.f847d * f2);
            this.f850g = currentTimeMillis;
            float f3 = this.f848e * f2;
            if (Math.abs(this.f846c) > Math.abs(f3)) {
                this.f846c -= f3;
            } else {
                this.f846c = 0.0f;
            }
            f2 *= this.f849f;
            if (Math.abs(this.f847d) > Math.abs(f2)) {
                this.f847d -= f2;
            } else {
                this.f847d = 0.0f;
            }
            if ((this.f846c == 0.0f && this.f847d == 0.0f) || a == 0) {
                m1357a();
                this.f845b.m8212h();
            } else if (a == 1) {
                if (this.f846c > 0.0f) {
                    f2 = 20000.0f;
                } else {
                    f2 = -20000.0f;
                }
                this.f848e = f2;
                this.f849f = 0.0f;
                this.f847d = 0.0f;
            } else if (a == 2) {
                this.f848e = 0.0f;
                if (this.f847d <= 0.0f) {
                    f = -20000.0f;
                }
                this.f849f = f;
                this.f846c = 0.0f;
            }
            if (!this.f851h) {
                this.f845b.post(this);
            }
        }
    }
}
