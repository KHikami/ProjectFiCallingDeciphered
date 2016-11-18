package p000;

import com.android.ex.photo.views.PhotoView;

public final class ahu implements Runnable {
    public boolean f828a;
    private final PhotoView f829b;
    private float f830c;
    private float f831d;
    private boolean f832e;
    private float f833f;
    private float f834g;
    private float f835h;
    private long f836i;
    private boolean f837j;

    public ahu(PhotoView photoView) {
        this.f829b = photoView;
    }

    public boolean m1354a(float f, float f2, float f3, float f4) {
        if (this.f828a) {
            return false;
        }
        this.f830c = f3;
        this.f831d = f4;
        this.f833f = f2;
        this.f836i = System.currentTimeMillis();
        this.f834g = f;
        this.f832e = this.f833f > this.f834g;
        this.f835h = (this.f833f - this.f834g) / 200.0f;
        this.f828a = true;
        this.f837j = false;
        this.f829b.post(this);
        return true;
    }

    public void m1353a() {
        this.f828a = false;
        this.f837j = true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        if (!this.f837j) {
            float currentTimeMillis = (((float) (System.currentTimeMillis() - this.f836i)) * this.f835h) + this.f834g;
            this.f829b.m8201a(currentTimeMillis, this.f830c, this.f831d);
            if (currentTimeMillis != this.f833f) {
            }
            this.f829b.m8201a(this.f833f, this.f830c, this.f831d);
            m1353a();
            if (!this.f837j) {
                this.f829b.post(this);
            }
        }
    }
}
