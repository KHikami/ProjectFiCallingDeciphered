package defpackage;

import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;

/* renamed from: imc */
public final class imc implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ MediaCodecDecoder b;

    public imc(MediaCodecDecoder mediaCodecDecoder, boolean z) {
        this.b = mediaCodecDecoder;
        this.a = z;
    }

    public void run() {
        this.b.b.a();
    }
}
