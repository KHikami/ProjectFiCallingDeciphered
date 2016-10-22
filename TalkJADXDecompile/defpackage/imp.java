package defpackage;

import com.google.android.libraries.hangouts.video.internal.MediaCodecSimulcastEncoder;

/* renamed from: imp */
public final class imp implements Runnable {
    final /* synthetic */ MediaCodecSimulcastEncoder a;

    public imp(MediaCodecSimulcastEncoder mediaCodecSimulcastEncoder) {
        this.a = mediaCodecSimulcastEncoder;
    }

    public void run() {
        this.a.g();
    }
}
