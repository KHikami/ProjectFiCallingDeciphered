package p000;

import com.google.android.libraries.hangouts.video.internal.MediaCodecSimulcastEncoder;

public final class imq implements Runnable {
    final /* synthetic */ MediaCodecSimulcastEncoder f18079a;

    public imq(MediaCodecSimulcastEncoder mediaCodecSimulcastEncoder) {
        this.f18079a = mediaCodecSimulcastEncoder;
    }

    public void run() {
        this.f18079a.f8467i.evictAll();
        if (!this.f18079a.f8468j.isEmpty()) {
            itx.m23277a(5, "vclib", "Did not release all used encoder surfaces. Releasing now.");
            for (ikz c : this.f18079a.f8468j.values()) {
                c.m22219c();
            }
        }
    }
}
