package p000;

import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;

public final class imb implements Runnable {
    final /* synthetic */ int f18024a;
    final /* synthetic */ MediaCodecDecoder f18025b;

    public imb(MediaCodecDecoder mediaCodecDecoder, int i) {
        this.f18025b = mediaCodecDecoder;
        this.f18024a = i;
    }

    public void run() {
        this.f18025b.f8436a = this.f18024a;
        this.f18025b.f8440e.set(new irg(String.format("Decode(%s)", new Object[]{Integer.valueOf(this.f18025b.f8436a)})));
        this.f18025b.m10386j();
    }
}
