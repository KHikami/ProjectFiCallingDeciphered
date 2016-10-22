package defpackage;

import com.google.android.libraries.hangouts.video.internal.MediaCodecSimulcastEncoder;

/* renamed from: imt */
public final class imt implements Runnable {
    final /* synthetic */ MediaCodecSimulcastEncoder a;

    public imt(MediaCodecSimulcastEncoder mediaCodecSimulcastEncoder) {
        this.a = mediaCodecSimulcastEncoder;
    }

    public void run() {
        this.a.f();
        this.a.b.a(this.a.k);
    }
}
