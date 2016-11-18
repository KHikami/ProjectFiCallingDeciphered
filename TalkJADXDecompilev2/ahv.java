package defpackage;

import com.android.ex.photo.views.PhotoView;

public final class ahv implements Runnable {
    private final PhotoView a;
    private float b;
    private float c;
    private long d = -1;
    private boolean e;
    private boolean f;

    public ahv(PhotoView photoView) {
        this.a = photoView;
    }

    public boolean a(float f, float f2) {
        if (this.e) {
            return false;
        }
        this.d = -1;
        this.b = f;
        this.c = f2;
        this.f = false;
        this.e = true;
        this.a.postDelayed(this, 250);
        return true;
    }

    public void a() {
        this.e = false;
        this.f = true;
    }

    public void run() {
        if (!this.f) {
            float f;
            long currentTimeMillis = System.currentTimeMillis();
            float f2 = this.d != -1 ? (float) (currentTimeMillis - this.d) : 0.0f;
            if (this.d == -1) {
                this.d = currentTimeMillis;
            }
            if (f2 >= 100.0f) {
                f2 = this.b;
            } else {
                f = (this.b / (100.0f - f2)) * 10.0f;
                float f3 = (this.c / (100.0f - f2)) * 10.0f;
                if (Math.abs(f) > Math.abs(this.b) || Float.isNaN(f)) {
                    f2 = this.b;
                } else {
                    f2 = f;
                }
                if (Math.abs(f3) <= Math.abs(this.c) && !Float.isNaN(f3)) {
                    f = f2;
                    f2 = f3;
                    this.a.a(f, f2);
                    this.b -= f;
                    this.c -= f2;
                    if (this.b == 0.0f && this.c == 0.0f) {
                        a();
                    }
                    if (!this.f) {
                        this.a.post(this);
                    }
                }
            }
            f = f2;
            f2 = this.c;
            this.a.a(f, f2);
            this.b -= f;
            this.c -= f2;
            a();
            if (!this.f) {
                this.a.post(this);
            }
        }
    }
}
