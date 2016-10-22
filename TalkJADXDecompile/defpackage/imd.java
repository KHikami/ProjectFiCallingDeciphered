package defpackage;

import android.media.MediaFormat;
import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;

/* renamed from: imd */
public final class imd implements Runnable {
    final /* synthetic */ MediaFormat a;
    final /* synthetic */ MediaCodecDecoder b;

    public imd(MediaCodecDecoder mediaCodecDecoder, MediaFormat mediaFormat) {
        this.b = mediaCodecDecoder;
        this.a = mediaFormat;
    }

    public void run() {
        this.b.b.a(this.a);
    }
}
