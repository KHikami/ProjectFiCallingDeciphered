package defpackage;

import com.android.ex.photo.views.PhotoView;

public final class ahs implements Runnable {
    final /* synthetic */ PhotoView a;

    public ahs(PhotoView photoView) {
        this.a = photoView;
    }

    public void run() {
        float g = this.a.g();
        if (g > this.a.c) {
            float f = 1.0f / (1.0f - (this.a.c / g));
            float f2 = 1.0f - f;
            float width = (float) (this.a.getWidth() / 2);
            float height = (float) (this.a.getHeight() / 2);
            float f3 = this.a.f.left * f2;
            float f4 = this.a.f.top * f2;
            float width2 = (((float) this.a.getWidth()) * f) + (this.a.f.right * f2);
            float height2 = (f * ((float) this.a.getHeight())) + (f2 * this.a.f.bottom);
            if (width2 > f3) {
                f2 = (width2 + f3) / 2.0f;
            } else {
                f2 = Math.min(Math.max(width2, width), f3);
            }
            if (height2 > f4) {
                f = (height2 + f4) / 2.0f;
            } else {
                f = Math.min(Math.max(height2, height), f4);
            }
            this.a.b.a(g, this.a.c, f2, f);
        }
    }
}
