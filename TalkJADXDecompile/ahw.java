import com.android.ex.photo.views.PhotoView;

public final class ahw implements Runnable {
    public boolean a;
    private final PhotoView b;
    private float c;
    private float d;
    private float e;
    private float f;
    private long g;
    private boolean h;

    public ahw(PhotoView photoView) {
        this.g = -1;
        this.b = photoView;
    }

    public boolean a(float f, float f2) {
        if (this.a) {
            return false;
        }
        this.g = -1;
        this.c = f;
        this.d = f2;
        float atan2 = (float) Math.atan2((double) this.d, (double) this.c);
        this.e = (float) (Math.cos((double) atan2) * 20000.0d);
        this.f = (float) (Math.sin((double) atan2) * 20000.0d);
        this.h = false;
        this.a = true;
        this.b.post(this);
        return true;
    }

    public void a() {
        this.a = false;
        this.h = true;
    }

    public void run() {
        float f = 20000.0f;
        if (!this.h) {
            long currentTimeMillis = System.currentTimeMillis();
            float f2 = this.g != -1 ? ((float) (currentTimeMillis - this.g)) / 1000.0f : 0.0f;
            int a = this.b.a(this.c * f2, this.d * f2);
            this.g = currentTimeMillis;
            float f3 = this.e * f2;
            if (Math.abs(this.c) > Math.abs(f3)) {
                this.c -= f3;
            } else {
                this.c = 0.0f;
            }
            f2 *= this.f;
            if (Math.abs(this.d) > Math.abs(f2)) {
                this.d -= f2;
            } else {
                this.d = 0.0f;
            }
            if ((this.c == 0.0f && this.d == 0.0f) || a == 0) {
                a();
                this.b.h();
            } else if (a == 1) {
                if (this.c > 0.0f) {
                    f2 = 20000.0f;
                } else {
                    f2 = -20000.0f;
                }
                this.e = f2;
                this.f = 0.0f;
                this.d = 0.0f;
            } else if (a == 2) {
                this.e = 0.0f;
                if (this.d <= 0.0f) {
                    f = -20000.0f;
                }
                this.f = f;
                this.c = 0.0f;
            }
            if (!this.h) {
                this.b.post(this);
            }
        }
    }
}
