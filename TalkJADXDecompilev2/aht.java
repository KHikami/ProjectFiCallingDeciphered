package defpackage;

import com.android.ex.photo.views.PhotoView;

public final class aht implements Runnable {
    private final PhotoView a;
    private float b;
    private float c;
    private float d;
    private long e;
    private boolean f;
    private boolean g;

    public aht(PhotoView photoView) {
        this.a = photoView;
    }

    public void a(float f) {
        if (!this.f) {
            this.b = f;
            this.d = this.b / 500.0f;
            this.c = 0.0f;
            this.e = -1;
            this.g = false;
            this.f = true;
            this.a.post(this);
        }
    }

    public void a() {
        this.f = false;
        this.g = true;
    }

    public void run() {
        if (!this.g) {
            if (this.c != this.b) {
                long currentTimeMillis = System.currentTimeMillis();
                float f = ((float) (this.e != -1 ? currentTimeMillis - this.e : 0)) * this.d;
                if ((this.c < this.b && this.c + f > this.b) || (this.c > this.b && this.c + f < this.b)) {
                    f = this.b - this.c;
                }
                PhotoView photoView = this.a;
                photoView.e += f;
                photoView.a.postRotate(f, (float) (photoView.getWidth() / 2), (float) (photoView.getHeight() / 2));
                photoView.invalidate();
                this.c = f + this.c;
                if (this.c == this.b) {
                    a();
                }
                this.e = currentTimeMillis;
            }
            if (!this.g) {
                this.a.post(this);
            }
        }
    }
}
