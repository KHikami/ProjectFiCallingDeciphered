package defpackage;

import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;

/* renamed from: ilw */
public final class ilw implements Runnable {
    final /* synthetic */ MediaCodecDecoder a;

    public ilw(MediaCodecDecoder mediaCodecDecoder) {
        this.a = mediaCodecDecoder;
    }

    public void run() {
        this.a.j();
    }
}
