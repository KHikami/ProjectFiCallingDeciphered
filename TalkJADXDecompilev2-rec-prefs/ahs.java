package p000;

import com.android.ex.photo.views.PhotoView;

public final class ahs implements Runnable {
    final /* synthetic */ PhotoView f820a;

    public ahs(PhotoView photoView) {
        this.f820a = photoView;
    }

    public void run() {
        float g = this.f820a.m8211g();
        if (g > this.f820a.f5879c) {
            float f = 1.0f / (1.0f - (this.f820a.f5879c / g));
            float f2 = 1.0f - f;
            float width = (float) (this.f820a.getWidth() / 2);
            float height = (float) (this.f820a.getHeight() / 2);
            float f3 = this.f820a.f5882f.left * f2;
            float f4 = this.f820a.f5882f.top * f2;
            float width2 = (((float) this.f820a.getWidth()) * f) + (this.f820a.f5882f.right * f2);
            float height2 = (f * ((float) this.f820a.getHeight())) + (f2 * this.f820a.f5882f.bottom);
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
            this.f820a.f5878b.m1354a(g, this.f820a.f5879c, f2, f);
        }
    }
}
