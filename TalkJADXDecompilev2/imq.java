package defpackage;

import com.google.android.libraries.hangouts.video.internal.MediaCodecSimulcastEncoder;

public final class imq implements Runnable {
    final /* synthetic */ MediaCodecSimulcastEncoder a;

    public imq(MediaCodecSimulcastEncoder mediaCodecSimulcastEncoder) {
        this.a = mediaCodecSimulcastEncoder;
    }

    public void run() {
        this.a.i.evictAll();
        if (!this.a.j.isEmpty()) {
            itx.a(5, "vclib", "Did not release all used encoder surfaces. Releasing now.");
            for (ikz c : this.a.j.values()) {
                c.c();
            }
        }
    }
}
