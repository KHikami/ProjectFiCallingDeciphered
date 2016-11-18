package p000;

import android.view.Surface;
import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;

public final class ima implements Runnable {
    final /* synthetic */ Surface f18021a;
    final /* synthetic */ Runnable f18022b;
    final /* synthetic */ MediaCodecDecoder f18023c;

    public ima(MediaCodecDecoder mediaCodecDecoder, Surface surface, Runnable runnable) {
        this.f18023c = mediaCodecDecoder;
        this.f18021a = surface;
        this.f18022b = runnable;
    }

    public void run() {
        if (this.f18021a == null || this.f18021a.isValid()) {
            this.f18023c.f8438c = this.f18021a;
        } else {
            itx.m23277a(5, "vclib", "MediaCodec decoder surface is invalid. Stopping decoder.");
            this.f18023c.f8438c = null;
        }
        this.f18023c.m10386j();
        if (this.f18022b != null) {
            gwb.m1863a(this.f18022b);
        }
    }
}
