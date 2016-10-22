package defpackage;

import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;

/* renamed from: ilx */
public final class ilx implements Runnable {
    final /* synthetic */ MediaCodecDecoder a;

    public ilx(MediaCodecDecoder mediaCodecDecoder) {
        this.a = mediaCodecDecoder;
    }

    public void run() {
        this.a.k();
    }
}
