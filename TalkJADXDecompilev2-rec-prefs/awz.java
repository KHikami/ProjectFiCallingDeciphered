package p000;

import android.graphics.Bitmap;
import java.io.IOException;

final class awz implements awp {
    private final aww f2460a;
    private final bal f2461b;

    public awz(aww aww, bal bal) {
        this.f2460a = aww;
        this.f2461b = bal;
    }

    public void mo400a() {
        this.f2460a.m4232a();
    }

    public void mo401a(ard ard, Bitmap bitmap) {
        IOException a = this.f2461b.m4672a();
        if (a != null) {
            if (bitmap != null) {
                ard.mo361a(bitmap);
            }
            throw a;
        }
    }
}
