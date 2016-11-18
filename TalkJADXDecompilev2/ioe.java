package defpackage;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;

final class ioe implements OnFrameAvailableListener {
    final /* synthetic */ iny a;

    ioe(iny iny) {
        this.a = iny;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.a.b.incrementAndGet();
        this.a.m.a(this.a);
    }
}
