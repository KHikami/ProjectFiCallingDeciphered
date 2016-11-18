package p000;

import com.android.ex.photo.views.PhotoView;

public final class aht implements Runnable {
    private final PhotoView f821a;
    private float f822b;
    private float f823c;
    private float f824d;
    private long f825e;
    private boolean f826f;
    private boolean f827g;

    public aht(PhotoView photoView) {
        this.f821a = photoView;
    }

    public void m1352a(float f) {
        if (!this.f826f) {
            this.f822b = f;
            this.f824d = this.f822b / 500.0f;
            this.f823c = 0.0f;
            this.f825e = -1;
            this.f827g = false;
            this.f826f = true;
            this.f821a.post(this);
        }
    }

    public void m1351a() {
        this.f826f = false;
        this.f827g = true;
    }

    public void run() {
        if (!this.f827g) {
            if (this.f823c != this.f822b) {
                long currentTimeMillis = System.currentTimeMillis();
                float f = ((float) (this.f825e != -1 ? currentTimeMillis - this.f825e : 0)) * this.f824d;
                if ((this.f823c < this.f822b && this.f823c + f > this.f822b) || (this.f823c > this.f822b && this.f823c + f < this.f822b)) {
                    f = this.f822b - this.f823c;
                }
                PhotoView photoView = this.f821a;
                photoView.f5881e += f;
                photoView.f5877a.postRotate(f, (float) (photoView.getWidth() / 2), (float) (photoView.getHeight() / 2));
                photoView.invalidate();
                this.f823c = f + this.f823c;
                if (this.f823c == this.f822b) {
                    m1351a();
                }
                this.f825e = currentTimeMillis;
            }
            if (!this.f827g) {
                this.f821a.post(this);
            }
        }
    }
}
