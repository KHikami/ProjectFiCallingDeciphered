package p000;

import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;

public final class ilz implements Runnable {
    final /* synthetic */ int f18017a;
    final /* synthetic */ MediaCodecDecoder f18018b;

    public ilz(MediaCodecDecoder mediaCodecDecoder, int i) {
        this.f18018b = mediaCodecDecoder;
        this.f18017a = i;
    }

    public void run() {
        this.f18018b.f8437b.mo3271a(this.f18017a);
    }
}
