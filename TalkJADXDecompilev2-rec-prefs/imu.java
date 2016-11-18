package p000;

import com.google.android.libraries.hangouts.video.internal.MediaCodecSimulcastEncoder;
import java.util.List;

public final class imu implements Runnable {
    final /* synthetic */ List f18083a;
    final /* synthetic */ MediaCodecSimulcastEncoder f18084b;

    public imu(MediaCodecSimulcastEncoder mediaCodecSimulcastEncoder, List list) {
        this.f18084b = mediaCodecSimulcastEncoder;
        this.f18083a = list;
    }

    public void run() {
        for (ikz c : this.f18083a) {
            c.m22219c();
        }
    }
}
