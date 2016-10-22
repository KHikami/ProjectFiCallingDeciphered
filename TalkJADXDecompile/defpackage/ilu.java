package defpackage;

import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;

/* renamed from: ilu */
public final class ilu implements Runnable {
    final /* synthetic */ MediaCodecDecoder a;

    public ilu(MediaCodecDecoder mediaCodecDecoder) {
        this.a = mediaCodecDecoder;
    }

    public void run() {
        this.a.b.a();
    }
}
