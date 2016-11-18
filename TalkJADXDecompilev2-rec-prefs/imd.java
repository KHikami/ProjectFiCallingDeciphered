package p000;

import android.media.MediaFormat;
import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;

public final class imd implements Runnable {
    final /* synthetic */ MediaFormat f18028a;
    final /* synthetic */ MediaCodecDecoder f18029b;

    public imd(MediaCodecDecoder mediaCodecDecoder, MediaFormat mediaFormat) {
        this.f18029b = mediaCodecDecoder;
        this.f18028a = mediaFormat;
    }

    public void run() {
        this.f18029b.f8437b.mo3272a(this.f18028a);
    }
}
