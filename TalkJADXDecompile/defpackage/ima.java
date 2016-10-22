package defpackage;

import android.view.Surface;
import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;

/* renamed from: ima */
public final class ima implements Runnable {
    final /* synthetic */ Surface a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ MediaCodecDecoder c;

    public ima(MediaCodecDecoder mediaCodecDecoder, Surface surface, Runnable runnable) {
        this.c = mediaCodecDecoder;
        this.a = surface;
        this.b = runnable;
    }

    public void run() {
        if (this.a == null || this.a.isValid()) {
            this.c.c = this.a;
        } else {
            itx.a(5, "vclib", "MediaCodec decoder surface is invalid. Stopping decoder.");
            this.c.c = null;
        }
        this.c.j();
        if (this.b != null) {
            gwb.a(this.b);
        }
    }
}
