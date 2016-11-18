package p000;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;

final class ioe implements OnFrameAvailableListener {
    final /* synthetic */ iny f18575a;

    ioe(iny iny) {
        this.f18575a = iny;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f18575a.f18208b.incrementAndGet();
        this.f18575a.m.m22231a(this.f18575a);
    }
}
