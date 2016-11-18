package p000;

import android.media.MediaFormat;
import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;

public final class ilv implements Runnable {
    final /* synthetic */ MediaFormat f18012a;
    final /* synthetic */ MediaCodecDecoder f18013b;

    public ilv(MediaCodecDecoder mediaCodecDecoder, MediaFormat mediaFormat) {
        this.f18013b = mediaCodecDecoder;
        this.f18012a = mediaFormat;
    }

    public void run() {
        this.f18013b.f8437b.mo3272a(this.f18012a);
    }
}
