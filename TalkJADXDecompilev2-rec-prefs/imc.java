package p000;

import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;

public final class imc implements Runnable {
    final /* synthetic */ boolean f18026a;
    final /* synthetic */ MediaCodecDecoder f18027b;

    public imc(MediaCodecDecoder mediaCodecDecoder, boolean z) {
        this.f18027b = mediaCodecDecoder;
        this.f18026a = z;
    }

    public void run() {
        this.f18027b.f8437b.mo3270a();
    }
}
