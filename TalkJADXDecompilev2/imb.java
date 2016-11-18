package defpackage;

import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;

public final class imb implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ MediaCodecDecoder b;

    public imb(MediaCodecDecoder mediaCodecDecoder, int i) {
        this.b = mediaCodecDecoder;
        this.a = i;
    }

    public void run() {
        this.b.a = this.a;
        this.b.e.set(new irg(String.format("Decode(%s)", new Object[]{Integer.valueOf(this.b.a)})));
        this.b.j();
    }
}
